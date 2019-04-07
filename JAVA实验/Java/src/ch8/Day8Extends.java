package ch8;

class Role {
	protected  String name;
	protected  int age;
	protected  String sex;
	
	Role() {}
	
	Role(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void play() {}
	
}

class Employee extends Role {
	double salary;
	static String ID;
	
	Employee(String name,int age,String sex,double salary,String ID) {
		super(name,age,sex);
		this.salary = salary;
		this.ID = ID;
	}
	
	Employee() {
		super();
	}
	
	public void play() {
		System.out.println("员工信息");
	}
	
	public final void sing() {
		System.out.println(name+" "+age+" "+sex+" "+salary+" "+ID);
	}
	
	public void setName(String name) {
		super.setName(name);
	}
	public String getName() {
		 return super.getName(); 
	}
}

class Manager extends Employee {
	
	Manager() {
		super();
	}

	final String vehicle = "宝马";
	 

}

public class Day8Extends {
	public static void main(String[] args) {
		Employee e = new Employee("linda",20,"woman",8550,"001");
		//e.salary=8500;
		//e.ID="001";
		e.play();
		e.sing();
		e.setName("mary");
		e.getName();
		
		
		
		
	}

}
