package dh14;

import java.util.Scanner;

/*У������
 *������ʽ�жϹ���
 */
public class Matches_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ����У������䣺");
		String string = sc.nextLine();
		
		System.out.println(matchesEmailID(string));
		
	}
	
	public static boolean matchesEmailID(String string) {
	/*	String regex ="\\w{10}@[a-zA-Z]{2,6}\\.[a-zA-z]{2,3}";
		boolean b = string.matches(regex);
		return b;   */
		return string.matches("\\w{10}@[a-zA-Z]{2,6}\\.[a-zA-z]{2,3}");
	}
	
}
