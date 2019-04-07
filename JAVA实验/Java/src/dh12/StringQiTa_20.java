package dh12;
/*String类大的其他功能
 *替换功能：
	String replace(char old ,  char new)
	String replace(String old,String new)
	
去除字符串空格：(只能去除两端的空格)
	String trim( );

按字典顺序比较两个字符串：
	int  compareTo(String str)
	int  compareToIgnoreCase(String str)

 */
public class StringQiTa_20 {
	public static void main(String[] args) {
		//替换功能   将一个字符换成另一个字符
		String s1 = "helloworld";
		String s2 = s1.replace('e', 'a');
		System.out.println("将一个字符换成另一个字符= "+s2);
		
		//替换功能     将一个字符串换成另一个字符串
		String s3 = s1.replace("world", "china");
		System.out.println("将一个字符串换成另一个字符串= "+s3);
		
		//去除字符串空格：(只能去除两端的空格)
		String s4 = "  helloworld  ";
		String s5 = s4.trim();
		System.out.println("去除(两端的空格)字符串空格 = "+s5);
		
		//按字典顺序比较两个字符串
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "HELLO";
		String s11 = "Abc";
		System.out.println(s6.compareTo(s7));//0
		System.out.println(s6.compareTo(s8));//7
		System.out.println(s6.compareTo(s9));//-16
		System.out.println("按字典顺序比较两个字符串,忽略大小写");
		System.out.println(s6.compareToIgnoreCase(s10));//0
		System.out.println(s6.compareToIgnoreCase(s11));//7
		
	}

}
