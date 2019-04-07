package dh10;
//匿名内部类
/*
 * 前提：存在一个类或者接口
		这里的类可以是具体类也可以是抽象类
	格式：
		new 类名或者接口名（）{
		重写方法 ;
		}
		
	注意：匿名类其实就是继承该类或者接口实现类的对象
	    匿名对象只能调用一次
 */
interface Inn {
	public abstract void show();
}

class Outer3 {
	public void method() {
		new Inn() {
			public void show() {
				System.out.println("匿名内部类");
			}
		}.show();//接口子类对象调用show方法
		
		
		//多态(接口的实现类对象)
		Inn in = new Inn() {
			public void show() {
				System.out.println("多态调用匿名对象类");
			}
		};
		in.show();
	}
	
	
}

public class NMneibuleiText3 {
	public static void main(String[] args) {
		Outer3 ou = new Outer3();
		ou.method();
		
	}

}
