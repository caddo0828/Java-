package dh12;
/*String��ת������
 *  byte[ ]  getBytes( )��//���ַ���ת�����ֽ�����
	char[ ]  toCharArray();//���ַ����ı���ַ�����
	static   String valueOf(char[] chs);//���ַ�����ת�����ַ���
	static String valueOf(int  i) ;//��int���͵�����ת�����ַ���
		ע�⣺String���͵�valueOf�ܰ��������͵�����ת�����ַ���
	String  toLowerCase( );//���ַ���ȫ�����Сд
	String toUpperCase( );//���ַ���ȫ����ɴ�д
	String concat(String str);// ���ַ�������ƴ��
 * 
 */

public class StringZhuanHuan_18 {
	public static void main(String[] args) {
		//����һ���ַ���
		String s ="JavaSE";
		
		//���ַ�������ֽ����飬���ұ������
		byte[] bytes = s.getBytes();
		for(int i=0;i<bytes.length;i++) {
			System.out.print(bytes[i]+" ");
		}
		System.out.println();
		//���ַ����ı���ַ�����
		char[] array = s.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.print("array[]= "+array[i]+" ");
		}
		System.out.println();
		//���ַ�����ת�����ַ���
		String ss = String.valueOf(array);
		System.out.println("ss= "+ss);
		
		//��int���͵�����ת�����ַ���
		String m = String.valueOf(97);
		System.out.println("m= "+m);
		
		//���ַ���ȫ�����Сд
		String n = s.toLowerCase();
		System.out.println("���Сд����ַ���= "+n);
		
		//���ַ���ȫ����ɴ�д
		String o = s.toUpperCase();
		System.out.println("��ɴ�д����ַ���= "+o);
		
		// ���ַ�������ƴ��
		String str = "basic";
		String p = s.concat(str);
		System.out.println("ƴ�Ӻ���ַ���= "+p);
	}

}
