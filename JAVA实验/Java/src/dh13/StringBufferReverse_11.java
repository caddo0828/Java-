package dh13;

import java.util.Scanner;

/*
 * 判断字符串是否对称
 * 1、定义字符串，将字符串进行转换成数组
 * 2、遍历判断
 * 3、
 * 
 */
public class StringBufferReverse_11 {
	public static void main(String[] args) {
		//键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要判断的字符串:");
		String string = sc.nextLine();
		
		//方法调用
		boolean b =isSame(string);
		System.out.println("判断是否对称结果为："+b);
		
	}
	
	//方法实现
	public static boolean isSame(String s) {
		boolean flag = true;
		//将字符串转换成字符数组
		char[] arr = s.toCharArray();
		
		//遍历
		for(int start=0,end = arr.length-1;start<=end;start++,end--) {
			if(arr[start]!=arr[end]) {
				flag = false;
				break;
			}
		}
		
		return flag;
		
	}

}
