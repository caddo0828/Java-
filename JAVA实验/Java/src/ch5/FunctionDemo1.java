package ch5;
//8
import java.util.Scanner;

public class FunctionDemo1 {
	public static void main(String[] args) {
		//��ֵ���͵������
	   int y=10,x=10;
	   int s=sum(x,y);
	   System.out.println(s);
	   //�ڶ������
	   System.out.println(sum(10,10));
	
	   
	   System.out.println("������������������������");
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("�����һ������:");
	   int m = sc.nextInt();
	   System.out.println("����ڶ�������:");
	   int n = sc.nextInt();
	   System.out.println("���������������:");
	   int p = sc.nextInt();
	   
	   System.out.println(sum(m,n));
	   
	   System.out.println("************");
	   
	   boolean flag = compare(m,n);
	   System.out.println(flag);
	  
	   
	   System.out.println("���ֵΪ��"+max(m,n,p));
	   
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
		//��Ԫ�Ľ�
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
