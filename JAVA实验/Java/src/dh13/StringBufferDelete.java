package dh13;
/*public StringBuffer deleteCharAt(int index) ; 
// ɾ��ָ��λ�õ��ַ�

public StringBuffer delete(int start ,int end)��
ɾ��ָ��λ�ÿ�ʼָ��λ�ý��������ݣ����ҷ��ر���
 * 
 */
public class StringBufferDelete {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("hello").append("word").append("java");
		
		System.out.println(buffer.deleteCharAt(1));
		System.out.println("buffer="+buffer.delete(0, buffer.length()));
		
	}

}
