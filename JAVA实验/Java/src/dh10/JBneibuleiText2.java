package dh10;
//局部内部类
class Outer2 {
	public int num =10;
	
	public void show() {
		//1、局部内部类访问局部变量，必须用final修饰
		final int num2 = 20;
		class Inner4 {
			public void method() {
				System.out.println("局部内部类");
				System.out.println(num2);
				//可以直接访问外部类的成员
				System.out.println(num);
			}
		}
		//2、在局部位置，可以创建内部类对象，通过对象调用内部类的方法，来使用内部类的特定功能
		Inner4 ou = new Inner4();
		ou.method();
	}
}

public class JBneibuleiText2 {
	public static void main(String[] args) {
		Outer2 pu = new Outer2();
		pu.show();
		
	}

}
