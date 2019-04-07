package ch6;
/*
 * 打印杨辉三角(行数可以键盘录入)
 * 1 
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
import java.util.Scanner;

public class ErArrayDemo2 {
	public static void main(String[] args) {
		//获取键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入行数
		System.out.println("请输入行数");
		int x = sc.nextInt();
		
		//定义数组
		int[][] arr= new int[x][x];
		
		for(int i=0;i<arr.length;i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		
		for(int i=2;i<arr.length;i++) {
			for(int j=1;j<=i-1;j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
			
		}
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	

}
