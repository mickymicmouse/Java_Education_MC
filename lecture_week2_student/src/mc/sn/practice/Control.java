package mc.sn.practice;

import java.util.Scanner;

public class Control implements RemoteControl {
	public static int volume = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control c = new Control();
		c.turnOn();
		c.setVolume();
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("꺼졌습니다.");
	}

	@Override
	
	public void setVolume() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("볼륨값을 입력해주세요.");
		int v = sc.nextInt();
		if (v>RemoteControl.MAX_VOLUME) {
			System.out.println("볼륨값이 너무 큽니다.");
			setVolume();
		} else if(v<RemoteControl.MIN_VOLUME) {
			System.out.println("볼륨값이 너무 작습니다.");
			setVolume();
		}else {
			System.out.printf("볼륨을 %d 로 설정합니다.",v);
			System.out.println();
			volume = v;
			
		}
	}

}
