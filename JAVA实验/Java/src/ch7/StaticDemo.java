package ch7;
/*static (可以修饰成员变量以及方法): 
 *          修饰的数据被所有对象共享
 * 			随着类的加载而加载
 * 使用情景：如果某个成员变量是被所有对象共享的，就应该定义为静态的
 *      (可以通过类名调用,也可以通过对象名调用）
 * 注意事项：在静态方法中是没有this关键字的
 *       （静态方法只能访问静态成员方法和静态的成员变量）
		   （静态比对象先存在）
		  静态方法：只可以访问静态变量
		 非静态方法：可以访问非静态以及静态变量,以及方法
 */
class Text {
	int num = 10;
	static int num2 = 20;
	
	//非静态方法：可以访问非静态以及静态变量,以及方法
	public void printNum() {
		System.out.println(num);
		System.out.println(num2);
	}
	
	//静态方法：只可以访问静态变量
	public static void printNum2() {
		System.out.println(num2);
	}
	
	
}

public class StaticDemo {
	public static void main(String[] args) {
		Text te = new Text();
		te.printNum();
		te.printNum2();
	}

}
