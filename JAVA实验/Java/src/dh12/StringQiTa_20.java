package dh12;
/*String������������
 *�滻���ܣ�
	String replace(char old ,  char new)
	String replace(String old,String new)
	
ȥ���ַ����ո�(ֻ��ȥ�����˵Ŀո�)
	String trim( );

���ֵ�˳��Ƚ������ַ�����
	int  compareTo(String str)
	int  compareToIgnoreCase(String str)

 */
public class StringQiTa_20 {
	public static void main(String[] args) {
		//�滻����   ��һ���ַ�������һ���ַ�
		String s1 = "helloworld";
		String s2 = s1.replace('e', 'a');
		System.out.println("��һ���ַ�������һ���ַ�= "+s2);
		
		//�滻����     ��һ���ַ���������һ���ַ���
		String s3 = s1.replace("world", "china");
		System.out.println("��һ���ַ���������һ���ַ���= "+s3);
		
		//ȥ���ַ����ո�(ֻ��ȥ�����˵Ŀո�)
		String s4 = "  helloworld  ";
		String s5 = s4.trim();
		System.out.println("ȥ��(���˵Ŀո�)�ַ����ո� = "+s5);
		
		//���ֵ�˳��Ƚ������ַ���
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "HELLO";
		String s11 = "Abc";
		System.out.println(s6.compareTo(s7));//0
		System.out.println(s6.compareTo(s8));//7
		System.out.println(s6.compareTo(s9));//-16
		System.out.println("���ֵ�˳��Ƚ������ַ���,���Դ�Сд");
		System.out.println(s6.compareToIgnoreCase(s10));//0
		System.out.println(s6.compareToIgnoreCase(s11));//7
		
	}

}
