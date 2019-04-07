package dh10;
//接口作为返回值
interface JK {
	public abstract void study();
}

class TextDemo {
	public JK method() {
		return new JkTextDemo();
	}
}

class JkTextDemo implements JK {
	public void study() {
		System.out.println("good good study ,day day up");
	}
}

public class FanHuiZhiTypeDemo3 {
	public static void main(String[] args) {
		TextDemo text = new TextDemo();
		//text.method();相当于返回的对象赋值给了接口实现类的对象
		JK j = text.method();//相当于多态：JK j = new JkTextDemo();
		j.study();
		
	}

}
