package ch7;

//同一个包中不能有相同名字的类，否则会报错
//定义员工类用于输出员工信息

class Person {
	String number;//职员编号
	String name;//员工姓名
	int age;//年龄
	
	Person() {}
	
	Person(String number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void getNumber() {
		System.out.println("职员编号: "+number);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getName() {
		System.out.println("姓名: "+name);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getAge() {
		System.out.println("年龄: "+age);
	}
	
	public void show() {
		System.out.println("职员编号: "+number+" "+"姓名: "+name+" "+"年龄: "+age);
	}
}

public class PersonText {
	public static void main(String[] args) {
		Person pe = new Person();
		pe.setNumber("008");
		pe.setName("嗦嗦");
		pe.setAge(21);
		pe.getNumber();
		pe.getName();
		pe.getAge();
		
		System.out.println("--------------------");
		pe.show();
		
		System.out.println("-------------");
		Person pe2 = new Person("002","李四",21);
		pe2.show();
	}
	

}
