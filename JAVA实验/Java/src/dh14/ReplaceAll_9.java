package dh14;

import java.util.Arrays;

/*�滻���ܣ�
String���public String replaceAll(String regex, String replacement);
ע�⣺ ʹ�ø�����replacement �滻���ַ�������ƥ��������ʽ�����ַ���
*/
public class ReplaceAll_9 {
	public static void main(String[] args) {
		//����һ���ַ���
		String string ="caddo12345javaandweb";
		//�����µĴ������滻����ַ���
		String string2 = string.replaceAll("\\d+", "*");
		//ע��\\d+  �� "*" ��ʾ��������һ�λ�һ�������滻һ��*��ԭ�ַ���
		//   \\d , "*" ��ʾ���ֳ���һ�ξ��滻һ��*��ԭ�ַ���
		System.out.println(string2);
		
		
		String s = "27 90 48 12 56";
		String[] sh =s.split(" ");//�Կո�ָ��ַ���
		//���ַ�������int����
		int[] arr =new int[sh.length];
		//�����ַ����飬ת��int��������
		for(int i=0;i<sh.length;i++) {
			arr[i] = Integer.parseInt(sh[i]);
		}
		//����
		Arrays.sort(arr);  // Ĭ������
		//�ӿո�
		StringBuffer buffer = new StringBuffer();
		for(int j=0;j<arr.length;j++) {
			buffer.append(arr[j]).append(" "); //���һ�����ݼ����˿ո�
		}

		//toString ��StringBuffer ����String����   
		//StringBuffer��  public String trim��������ȥ���ַ�����β�ո�
		String result = buffer.toString().trim();
		System.out.println(result);

	}

}
