package ch9;
/*
 *多态：同一个对象（事物），在不同时刻体现出来的不同状态
 *前提：要有继承关系
 *     要有方法重写
 *     要有父类引用指向子类对象
 *     父  f = new 子（）；
 *特点：访问
 *成员变量：编译看左边，结果也是看左边
 *构造方法：创造子类对象时，访问子类的构造方法，对父类数据进行初始化
 *成员方法：编译看左边，结果看右边
 *静态方法：编译看左边，结果看左边（静态只和类有关）
 */
class F {
	int num = 10;
	public void show () {
		System.out.println("F");
	}
	
	public static void method() {
		System.out.println("fu");
	}
}

class Z extends F {
	int num = 20;
	public void show() {
		System.out.println("z");
	}
	public static void method() {
		System.out.println("zi");
	}
}

public class DuoTai {
	public static void main(String[] args) {
		F f = new Z();
		f.show();
		//变量不能被重写，之能访问父类的
		System.out.println(f.num);
		f.method();
	}

}
