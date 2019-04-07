package ch9;
//先有动物，在有猫，再有跳高猫实现跳高功能

abstract class InterAnimal {
	String name;
	int age;
	
	public InterAnimal() {}
	
	public InterAnimal(String name,int age){
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
		this.age =age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void sleep();
	
	public abstract void eat();
	
}

interface TiaoGao {
	public abstract void tiaoGao();
	
}

class InterCat extends InterAnimal implements TiaoGao {
	public InterCat(){}
	
	public InterCat(String name,int age){
		super(name,age);
	}
	
	public void sleep(){
		System.out.println("猫喜欢在高的地方睡觉");
	}
	
	public void eat(){
		System.out.println("猫吃鱼");
	}
	
	public void tiaoGao() {
		System.out.println("猫天生可以跳的高，经过训练后跳的更高");
	}
}

class InterDog extends InterAnimal {
	public InterDog(){}
	
	public InterDog(String name,int age){
		super(name,age);
	}
	
	public void sleep(){
		System.out.println("狗喜欢趴在地上睡");
	}
	
	public void eat() {
		System.out.println("狗喜欢吃骨头，喜欢吃肉");
	}
}

class TiaoCat extends InterCat implements TiaoGao {
	public TiaoCat() {}
	
	public TiaoCat(String name,int age){
		super(name,age);
	}
	
	public void tiaoGao() {
		System.out.println("猫训练后可以进行跳高");
	}
	
}

public class InterfaceText1 {
	public static void main(String[] args) {
		InterAnimal in = new InterCat("nunu",2);
		System.out.println(in.getName()+" "+in.getAge());
		in.sleep();
		in.eat();
		 
		InterCat ca = (InterCat)in;
		ca.tiaoGao();
		
		System.out.println("---------------");
		//第二种输出
		InterAnimal nu = new InterCat();
		nu.setAge(1);
		nu.setName("dudu");
		System.out.println(nu.getName()+" "+nu.getAge());
		nu.sleep();
		nu.eat();
		
		InterCat cc = (InterCat)nu;
		cc.tiaoGao();
		
		System.out.println("-------------------");
		//狗的输出
		in = new InterDog("nana",1);
		System.out.println(in.getName()+" "+in.getAge());
		in.sleep();
		in.eat();
		
		System.out.println("------------");
		InterCat  ctt = new TiaoCat("橘猫",2);
		System.out.println(in.getName()+" "+in.getAge());
		ctt.sleep();
		ctt.eat();
		ctt.tiaoGao();
		
		
	}

}
