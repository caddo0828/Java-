package dh12;

import java.util.Scanner;
/*
 * ������ʽ��
 * 	public boolean hasNextxxx();�ж��Ƿ���ĳ�����͵�����
 * 	public xxx   nextXxx();��ȡ��Ԫ��
 * 
 * public int nxtInt();
 * public String nextLine();����string���͵�����
 * 
 * �Ȼ�ȡһ����ֵ�ڻ�ȡһ���ַ������س�Ĭ�ϸ������ݸ�String����
 * 
 */

public class Scanner_hashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  
		if(sc.hasNextInt()) {
			int x = sc.nextInt();
	        System.out.println("x = "+x);
		}else {
			System.out.println("��������!");
		}
	}

}
