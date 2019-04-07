package ch5;
//8
import java.util.Scanner;

public class FunctionDemo1 {
	public static void main(String[] args) {
		//赋值类型调用输出
	   int y=10,x=10;
	   int s=sum(x,y);
	   System.out.println(s);
	   //第二种输出
	   System.out.println(sum(10,10));
	
	   
	   System.out.println("————————————");
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("输入第一个数据:");
	   int m = sc.nextInt();
	   System.out.println("输入第二个数据:");
	   int n = sc.nextInt();
	   System.out.println("请输入第三个数据:");
	   int p = sc.nextInt();
	   
	   System.out.println(sum(m,n));
	   
	   System.out.println("************");
	   
	   boolean flag = compare(m,n);
	   System.out.println(flag);
	  
	   
	   System.out.println("最大值为："+max(m,n,p));
	   
	}
	
	public static int sum(int a,int b) {
		int max=0;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		return max;
	}
	
	public static boolean compare(int a,int b) {
		//三元改进
		return (a==b) ? true : false;
	}
	
	public static int max(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}
		else {
			if(b>c) {
				return b;	
			}else {
				return c;
			}
 		}
	}
}
