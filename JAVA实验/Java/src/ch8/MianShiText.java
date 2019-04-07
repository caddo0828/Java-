package ch8;
/*
 * 一个类的初始化过程：
 * A:成员变量的初始化
 *     默认初始化
 *     显示初始化
 *     构造方法初始化
 * B:子父类的初始化（分层初始化）
 *   先进行父类初始化，然后进行子类初始化
 *   
 * 问题：
 *  虽然子类的构造方法默认会访问父类的构造方法（用super（）访问）
 *  初始化的时候，不是按照那个顺序进行的
 *  而是按照分层初始化进行的
 *  它仅仅表示要先初始化父类数据，在初始化子类
 */
//结果：YXYZ
class X {
	Y b = new Y();
	X() {
		System.out.println("X");
	}
}

class Y {
	Y() {
		System.out.println("Y");
	}
}

public class MianShiText extends X {
	Y y = new Y();
	MianShiText()  {
		System.out.println("Z");
	}
	public static void main(String[] args) {
		new MianShiText();
	}
}
