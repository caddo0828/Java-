package dh13;
/*
 *String��StringBuffer��Ϊ�������ͷ��أ�
	1����������
	2���������ͣ����봴����Ӧ�Ķ���
		ע�⣺String���͵Ĳ���ת��ͻ���������һ����
		�����ص����ݲ���
 */
public class String_StringBuffer_canshu13 {
	public static void main(String[] args) {
		String s1 = "basic";
		String s2 = "java";
		System.out.println(s1+"-----"+s2);
		change(s1,s2);
		System.out.println(s1+"-----"+s2);
		
		System.out.println("StringBuffer����");
		
		StringBuffer buffer1 = new StringBuffer("basic");
		StringBuffer buffer2 = new StringBuffer("java");
		System.out.println(buffer1+"----"+buffer2);
		change(buffer1,buffer2);
		System.out.println(buffer1+"----"+buffer2);
		
	}

	public static void change(StringBuffer buffer1, StringBuffer buffer2) {
		buffer1 = buffer2;
		buffer2.append(buffer1);//ֻ�з���ʵ��Ż�ı䳣������
	}
	
	public static void change(String s1, String s2) {
		s1= s2;//�����иı䣬main��������
		s2 +=s1;//���������һ��
	}

}
