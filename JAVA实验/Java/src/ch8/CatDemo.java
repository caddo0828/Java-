package ch8;
//√®π∑¿‡
class Animal {
	private	String name;
	private int age;
	private String color;
	
	Animal() {}
	
	Animal(String name,int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
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
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void eat() {
		System.out.println("i like eat");
	}
}

class Cat extends Animal {
	Cat(String name,int age,String color) {
		super(name,age,color);
	}
	
	public void playGame() {
		System.out.println("cat likes play game");
	}
}

class Dog extends Animal{
	Dog(String name,int age,String color) {
		super(name,age,color);
	}
	
	public void eat() {
		System.out.println("meat");
	}
	
	public void lookDoor() {
		System.out.println("dog look the door");
	}
	
}
public class CatDemo {
	public static void main(String[] args) {
		Cat ca = new Cat("gugu",2,"black");
		System.out.println(ca.getName()+" "+ca.getAge()+" "+ca.getColor());
		ca.eat();
		ca.playGame();
		
		System.out.println("=================");

		Dog d = new Dog("dudu",3,"white");
		System.out.println(d.getName()+" "+d.getAge()+" "+d.getColor());
		d.eat();
		d.lookDoor();
		
	}

}
