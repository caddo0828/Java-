package ch8;
/*
 * ���಻����д����˽�з���
 * ������д�������ܱȸ������Ա�����ķ���Ȩ�޵ͣ����һ�£�
 * override:������д
 * overload����������
 * 
 */
class Person {
	private String name;
	private int age;
	
	Person() {}
	
	Person(String name, int age) {
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
}
class  Student1 extends Person{
	Student1() {}
	
	Student1(String name,int age) {
		super(name,age);
	}
}

class Teacher extends Person {
	Teacher() {}
	
	Teacher(String name,int age) {
		super(name,age);
	}
	
}


public class Function {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setName("����");
		s.setAge(19);
		System.out.println(s.getAge());
		System.out.println(s.getName());
		
		System.out.println("___________________");
		Teacher t = new Teacher();
		t.setAge(21);
		t.setName("����");
		System.out.println(t.getAge());
		System.out.println(t.getName());
		
		System.out.println("-----------------");
		Student1 ss = new Student1("����ϼ",60);
		System.out.println(ss.getAge());
		System.out.println(ss.getName());
		
		
		System.out.println("---------------");
		Teacher tt  = new Teacher("�����",21);
		System.out.println(tt.getAge());
		System.out.println(tt.getName());
	}

}
