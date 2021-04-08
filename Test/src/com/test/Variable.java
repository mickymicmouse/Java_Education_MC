package com.test;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b = 10.5;
		double c = a+b;
		// 형변환이 더 큰 변수로 계산됨
		int d = (int)(a+b);
		// int라는 변수로 강제 형변환 한 경우
		System.out.print(c);
		
		//참조 타입은 값을 하나 이상 넣을 수 있다.
		//변수 선언, 초기화, 조회, 삭제
		//한번쓰고 안쓸 변수는 지역변수로 하면 된다.
	}

}
