package dh10;
//����������ֵ����

class Lei {
	public void study() {
		System.out.println("good good study ,day day up");
	}
}

class LeiDemo {
	public Lei method() {
		return new Lei();
	}
}

public class FanHuiZhiTypeDemo1 {
	public static void main(String[] args) {
		LeiDemo le = new LeiDemo();
		Lei l = le.method();//Lei l = new Lei();
		l.study();
	}

}
