package ch9;
/*父类不能访问子类中特有的功能
 * （创建子类对象调用方法）
 * 向上转型： 把子类对象转换为父类对象 
 *        F1 f = new Z1();
 * 向下转型：把父类对象强制转换成子类对象
 *        Z1 z = (Z1)f; 
 */
class F1 {
	int num = 10;
	public void show () {
		System.out.println("F");
	}
	
}

class Z1 extends F1 {
	int num = 20;
	public void show() {
		System.out.println("z");
	}
	public static void method() {
		System.out.println("zi");
	}
}


public class ZhuangXingDemo {
	public static void main(String[] args) {
		F1 f = new Z1();
		f.show();
		
		System.out.println("---------------");
		
		Z1 z = (Z1) f;
		z.show();
		z.method();
	}
	

}
