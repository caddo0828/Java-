package dh14;

import java.util.Scanner;

/*��ȡ���ⷶΧ�ڵ������
 */
public class Random_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ʼ��Χ��");
		int start = sc.nextInt();
		System.out.println("������ĩβ��Χֵ��");
		int end = sc.nextInt();
		
		for(int i=0;i<100;i++) {
			int result = (int)(Math.random()*(end-start+1))+start;
			System.out.println(result);
		}
		
	}

}
