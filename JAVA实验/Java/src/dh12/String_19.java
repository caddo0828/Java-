package dh12;
/*���ַ�������ĸ���д�д����������Сд
 *ע�⣺������ĸ��Сдת���ı������ַ����Ĳ���
 *	���ý�ȡ�ַ��������ַ�����ʽ����  String substring����
 *	���д�Сд��ĸת��
 *	ƴ�� 
 */
public class String_19 {
	public static void main(String[] args) {
		//�����ַ���
		String s = "helloWORLD";
		
		//�����ַ����Ľ�ȡ
		String s1 = s.substring(0, 1);
		
		String s2 = s.substring(1);
		
		//��Сдת��
		String s3 = s1.toUpperCase();
		
		String s4 = s2.toLowerCase();
		
		//ƴ���ַ���
		String ss = s3.concat(s4);
		
		System.out.println("ת������ַ���= "+ss);
		
		//�Ż���ĳ���
		String result = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println("result= "+result);
	}

}
