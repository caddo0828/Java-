package dh13;
/*StringBuffer的截取功能  (返回值类型不同)
 * public String substring(int start);
 * public String substring(int start,int end);
 * 08
 */
public class StringBufferSubstring {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("java").append("basic");
		
		String s = buffer.substring(4);//将截取的内容放在String类型中
		System.out.println(s);
		System.out.println(buffer);//因为截取后返回的类型不同，所以本身字符串不变
		
		
		System.out.println();
		
		//截取部分
		String ss = buffer.substring(2, 4);
		System.out.println(ss);
		System.out.println(buffer);
	}
	
	
}
