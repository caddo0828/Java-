package ch8;
//If�ﲻ����break;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		//���������
		int number = (int)(Math.random()*100+1);
		
		while(true) {
			//����¼������
			System.out.println("������µ�����(0��100)");
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			if(x<number) {
				System.out.println("���ֲ�С��");
			}else if(x>number){
				System.out.println("���ֲ´���");
			}else {
				System.out.println("���ֶ���");
				break;
			}

		}
		
		
		
	}

}
