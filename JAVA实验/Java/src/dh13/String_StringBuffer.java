package dh13;
/*
 * String��StringBuffer��ת��
 */
public class String_StringBuffer {
	public static void main(String[] args) {
		String s = "java";
		
		//1�����췽��
		StringBuffer buffer = new StringBuffer(s);
		
		System.out.println("ת�����ͺ���ַ���"+buffer);
		
		
		System.out.println();
		//2��append����
		buffer.append(s);
		System.out.println(buffer);
		
		//StringBuffer--String
		//1�����췽��
		StringBuffer ss = new StringBuffer("javase");
		String ss1 = new String(ss);
		
		
		//2��tostring����
		String string = ss.toString();
		System.out.println(string);
		
		
	}

}
