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
		//File �ν��Ͻ� ����ÿ�
		//���Ͽ� �����ؼ� ���Ͼ��� ���ڿ��� ���پ� �о ����Ѵ�.
		File file = new File("c:\\dev\\data\\Abc1115.csv");
		if(file.exists()) {
			System.out.println(file.getName()+" �� �����մϴ�.");
			//FileReader �ν��Ͻ��� ����ÿ�
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;                 // ����Ʈ��Ʈ���� ��쿡�� -1�� ������ ���� �ǹ� 
			while((line=br.readLine())!=null) { // null --> ������ ���̴�. 
				System.out.println(line);
				break;
			}
			br.close();
			fr.close();
		} else {
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
		}
	}

}
