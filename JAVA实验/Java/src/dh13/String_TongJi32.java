package dh13;
/*ͳ�ƴ�����ĸ��д��Сд���Լ����ֵĴ���
 * 
 */

import java.util.Scanner;

public class String_TongJi32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫͳ�Ƶ��ַ���");
		String string = sc.nextLine();
		
		//����ͳ�Ʊ���
		int maxCase = 0;
		int minCase = 0;
		int digit = 0;
		
		char[] ch = string.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				maxCase++;
			}
			else if(Character.isLowerCase(ch[i])) {
				minCase++;
			}else if(Character.isDigit(ch[i])) {
				digit++;
			}
			
		}
		System.out.println("maxCase="+maxCase);
		System.out.println("minCase="+minCase);
		System.out.println("digit="+digit);
	}

}
