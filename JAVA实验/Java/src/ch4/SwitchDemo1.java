package ch4;

//���ݼ���¼������������ڼ�
import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String [] args) {
		//�������� ¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ������");
		int x = sc.nextInt();
		
		switch(x){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
		case 7:
			System.out.println("��ĩ����");
			break;
		default:
			System.out.println("�������ݴ���");
			break;
				
		}
	}

}
