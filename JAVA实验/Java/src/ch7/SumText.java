package ch7;

class Demo {
	int a;
	int b;
	
	Demo(){}
	
	Demo(int a,int b) {
		this.a = a;
		this.b =b;
	}
	public void sum(int a,int b) {
		this.a = a;
		this.b =b;
	}
	
	public void showSum() {
		System.out.println(a+b);
	}
}
public class SumText {
	public static void main(String[] args) {
		Demo de = new Demo();
		de.sum(12, 23);
		de.showSum();
		
		//
		System.out.println("--------");
		Demo dd = new Demo(16,16);
		dd.showSum();
	}

}
