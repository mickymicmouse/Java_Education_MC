package mc.sn.day9;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFile tf = new TestFile();
		try {
			tf.connectFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public void connectFile() throws IOException {  // \t
		//File 인스턴스 만드시오
		//파일에 접속해서 파일안의 문자열을 할줄씩 읽어서 출력한다.
		File file = new File("c:\\dev\\data\\Abc1115.csv");
		if(file.exists()) {
			System.out.println(file.getName()+" 이 존재합니다.");
			//FileReader 인스턴스를 만드시오
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;                 // 바이트스트림일 경우에는 -1이 파일의 끝을 의미 
			while((line=br.readLine())!=null) { // null --> 파일의 끝이다. 
				System.out.println(line);
				break;
			}
			br.close();
			fr.close();
		} else {
			System.out.println("파일이 존재 하지 않습니다.");
		}
	}

}
