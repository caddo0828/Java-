package ch1;

//ʵ�ּ���¼������
//�����ж��������е������
//���ж�������Ƿ�Ϊ����
import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		System.out.println("��������������ݣ�");
		int z = sc.nextInt();
		
	//	int m = 0,max = 0;
	/*	if(x>y) {
			m = x;
		}else {
			m = y;
		}
		if(m>z){
			max = m;
			System.out.println("���ֵΪ��"+max);
		}else {
			max = z;
			System.out.println("���ֵΪ��"+max);
		}
		*/
		
/*		int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("���ֵΪ��"+max);
	*/
		int max = 0;
		if(x>y) {
			if(x>z) {
				max = x;
			}else {
				max = z;
			}
		}else {
			if(y>z) {
				max = y;
			}else {
				max =z;
			}
		}System.out.println(max);
		
		boolean flag = true;//������
		if(max%2==0) {
			flag = false;
		}System.out.println(flag);
	}

}
