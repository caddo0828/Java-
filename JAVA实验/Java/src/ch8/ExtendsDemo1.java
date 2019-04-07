package ch8;
/*java继承的特点:
 *   a:java中只允许单继承尴尬，不允许多继承;
 *   b:java支持多层继承(也就说一个类即可以作为父类，也可以继承其他类)
 *   c:子类只能继承父类所有非私有的成员变量及方法
 *   d:子类不能继承父类的构造方法，但可以通过super关键字来调用父类的构造方法
 *   e:不要为了部分功能去继承；
 *   
 *  成员变量：子类和父类中的成员变量名一样，采用就近原则；
 *  （先在子类的局部中找，在子类的成员中找，在父类中找，否则报错）
 */
class Student {
	public int num = 10;
	
}
class Son extends Student {
	public int num = 20;
	public void show() {
		int num = 40;
		System.out.println(num);
		
	}
}

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
