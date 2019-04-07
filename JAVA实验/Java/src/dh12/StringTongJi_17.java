package dh12;
//键盘录入数据，统计一个字符串中的大写字母，小写字母，以及数字出现的次数
/*
 * int length();
 * char charAt(int index);
 */
import java.util.Scanner;

public class StringTongJi_17 {
	public static void main(String[] args) {
		////定义大写，小写，数字变量用于存值
		int maxCount = 0;
		int minCount = 0;
		int number = 0;
		
		//创建录入事件
		Scanner sc = new Scanner(System.in);
		//输入录入的对象
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
