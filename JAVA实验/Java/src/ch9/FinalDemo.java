package ch9;
/*final:用于修饰类，方法，变量
 * 特点：
 * A:final修饰的类不能被其他类继承
 * B:被final修饰的方法不能被重写
 * C：被final修饰的变量，该变量不能被重新赋值，其实也叫做常量
 * D:用于修饰引用型变量时，不可以改变地址值，既对象内容可变，地址值不能变
 *   也就是对象不能够接着被分配内存：
 */
class Fu {
	final int num = 10;
	int num2 = 100;
	public  void show() {
		System.out.println();
	}
	public final void get() {
		
	}
}
class Zi extends Fu {
	public void show() {
		//num = 100;被final修饰的不能被重写
		System.out.println(num);
	}
/*	public void get() {
		
	}不能被重写 
	*/
}

public abstract class FinalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		
		//可以改变对象的值但是不能改对象的地址
		final Zi zz = new Zi();
		System.out.println(zz.num2);
		zz.num2 = 200;
		System.out.println(zz.num2);
		
		 
		
		
	}

}
