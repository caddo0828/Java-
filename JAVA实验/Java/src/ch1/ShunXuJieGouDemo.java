package ch1;

import java.util.Scanner;

public class ShunXuJieGouDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("������ڶ�����");
		int y = sc.nextInt();
		
		if(x>y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
		System.out.println("������һ����:");
		int z = sc.nextInt();
		if(z%2==0){
			System.out.println("ż��");
		}
		else{
			System.out.println("����");
		}
		
		
	}

}
