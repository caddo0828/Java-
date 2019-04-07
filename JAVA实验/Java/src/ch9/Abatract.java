package ch9;
/*
 * 抽象类和抽象方法必须用abstract修饰
 * 抽象类中不一定有抽象方法，但是抽象方法的类一定要定义成抽象类
 * 抽象方法不能有主体：public abstract void show();
 * 抽象类不能被实例化
 * 子类如果不定义成抽象类时，一定要重写抽象方法
 * 用多态来写测试类
 * 
 * 一个类没有抽象方法，可以定义为抽象类（不让创建对象，只能通过子类调用）
 */
abstract class StudyPerson {
	private String name;
	private	int age;
	private String grand;
	
	StudyPerson() {}
	
	StudyPerson(String name,int age,String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
	}
	//抽象方法无方法体
	public abstract void study();
	
	public void eat() {
		System.out.println("学习累了，就吃饭！");
	}
	
	public void show() {
		System.out.println(name+" "+age+" "+grand);
	}
	
}

class BasicStudent extends StudyPerson {
	BasicStudent() {}
	
	BasicStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("基础班学生学习Java");
	}
	
}

class WorkStudent extends StudyPerson {
	WorkStudent() {}
	
	WorkStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("就业班学生学习Java");
	}
	
	public void method() {
		System.out.println("学习java的方法");
	}
}
public class Abatract {
	public static void main(String[] args) {
		StudyPerson st = new BasicStudent("老腰",21,"大三");
		st.show();
		st.study();
		st.eat();
		
		System.out.println("------------------------");
		
		st = new WorkStudent("胖子",20,"大三");
		st.show();
		st.study();
		st.eat();
		
		System.out.println("------------------------");
		//向下转型
		WorkStudent  ws = (WorkStudent) st;
		ws.method();
	}

}
