package ch5;

/*
 * �������أ������Ĺ�����ͬ�������б�ͬ������������ͬ���뷵��ֵ�������޹�
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
