package ch4;

//根据键盘录入数据输出星期几
import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String [] args) {
		//创建键盘 录入对象
		Scanner sc = new Scanner(System.in);
		
		//控制键盘录入数据
		System.out.println("请输入一个数：");
		int x = sc.nextInt();
		
		switch(x){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
		case 7:
			System.out.println("周末到了");
			break;
		default:
			System.out.println("输入数据错误");
			break;
				
		}
	}

}
