package mc.sn.day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GisaTest {
	private ArrayList<StudentDTO> list;
	
	public GisaTest() {
		list = new ArrayList<StudentDTO>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GisaTest gt = new GisaTest();
		try {
			gt.makeGisaData();
			int answer = gt.quiz3();
			gt.quiz2();
			gt.quiz4();
			//gt.printAnswer(3, answer);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void printAnswer(int number,int answer) throws IOException {
		String fileName = "Ans"+number+".txt";
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);
		pw.close();
		fw.close();
	}	
	// ����3���� �ڵ带 �����Ͽ� 4���� Ǯ�����
	public int quiz4() {
		// ���뵵�� A . B�� �ڷῡ ���� ��������+ ��������Ʈ�� �հ谡 50�̻��� �Ǽ��� ���Ͻÿ�	
		int count  = 0;
		for (StudentDTO dto : list) {
			if(dto.getAccPoint().equals("A")||dto.getAccPoint().equals("B")) {
				int point =5; //A
				if (dto.getLocalCode().equals("B")) {
					point = 10;
				} else if(dto.getLocalCode().equals("C")) {
					point = 15;
				}				
				if(dto.getKor()+point>=50) {
					count++;
				}
			}
		}
		System.out.println("answer4 is "+count);
		return count;
	}
	
	public int quiz3() {
		// ���� + ���� ������ ���� 120�� �̻��� �ڷῡ ���� ����+ ��������Ʈ�� �հ踦 ���Ͻÿ�
		// 4�� 20�б��� �ڵ带 �ۼ��ϼ���
		int total  = 0;
		for (StudentDTO dto : list) {
			int sum = dto.getEng()+dto.getMath();
			if(sum>=120) {
				int point = 5; //A
				if (dto.getMgrCode().equals("B")) {
					point = 15;
				} else if(dto.getMgrCode().equals("C")) {
					point = 20;
				} 
				total = total + (dto.getTotal()+point);
			}
		}
		System.out.println("answer3 is "+total);
		return total;
	}
	
	public void quiz2() {
		System.out.println(list.size());
		// ���������� B�̰� ����+���������� �ְ��� ������ ����Ͻÿ� (max�� ���ϱ�)
		// 3�� 30�б���
		StudentDTO tempDTO = list.get(0);
		int max = tempDTO.getKor()+tempDTO.getEng();
		for(StudentDTO dto : list) {
			if(dto.getLocalCode().equals("B")) {
				int score = dto.getEng()+dto.getKor();
				if(max < score) {
					max = score;
				}
			}
		}
		System.out.println("answer2 is "+max);
	}
	
	public void makeGisaData() throws NumberFormatException, IOException {
		//���Ͽ� �����ؼ� �ش� ���� �о�ͼ� �Ʒ��� ���� �и��ؼ� ����Ʈ ����
		File file = new File("data\\Abc1115.csv");
		if(file.exists()) {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//990001,addx, 17, 29, 16, 49, 43,154,C,A,C
				String temp = line;//"990001,addx, 17, 29, 16, 49, 43,154,C,A,C";
				//���� ��Ʈ���� ,�� �и��Ͽ� StudentDTO �ν��Ͻ��� �ϳ� �����ϰ�
				//������ �ν��Ͻ��� ����Ͽ� ������ �ڷᰡ ����� ������ Ȯ���ϴ� �ڵ� ����
				//2��20�б��� �ϼ���.
				String[] data = temp.split(",");
				StudentDTO dto = new StudentDTO();
				int i = Integer.parseInt(data[0]);
				dto.setStdNo(i);
				//990001�� int������ �ٲپ�� �Ѵ� --> ���?
				dto.setEmail(data[1]);
				i = Integer.parseInt(data[2].trim());
				dto.setKor(i);
				dto.setEng(Integer.parseInt(data[3].trim()));
				dto.setMath(Integer.parseInt(data[4].trim()));
				dto.setSci(Integer.parseInt(data[5].trim()));
				dto.setHist(Integer.parseInt(data[6].trim()));
				dto.setTotal(Integer.parseInt(data[7].trim()));
				dto.setMgrCode(data[8]);
				dto.setAccPoint(data[9]);
				dto.setLocalCode(data[10]);
				//System.out.println(dto);
				list.add(dto);
			}
			br.close();
			fr.close();
		}
	}

}
