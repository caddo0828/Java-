package dh10;
interface Person1 {
	public abstract void show();
}

class PersonDemo1 {
	public void method(Person1 p) {
		p.show();
	}
}

class Student1 implements Person1 {
	public void show() {
		System.out.println("�������ڿ����е�ʹ�÷���");
	}
}

public class NMneibuleiText2 {
	public static void main(String[] args) {
		PersonDemo1 pd = new PersonDemo1();
		Person1 st = new Student1();
		pd.method(st);
		
		System.out.println("___________________");
		
		pd.method(new Person1(){
			public void show() {
				System.out.println("�������ڿ��������е�ʹ�÷���");
			}
		});
		
	}

}
