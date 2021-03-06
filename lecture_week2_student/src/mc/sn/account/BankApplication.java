package mc.sn.account;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4){
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("시스템 종료");
		
	}
	private static void createAccount() {
		System.out.print("계좌를 입력하세요: ");
		String ano = sc.next();
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		Account acc = findAccount(ano, name);
		if (acc == null) {
			System.out.println("계좌를 생성하겠습니다.");
			Account newAccount = new Account(ano, name);
			accountArray[i]=newAccount;
			i++;
		}else {
			System.out.println("계좌가 존재합니다.");
			createAccount();
		}
		
	}
	private static void accountList() {

		for(int k = 0; k<accountArray.length; k++) {
			if (accountArray[k]==null) {
				break;
			}
			System.out.println(accountArray[k].getAno()+", "+accountArray[k].getOwner());
		}
	}
	private static void deposit() {
		System.out.print("계좌를 입력하세요: ");
		String ano = sc.next();
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		Account acc = findAccount(ano, name);
		if (acc==null) {
			System.out.println("계좌가 없습니다, 다시 입력하세요");
			deposit();
		} else {
			System.out.println("예금 비용을 입력하세요.");
			int a = sc.nextInt();
			acc.setBalance(a);
			System.out.println(a+"원을 예금하겠습니다.");
			System.out.println("잔여 비용 : "+acc.getBalance());
		}
	}
	private static void withdraw() {
		System.out.print("계좌를 입력하세요: ");
		String ano = sc.next();
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		Account acc = findAccount(ano, name);
		if (acc==null) {
			System.out.println("계좌가 없습니다, 다시 입력하세요");
			deposit();
		} else {
			System.out.println("출금 비용을 입력하세요.");
			int a = sc.nextInt();
			if (a>acc.getBalance()) {
				System.out.println("계좌의 금액이 부족합니다.");
				System.out.println("잔여 비용 : "+acc.getBalance());
				
			}else {
				System.out.println(a+"원을 출금하겠습니다.");
				a*=(-1);
				acc.setBalance(a);
				System.out.println("잔여 계좌 : "+acc.getBalance());
			}
		}
	}
	
	private static Account findAccount(String ano, String name) {
		boolean exist = false;
		Account acc = null;
		for (int j=0; j<accountArray.length;j++) {
			if (accountArray[j]==null) {
				break;
			}else if (accountArray[j].getAno().equals(ano) && accountArray[j].getOwner().equals(name)) {
				exist = true;
				acc = accountArray[j];
				break;
			}
		}
		return acc;
	}
	
	

}
