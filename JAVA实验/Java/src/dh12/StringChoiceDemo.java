package dh12;
//String����жϷ���
/*  boolean equals(Object obj);//�Ƚ��ַ��������Ƿ���ͬ�����ִ�Сд
	boolean equalsIgnoreScae(String str);//�Ƚ��ַ��������Ƿ���ͬ�����Դ�Сд
	boolean contains(String str);//�Ƚϴ��ַ����Ƿ����С�ַ���
	boolean stratWith(String str);//�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
	boolean endsWith(String str);//�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
	boolean isEmpty();//�ж��ַ����Ƿ�Ϊ��

 * 
 */

public class StringChoiceDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";
		//�ж������Ƿ���ͬ���ִ�Сд
		System.out.println("equals  "+s1.equals(s2));
		System.out.println("equals  "+s1.equals(s3));
		
		System.out.println("equalsIgnoreCase:  "+s1.equalsIgnoreCase(s3));
		
		System.out.println("startsWith  "+s1.startsWith("hello"));
		//����������һ����ַ����ΰ����Ե����ǰ���
		System.out.println("contains:  "+s1.contains("world"));
		
		//�ж��Ƿ�Ϊ��
		System.out.println(s1.isEmpty());
	}

}
