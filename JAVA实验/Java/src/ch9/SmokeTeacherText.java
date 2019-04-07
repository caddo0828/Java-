package ch9;
//额外的功能是老师抽烟

abstract class Person1 {
	String name;
	int age;
	
	public Person1() {}
	
	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void eat();
	
	public abstract void dailylife();
	
}

interface Smoker {
	public abstract void smoke();
}

class Stu1 extends Person1 {
	Stu1() {}
	
	Stu1(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("nodles");
	}
	
	public void dailylife() {
		System.out.println("study");
	}
}

class SmokerStudent extends Stu1 implements Smoker{
		SmokerStudent() {}
		
		SmokerStudent(String name,int age) {
			super(name,age);
		}
		
		public void smoke() {
			System.out.println("有些学生也抽烟");
		}
		
		public void study() {
			System.out.println("problem");
		}
		
}

public class SmokeTeacherText {
	public static void main(String[] args) {
		Person1 pe = new SmokerStudent("胖子",21);
		System.out.println(pe.getName()+" "+pe.getAge());
		pe.eat();
		pe.dailylife();

		SmokerStudent sm = (SmokerStudent) pe;
		sm.smoke();
		sm.study();
		
		

	}
	
}
