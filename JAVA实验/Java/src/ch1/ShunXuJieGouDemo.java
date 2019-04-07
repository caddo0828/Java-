package ch1;

import java.util.Scanner;

public class ShunXuJieGouDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个数");
		int y = sc.nextInt();
		
		if(x>y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
		System.out.println("请输入一个数:");
		int z = sc.nextInt();
		if(z%2==0){
			System.out.println("偶数");
		}
		else{
			System.out.println("奇数");
		}
		
		
	}

}
