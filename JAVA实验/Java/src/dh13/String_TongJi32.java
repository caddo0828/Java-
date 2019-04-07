package dh13;
/*统计大串中字母大写，小写，以及数字的次数
 * 
 */

import java.util.Scanner;

public class String_TongJi32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要统计的字符串");
		String string = sc.nextLine();
		
		//定义统计变量
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
