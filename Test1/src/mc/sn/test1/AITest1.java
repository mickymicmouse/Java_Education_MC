package mc.sn.test1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;


public class AITest1 {

	public static void main(String[] args) {
		String res = null;
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		try {
			res = nmt(word);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
	}
	
	public static String nmt(String words) throws Exception {
		// TODO Auto-generated method stub
		 String result = null;
		 result = translate(words);		
	
		return result;
	}
	
	public static String translate(String words) {
		// TODO Auto-generated method stub
		 StringBuffer res = null;
		 String clientId = "56t07ba7h3";//�븷�뵆由ъ��씠�뀡 �겢�씪�씠�뼵�듃 �븘�씠�뵒媛�";
	     String clientSecret = "gYXW7tSFH87HfuRvcouG4nZIRc1b3rjdkLJOPWTm";//�븷�뵆由ъ��씠�뀡 �겢�씪�씠�뼵�듃 �떆�겕由욧컪";
	     try {
	         String text = URLEncoder.encode(words, "UTF-8");
	         String apiURL = "https://naveropenapi.apigw.ntruss.com/nmt/v1/translation";
	         URL url = new URL(apiURL);
	         HttpURLConnection con = (HttpURLConnection)url.openConnection();
	         con.setRequestMethod("POST");
	         con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
	         con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
	         // post request
	         String postParams = "source=ko&target=en&text=" + text;
	         con.setDoOutput(true);
	         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	         wr.writeBytes(postParams);
	         wr.flush();
	         wr.close();
	         int responseCode = con.getResponseCode();
	         BufferedReader br;
	         if(responseCode==200) { // �젙�긽 �샇異�
	             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         } else {  // �삤瑜� 諛쒖깮
	             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	         }
	         String inputLine;
	         res = new StringBuffer();
	         while ((inputLine = br.readLine()) != null) {
	             res.append(inputLine);
	         }
	         br.close();
	         System.out.println("service "+res.toString());
	     } catch (Exception e) {
	         System.out.println(e);
	     }
		
	
		return res.toString();
	}
	
}
