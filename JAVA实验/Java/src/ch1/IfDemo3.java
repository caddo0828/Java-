package ch1;

//实现键盘录入数据
//并且判断三个书中的最大数
//且判断最大数是否为奇数
import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		System.out.println("请输入第三个数据：");
		int z = sc.nextInt();
		
	//	int m = 0,max = 0;
	/*	if(x>y) {
			m = x;
		}else {
			m = y;
		}
		if(m>z){
			max = m;
			System.out.println("最大值为："+max);
		}else {
			max = z;
			System.out.println("最大值为："+max);
		}
		*/
		
/*		int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("最大值为："+max);
	*/
		int max = 0;
		if(x>y) {
			if(x>z) {
				max = x;
			}else {
				max = z;
			}
		}else {
			if(y>z) {
				max = y;
			}else {
				max =z;
			}
		}System.out.println(max);
		
		boolean flag = true;//是奇数
		if(max%2==0) {
			flag = false;
		}System.out.println(flag);
	}

}
