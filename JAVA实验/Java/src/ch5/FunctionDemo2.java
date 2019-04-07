package ch5;

//void调用只能用方法名带参数使用，不能赋值以及输出调用
// printXing(10,10);
/*
 * 键盘录入输出星型
*/
import  java.util.Scanner;

public class FunctionDemo2 {
	public static void main(String[]args) {
		//printXing(6,7);
		//创建对象
		Scanner sc = new Scanner(System.in);
		//创建数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		//调用输出
		printXing(x,y);
		
		//输出对应乘法表
		printNN(5);
		
		//判断是否输入数值在1到9之间，满足则输出乘法表，反之提示错误
		printNN2(10);
		
	}
	
	public static void printXing(int m,int n) {
		 for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		 } 
	 }
	
	public static void printNN(int n) {
		for(int i=1;i<=n;i++) {
			if(n>9){
				System.out.println("输入有误");
				break;
			}
			for(int j=1;j<=n;j++) {
				if(n>9) {
					System.out.println("输入有误");
					break;
				}
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	public static void printNN2(int n) {
		if(n>=1&&n<=9) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}else {
			System.out.println("输入有误");
		}
	}
	  

}
