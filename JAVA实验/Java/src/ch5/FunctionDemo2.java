package ch5;

//void����ֻ���÷�����������ʹ�ã����ܸ�ֵ�Լ��������
// printXing(10,10);
/*
 * ����¼���������
*/
import  java.util.Scanner;

public class FunctionDemo2 {
	public static void main(String[]args) {
		//printXing(6,7);
		//��������
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		//�������
		printXing(x,y);
		
		//�����Ӧ�˷���
		printNN(5);
		
		//�ж��Ƿ�������ֵ��1��9֮�䣬����������˷�����֮��ʾ����
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
				System.out.println("��������");
				break;
			}
			for(int j=1;j<=n;j++) {
				if(n>9) {
					System.out.println("��������");
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
			System.out.println("��������");
		}
	}
	  

}
