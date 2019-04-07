package ch8;
/*继承中构造方法的关系：
 * A：子类中所有的构造方法都会访问父类中的无参构造方法
 * B：子类的每一个构造方法的第一条语句都是默认为super（）//代表调用父类构造方法
 * C:通过使用super关键字，显示的去调用父类的有参构造方法
 * D:子类通过this去调用本类的其他构造方法
 *   （子类中一定要有一个去访问父类的构造方法，否则父类数据没有进行初始化）
   E:this（）和super（）进行构造时必须放在 第一条语句上
     如果不是放在第一条语句上，就可能对父类进行了多次初始化
     
   F:先走静态代码块，再走构造代码块，在走构造方法（先对父类进行初始化）
   （走构造时，先把父类构造代码块和构造方法先走完）
 */
class Fa {
	int age;
	
	public Fa() {
		System.out.println("无参构造");
	}
	
	public Fa(String name) {
		System.out.println("有参构造");
	}
	
}

class So extends Fa {
	public So() {
		super("gi");
		System.out.println("子类无参构造");
	}
	
	public So(int age) {
		this();
		System.out.println("子类有参构造");
	}
	
}

public class GaoZaoDemo {
	public static void main(String[] args) {
		So s = new So();
		System.out.println("------------");
		So s2 = new So(19);
		
	}

}
