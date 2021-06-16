package mc.sn.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.json.JSONObject;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �쓬�꽦�뙆�씪�쓣 �씫�뼱�꽌 �뀓�뒪�듃 �뙆�씪濡� 蹂�寃�
		String clientId = "";             // Application Client ID";
        String clientSecret = "";     // Application Client Secret";
        String result = "";
        String filePathName = "c:\\dev\\aifile\\voiceMsg.mp3";
        try {
            String imgFile = filePathName;
            File voiceFile = new File(imgFile);

            String language = "Kor";        // �뼵�뼱 肄붾뱶 ( Kor, Jpn, Eng, Chn )
            String apiURL = "https://naveropenapi.apigw.ntruss.com/recog/v1/stt?lang=" + language;
            URL url = new URL(apiURL);

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setUseCaches(false);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/octet-stream");
            conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
            conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);

            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(voiceFile);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
            inputStream.close();
            BufferedReader br = null;
            int responseCode = conn.getResponseCode();
            if(responseCode == 200) { // �젙�긽 �샇異�
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {  // �삤瑜� 諛쒖깮
                System.out.println("error!!!!!!! responseCode= " + responseCode);
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            String inputLine;

            if(br != null) {
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString()); //寃곌낵 異쒕젰 (JSON �삎�떇�쓽 臾몄옄�뿴)
                result = jsonToString(response.toString());
//                resultToFileSave(result);
                resultToFileSave2(result);
            } else {
                System.out.println("error !!!");
            }
            
            //voiceFile.delete(); //�뀓�뒪�듃濡� 蹂��솚�맂 �썑 �끃�쓬�맂 �쓬�꽦 �뙆�씪 �궘�젣
        } catch (Exception e) {
            System.out.println(e);
        }
	}
	
	public static void resultToFileSave2(String result) {
		String fileName = Long.valueOf(new Date().getTime()).toString();
		String filePathName = "c:/ai/" + "stt_" + fileName + ".txt";

		try {
			OutputStream os = new FileOutputStream(filePathName);
			byte[] bytes = result.getBytes();
			os.write(bytes);
			os.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String jsonToString(String jsonStr) {
		String resultText = "";
		
		try {
			JSONObject jsonObj = new JSONObject(jsonStr);
			resultText = (String)jsonObj.get("text");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultText;
	}

}
