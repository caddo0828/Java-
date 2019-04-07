package ch1;

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		//键盘录入数据
		Scanner sc = new Scanner(System.in);
        //敲入x的值
		System.out.println("请输入x的值：");
		int x = sc.nextInt();
        //定义一个y
		int y=0;
		//进行判断
        if(x>=3) {
        	y = 2*x+1;
        	System.out.println(y);
        }else if(x<=-1&&x<3) {
        	y = 2*x;
        	System.out.println(y);
        }else if(x<=-1) {
        	y = 2*x-1;
        	System.out.println(y);
        }
   
	
	}

}
