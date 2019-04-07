package ch5;

/*
 * 方法重载：方法的功能相同，参数列表不同，方法名字相同，与返回值的类型无关
 * 
 */

public class ChongZaiDemo1 {
	public static int equal(int x,int y) {
		return x>y ? x : y;
	}
	
	public static byte equal(byte x,byte y) {
		return x>y? x : y;
	}
	public static char equal(char x,char y) {
		return x>y? x : y;
	}
	public static void main(String[] args) {
		System.out.println(equal(10,20));
		System.out.println(equal(1,2));
		System.out.println(equal('a','d'));
	
	}

}
