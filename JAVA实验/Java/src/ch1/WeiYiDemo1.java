package ch1;

//��λ���ʵ����������ת��
//������򷽷����2*8��ֵ   2<<3

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
