package dh12;
//09
//String ��Ĺ��췽��
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);//����δ��ֵ������Ҳδ����д�������ֵ
		System.out.println(s1.length());
		System.out.println("-----------------");
		
		//���ֽ�����ת�����ַ���
		byte[] bye = {97,98,99,100,101};
		String s2 = new String(bye);
		System.out.println("s2:"+s2);
		System.out.println(s2.length());
		
		System.out.println("-----------------");
		
		//���ֽ������һ����ת�����ַ���
		byte[] byt = {97,98,99,100,101};
		String s3 = new String(byt,1,3);
		System.out.println("s3="+s3);
		System.out.println(s3.length());
		
		System.out.println("-----------------");
		
		//���ַ�������ֵת�����ַ���
		String original  = "����й�";
		String s4 = new String(original);
		System.out.println(s4);
		
		//���ַ�����ת�����ַ���
		char[] varlue = {'a','b','c','d','e','f'};
		String s5 = new String(varlue);
		System.out.println("s5="+s5);
		
	}

}
