package mc.sn.day10;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
			int q2 = gt.quiz2();
			gt.printAnswer(2, q2);
			int q3 = gt.quiz3();
			gt.printAnswer(3, q3);
			int q4 = gt.quiz4();
			gt.printAnswer(4, q4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printAnswer(int number, int answer) throws IOException{
		String fileName = "Ans"+number+".txt";
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);
		pw.close();
		fw.close();
		
	}
	
	public int quiz4() {
		//국어 + 점수 포인트의 합이 50이상인 자료의 건수 출력
		int count=0;
		for(StudentDTO dto : list) {
			int point = 0;
			if (dto.getMgrCode()=="A") {
				point = 5;
			}else if (dto.getMgrCode()=="B") {
				point = 15;
			}
			int score = dto.getKor()+point;
			if (score>=50) {
				count+=1;
			}
		}
		return count;
	}
	
	public int quiz3() {
	//영어 + 수학 점수의 합이 120이상인 자료에 대해 총점 누적합
		int sum=0;
		for(StudentDTO dto : list) {
			int score = dto.getEng() + dto.getMath();
			if (score>=120) {
				int point = 5;
				if (dto.getMgrCode().equals("B")) {
					point=15;
				} else if(dto.getMgrCode().equals("C")) {
					point=20;
				}
				sum=sum+point+dto.getTotal();
			}
		}
		return sum;
	}
	
	public int quiz2() {
		// 지역변수가 B이고, 국어 + 영어 점수가 최고인 점수를 출력
//		System.out.println(list.size());
		int max = 0;
		for (StudentDTO dto : list) {
			if (dto.getLocalCode().equals("B")){
				int score = dto.getKor() + dto.getEng();
				if(max< score) {
					max = score;
				}
			}
		}
		
		return max;
	}
	
	public void makeGisaData() throws IOException {
//		String temp = "990001, addx, 17, 29, 16, 46, 43, 154, C,A,C";
		File file = new File("data\\Abc1115.csv");
		if (file.exists()) {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				
				line = line.replace(" ", "");
				String[] data = line.split(",");
				StudentDTO dto = new StudentDTO();
				int i = Integer.parseInt(data[0]);
				dto.setStdNo(i);
				dto.setEmail(data[1]);
				i = Integer.parseInt(data[2]);
				dto.setKor(i);
				i = Integer.parseInt(data[3]);
				dto.setEng(i);
				i = Integer.parseInt(data[4]);
				dto.setMath(i);
				i = Integer.parseInt(data[5]);
				dto.setSci(i);
				i = Integer.parseInt(data[6]);
				dto.setHist(i);
				i = Integer.parseInt(data[7]);
				dto.setTotal(i);
				dto.setMgrCode(data[8]);
				dto.setAccPoint(data[9]);
				dto.setLocalCode(data[10]);
//				System.out.println(dto);
				list.add(dto);
			}
			br.close();
			fr.close();
		}
	}
}
