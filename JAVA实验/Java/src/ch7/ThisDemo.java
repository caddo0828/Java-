package ch7;

class Student1{
	int age;
	String name;

	//无参构造方法
	Student1(){}

	Student1(String name,int age){
		this.name = name;
		this.age =age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.println(name+" "+age);
	}
	
} 

public class ThisDemo {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setAge(21);
		s.setName("游婆婆");
		System.out.println(s.getAge());
		System.out.println(s.getName());
		s.show();
		
		System.out.println("--------------");
		
		Student1 s1 = new Student1("张三",19);
		s1.show();
		
	}
}
