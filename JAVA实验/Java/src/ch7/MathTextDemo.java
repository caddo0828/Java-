package ch7;

class MyMath {
	//加法
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	
	//减法
	public void sub(double a,double b) {
		System.out.println(a-b);
	}
	
	//乘法
	public void mult(double a,double b) {
		System.out.println(a*b);
	}
	
	//除法
	public void divi(double a,double b) {
		System.out.println(a/b);
	}
	
	//求余
	public void qiuYu(double a, double b) {
		System.out.println(a%b);
	}
	
	//阶级
	public void factorial(double a,double b) {
		System.out.println(Math.pow(a,b));
	}
	
}

public class MathTextDemo {
	public static void main(String[] args) {
		MyMath ma = new MyMath();
		ma.add(2, 4);
		ma.sub(1,3);
		ma.mult(4.2, 3.6);
		ma.divi(16, 4.0);
		ma.qiuYu(15, 6);
		ma.factorial(2, 10);
	}

}
