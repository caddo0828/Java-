package dh10;
//�ӿ���Ϊ����ֵ
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
		//text.method();�൱�ڷ��صĶ���ֵ���˽ӿ�ʵ����Ķ���
		JK j = text.method();//�൱�ڶ�̬��JK j = new JkTextDemo();
		j.study();
		
	}

}
