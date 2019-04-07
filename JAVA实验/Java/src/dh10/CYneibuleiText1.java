package dh10;
//成员内部类
class Outer1 {
	private int num = 10;
	class Inner1 {
		public void show() {
			System.out.println("成员内部类");
			System.out.println(num);
		}
	}
	
	private class Inner2 {
		public void  method() {
			System.out.println("私有成员内部类");
		}
	}
	
	public void get() {
		Inner2 in = new Inner2();
		in.method();
	}
	
	static class Inner3 {
		public void math() {
			System.out.println("静态成员内部类");
		}
	}
	
}
public class CYneibuleiText1 {
	public static void main(String[] args) {
		Outer1.Inner1  ou = new Outer1().new Inner1();
		ou.show();
		
		System.out.println("---------------");
		
		Outer1  mu= new Outer1();
		mu.get();
		
		System.out.println("---------------");
		
		Outer1.Inner3  nu = new Outer1.Inner3();
		nu.math();
	}

}
