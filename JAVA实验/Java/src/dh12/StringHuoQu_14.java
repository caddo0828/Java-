package dh12;
//String�Ļ�ȡ����
public class StringHuoQu_14 {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "helloworld";
		
		//int length��ȡ�ַ�������
		System.out.println("s.length="+s.length());
		System.out.println("-------------------");
		
		//char CharAt(int index);��ȡָ������λ�õ��ַ�
		System.out.println("ָ������λ�õ��ַ�:  "+s.charAt(2));
		System.out.println("-------------------");

		//int indexOf(int ch);����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
		System.out.println("ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����: "+s.indexOf('a'));
		System.out.println("-------------------");

		//int indexOf(String str);  //����ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�����ֵ
		System.out.println("ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�����ֵ: "+s.indexOf("wo"));
		System.out.println("-------------------");
		
		//int indexOf(int ch,int fromIndex);//����ָ���ַ��ڴ��ַ�����ָ��λ�ú��һ�γ��ֵ�����λ��
        System.out.println("ָ���ַ��������￪ʼ���һ�γ��ֵ�����λ�ã� "+s.indexOf('o', 3));
 		System.out.println("-------------------");
 		
 		//String substring(int start)��//��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ����
 		System.out.println("��ָ��λ�ÿ�ʼ����ĩβ����  "+s.substring(2));
 		System.out.println("-------------------");
 		
 		//String substring(int start ,int end);//��ָ��λ�ÿ�ʼ��ָ����λ�ý���  
 		//[ x,y}��ʾx����ȡ��yȡ����
 		System.out.println("��ָ��λ�ÿ�ʼ��ָ��λ�ý���  :"+s.substring(0, 1));



	
	
	
	}

}
