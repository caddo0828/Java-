package dh13;
/*StringBuffer�Ľ�ȡ����  (����ֵ���Ͳ�ͬ)
 * public String substring(int start);
 * public String substring(int start,int end);
 * 08
 */
public class StringBufferSubstring {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("java").append("basic");
		
		String s = buffer.substring(4);//����ȡ�����ݷ���String������
		System.out.println(s);
		System.out.println(buffer);//��Ϊ��ȡ�󷵻ص����Ͳ�ͬ�����Ա����ַ�������
		
		
		System.out.println();
		
		//��ȡ����
		String ss = buffer.substring(2, 4);
		System.out.println(ss);
		System.out.println(buffer);
	}
	
	
}
