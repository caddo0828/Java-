package dh12;
//String类的判断方法
/*  boolean equals(Object obj);//比较字符串内容是否相同，区分大小写
	boolean equalsIgnoreScae(String str);//比较字符串内容是否相同，忽略大小写
	boolean contains(String str);//比较大字符串是否包含小字符串
	boolean stratWith(String str);//判断字符串是否以某个指定的字符串开头
	boolean endsWith(String str);//判断字符串是否以某个指定的字符串结尾
	boolean isEmpty();//判断字符串是否为空

 * 
 */

public class StringChoiceDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";
		//判断内容是否相同区分大小写
		System.out.println("equals  "+s1.equals(s2));
		System.out.println("equals  "+s1.equals(s3));
		
		System.out.println("equalsIgnoreCase:  "+s1.equalsIgnoreCase(s3));
		
		System.out.println("startsWith  "+s1.startsWith("hello"));
		//必须是连在一起的字符串次啊可以当成是包含
		System.out.println("contains:  "+s1.contains("world"));
		
		//判断是否为空
		System.out.println(s1.isEmpty());
	}

}
