package dh12;
/*字符串反转
 * 例如：abc
 *   输出cba
 * 分析：
 *     1、键盘录入一个字符串
 *     2、定义一个新的字符串
 *     3、倒着遍历字符串，得到每一个字符
 *       A:length 和charAt() 结合遍历
 *       B:字符串转成字符数组
 *     4、用新的字符串进行拼接
 *     5、在输出新字符串
 *     
 */
import java.util.Scanner;

public class StringReverse_24 {
	public static void main(String[] args) {
//length 和charAt() 结合遍历
		//录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入字符串
		System.out.println("请输入要录入的字符串:");
		String s = sc.nextLine();
		
		//定义一个新的字符串
		String ss ="";
		
		//倒着遍历
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			ss += ch;
		}
		System.out.println(ss);
		
//字符串转成字符数组
		//录入对象
		Scanner sm = new Scanner(System.in);
				
		//录入字符串
		System.out.println("请输入要录入的字符串:");
		String s1 = sc.nextLine();
				
		//定义一个新的字符串
		String ss1 ="";
				
	    char[] ch = s1.toCharArray();
	    
	    for(int i=ch.length-1;i>=0;i--) {
	    	ss1 +=ch[i];
	    }
			 
	  System.out.println(ss1);
		
		
		
		
	}
	
	
	
	   

}
