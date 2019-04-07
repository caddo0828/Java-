package dh14;

import java.util.Scanner;

/*获取任意范围内的随机数
 */
public class Random_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入起始范围：");
		int start = sc.nextInt();
		System.out.println("请输入末尾范围值：");
		int end = sc.nextInt();
		
		for(int i=0;i<100;i++) {
			int result = (int)(Math.random()*(end-start+1))+start;
			System.out.println(result);
		}
		
	}

}
