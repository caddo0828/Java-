package dh12;
/*�ַ�����ת
 * ���磺abc
 *   ���cba
 * ������
 *     1������¼��һ���ַ���
 *     2������һ���µ��ַ���
 *     3�����ű����ַ������õ�ÿһ���ַ�
 *       A:length ��charAt() ��ϱ���
 *       B:�ַ���ת���ַ�����
 *     4�����µ��ַ�������ƴ��
 *     5����������ַ���
 *     
 */
import java.util.Scanner;

public class StringReverse_24 {
	public static void main(String[] args) {
//length ��charAt() ��ϱ���
		//¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼���ַ���
		System.out.println("������Ҫ¼����ַ���:");
		String s = sc.nextLine();
		
		//����һ���µ��ַ���
		String ss ="";
		
		//���ű���
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			ss += ch;
		}
		System.out.println(ss);
		
//�ַ���ת���ַ�����
		//¼�����
		Scanner sm = new Scanner(System.in);
				
		//¼���ַ���
		System.out.println("������Ҫ¼����ַ���:");
		String s1 = sc.nextLine();
				
		//����һ���µ��ַ���
		String ss1 ="";
				
	    char[] ch = s1.toCharArray();
	    
	    for(int i=ch.length-1;i>=0;i--) {
	    	ss1 +=ch[i];
	    }
			 
	  System.out.println(ss1);
		
		
		
		
	}
	
	
	
	   

}
