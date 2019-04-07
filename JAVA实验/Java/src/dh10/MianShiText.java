package dh10;

//输出  30，20，10
class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new Outer().num);//引用outer类对象去调用num
			System.out.println(Outer.this.num);//outer类中的num值
		}
	}
}

public class MianShiText {
	public static void main(String[] args) {
		Outer.Inner  ms = new Outer().new Inner();
		ms.show();
	}

}
