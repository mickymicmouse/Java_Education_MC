package mc.sn.basic.ai.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mc.sn.basic.member.dao.MemberDAO;
import mc.sn.basic.member.vo.MemberVO;

@Service("aiService")
@Transactional(propagation = Propagation.REQUIRED)
public class AIServiceImpl implements AIService {

	@Override
	public String translate(String words) throws DataAccessException {
		// TODO Auto-generated method stub
		 StringBuffer res = null;
		 String clientId = "56t07ba7h3";//애플리케이션 클라이언트 아이디값";
	     String clientSecret = "gYXW7tSFH87HfuRvcouG4nZIRc1b3rjdkLJOPWTm";//애플리케이션 클라이언트 시크릿값";
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
	         if(responseCode==200) { // 정상 호출
	             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         } else {  // 오류 발생
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
