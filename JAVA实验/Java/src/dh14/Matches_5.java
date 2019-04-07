package dh14;

import java.util.Scanner;

/*校验邮箱
 *正则表达式判断功能
 */
public class Matches_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要进行校验的邮箱：");
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
