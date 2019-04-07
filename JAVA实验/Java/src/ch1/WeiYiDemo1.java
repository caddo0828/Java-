package ch1;

//用位异或实现两个数的转换
//用最简便打方法算出2*8的值   2<<3

public class WeiYiDemo1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(2<<3);
	}

}
