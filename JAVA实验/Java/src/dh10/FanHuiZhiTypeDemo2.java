package dh10;
//�����෵��ֵ����


abstract class AbstractLei {
	public abstract void study();
}


class AbstractText {
	public AbstractLei method() {
		return new DuiXiang();
	}
}

class DuiXiang extends AbstractLei {
	public void study() {
		System.out.println("good good study ,day day up");
	}
}

public class FanHuiZhiTypeDemo2 {
	public static void main(String[] args) {
		AbstractText ab = new AbstractText();
		AbstractLei le = ab.method();
		le.study();
		
	}

}
