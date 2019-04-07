package ch9;
/*
 * 向上转型以及向下转型
 */
class Human {
	String name;
	int age;
	String sex;
	
	public void eat() {
		System.out.println("everyday to eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
	
	public void get() {
		System.out.println("get");
	}
}
class Man extends Human {
	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
	
	public void sing() {
		System.out.println("i can sing");
	}
	
}

class Woman extends Human {
	public void eat() {
		System.out.println("eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
	public void method() {
		System.out.println("nethod");
	}
}
public class ZhuanXingText1 {
	public static void main(String[] args) {
		//向上转型
		Human h = new Man();
		h.eat();
		h.sleep();
		h.get();
		
		System.out.println("-------------");
		//向下转型
		//Human hh = new Human();
		Man m = (Man) h;
		m.eat();
		m.sleep();
		m.sing();
		
		System.out.println("---------");
		Human hh = new Woman();
		Woman w = (Woman) hh;
		w.method();
		
	}

}
