package dh12;

import java.util.Scanner;

public class GuessNumberGame {
	//����Ϊstatic,����������ֱ�ӷ��ʷ���
	public static void start() {
		//����һ����1��100�������
		int x = (int)(Math.random()*100+1);
		
		Scanner sc = new Scanner(System.in);
		
		//����¼�����²�Ķ���
		while(true){
			int guessNumber= sc.nextInt();
		if(guessNumber>x) {
			System.out.println("������ֵ����");
		}else if(guessNumber<x) {
			System.out.println("���µ���ֵС��");
		}else {
			System.out.println("��ϲ���¶���");
			break;
		}
	}
		
	}
	

}
