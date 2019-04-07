package ch8;
//If里不能用break;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		//产生随机数
		int number = (int)(Math.random()*100+1);
		
		while(true) {
			//键盘录入数据
			System.out.println("请输入猜的数字(0到100)");
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			if(x<number) {
				System.out.println("数字猜小了");
			}else if(x>number){
				System.out.println("数字猜大了");
			}else {
				System.out.println("数字对了");
				break;
			}

		}
		
		
		
	}

}
