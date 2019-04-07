package ch9;
//���ж������è����������èʵ�����߹���

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
		System.out.println("èϲ���ڸߵĵط�˯��");
	}
	
	public void eat(){
		System.out.println("è����");
	}
	
	public void tiaoGao() {
		System.out.println("è�����������ĸߣ�����ѵ�������ĸ���");
	}
}

class InterDog extends InterAnimal {
	public InterDog(){}
	
	public InterDog(String name,int age){
		super(name,age);
	}
	
	public void sleep(){
		System.out.println("��ϲ��ſ�ڵ���˯");
	}
	
	public void eat() {
		System.out.println("��ϲ���Թ�ͷ��ϲ������");
	}
}

class TiaoCat extends InterCat implements TiaoGao {
	public TiaoCat() {}
	
	public TiaoCat(String name,int age){
		super(name,age);
	}
	
	public void tiaoGao() {
		System.out.println("èѵ������Խ�������");
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
		//�ڶ������
		InterAnimal nu = new InterCat();
		nu.setAge(1);
		nu.setName("dudu");
		System.out.println(nu.getName()+" "+nu.getAge());
		nu.sleep();
		nu.eat();
		
		InterCat cc = (InterCat)nu;
		cc.tiaoGao();
		
		System.out.println("-------------------");
		//�������
		in = new InterDog("nana",1);
		System.out.println(in.getName()+" "+in.getAge());
		in.sleep();
		in.eat();
		
		System.out.println("------------");
		InterCat  ctt = new TiaoCat("��è",2);
		System.out.println(in.getName()+" "+in.getAge());
		ctt.sleep();
		ctt.eat();
		ctt.tiaoGao();
		
		
	}

}
