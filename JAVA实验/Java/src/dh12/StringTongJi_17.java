package dh12;
//����¼�����ݣ�ͳ��һ���ַ����еĴ�д��ĸ��Сд��ĸ���Լ����ֳ��ֵĴ���
/*
 * int length();
 * char charAt(int index);
 */
import java.util.Scanner;

public class StringTongJi_17 {
	public static void main(String[] args) {
		////�����д��Сд�����ֱ������ڴ�ֵ
		int maxCount = 0;
		int minCount = 0;
		int number = 0;
		
		//����¼���¼�
		Scanner sc = new Scanner(System.in);
		//����¼��Ķ���
		String x = sc.nextLine();
		
		for(int i=0;i<x.length();i++) {
			char ch = x.charAt(i);
			if(ch>='0'&&ch<='9') {
				number ++;
			}else if(ch>='A'&&ch<='Z') {
				maxCount ++;
			}else if(ch>='a'&&ch<='z') {
				minCount ++;
			}
		}
		System.out.println("maxCount="+maxCount);
		System.out.println("minCount="+minCount);
		System.out.println("number="+number);
	}

}
