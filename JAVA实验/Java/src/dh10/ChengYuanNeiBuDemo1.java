package dh10;

interface inner{
	void show();//隐藏了public abstract
}

class Out {
	public static inner method() {
		return new inner() {
			public void show(){
				System.out.println("helloword");
			}
		};
	}
}


public class ChengYuanNeiBuDemo1 {
	public static void main(String[] args) {
		Out.method().show();
		//out.method();；类名调方法所以是个匿名对象，并且是静态方法
		//匿名对象就是继承该类或者是实现了一个接口的匿名对象
		//对象在调用show方法
		/*out.method(); 可以看出method()应该是out中的一个静态方法
		 * Out.method().show();可以看出method方法返回的是一个对象
		 * 又由于接口中有show()方法，所以认为是返回值是接口类型
		 * 
		*/
		
		
	}
	

}
