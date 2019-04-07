package dh12;

import java.util.Scanner;

public class GuessNumberGame {
	//设置为static,可以用类名直接访问方法
	public static void start() {
		//定义一个从1到100的随机数
		int x = (int)(Math.random()*100+1);
		
		Scanner sc = new Scanner(System.in);
		
		//键盘录入所猜测的对象
		while(true){
			int guessNumber= sc.nextInt();
		if(guessNumber>x) {
			System.out.println("所猜数值大了");
		}else if(guessNumber<x) {
			System.out.println("所猜的数值小了");
		}else {
			System.out.println("恭喜，猜对了");
			break;
		}
	}
		
	}
	

}
