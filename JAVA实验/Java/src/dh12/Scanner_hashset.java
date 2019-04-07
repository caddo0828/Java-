package dh12;

import java.util.Scanner;
/*
 * 基本格式：
 * 	public boolean hasNextxxx();判断是否是某种类型的数据
 * 	public xxx   nextXxx();获取该元素
 * 
 * public int nxtInt();
 * public String nextLine();输入string类型的数据
 * 
 * 先获取一个数值在获取一个字符串，回车默认给了数据给String类型
 * 
 */

public class Scanner_hashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  
		if(sc.hasNextInt()) {
			int x = sc.nextInt();
	        System.out.println("x = "+x);
		}else {
			System.out.println("输入有误!");
		}
	}

}
