package dh13;
/*StringBuffer���滻����
 * public StringBuffer replace(int start,int end,String str)
       ��ָ��λ�ÿ�ʼ��ָ��λ�ý�����str�滻 
 */
public class StringBufferReplace {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		//�������
		buffer.append("java").append("basic");
		//��se�滻��basic
		System.out.println(buffer.replace(4, 9,"se"));
	
		System.out.println(buffer.insert(2,'a'));
		
	}

}
