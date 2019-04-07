package dh13;
/*
 * String与StringBuffer的转换
 */
public class String_StringBuffer {
	public static void main(String[] args) {
		String s = "java";
		
		//1、构造方法
		StringBuffer buffer = new StringBuffer(s);
		
		System.out.println("转换类型后的字符串"+buffer);
		
		
		System.out.println();
		//2、append方法
		buffer.append(s);
		System.out.println(buffer);
		
		//StringBuffer--String
		//1、构造方法
		StringBuffer ss = new StringBuffer("javase");
		String ss1 = new String(ss);
		
		
		//2、tostring方法
		String string = ss.toString();
		System.out.println(string);
		
		
	}

}
