package dh13;

import java.util.Scanner;

/*
 * �ж��ַ����Ƿ�Գ�
 * 1�������ַ��������ַ�������ת��������
 * 2�������ж�
 * 3��
 * 
 */
public class StringBufferReverse_11 {
	public static void main(String[] args) {
		//����¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ��ַ���:");
		String string = sc.nextLine();
		
		//��������
		boolean b =isSame(string);
		System.out.println("�ж��Ƿ�Գƽ��Ϊ��"+b);
		
	}
	
	//����ʵ��
	public static boolean isSame(String s) {
		boolean flag = true;
		//���ַ���ת�����ַ�����
		char[] arr = s.toCharArray();
		
		//����
		for(int start=0,end = arr.length-1;start<=end;start++,end--) {
			if(arr[start]!=arr[end]) {
				flag = false;
				break;
			}
		}
		
		return flag;
		
	}

}
