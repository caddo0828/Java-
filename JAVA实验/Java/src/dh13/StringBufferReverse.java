package dh13;
/*StringBuffer的反转功能
 *public StringBuffer reverse(); 
 */
public class StringBufferReverse {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("java").append("web");
		
		System.out.println("翻转后： "+buffer.reverse());
	}
	

}
