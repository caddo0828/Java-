package ch9;
/*Ê¹ÓÃ¹¤¾ßÀà½øÐÐ¶àÌ¬
 * 
 */
class Animal {
	public void eat() {
		System.out.println("eat");
	}
	public void eat(String string, String string2) {
		System.out.println(string+" "+string2);
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Ã¨Ï²»¶³ÔÓã");
	}
	
	public void sleep() {
		System.out.println("Ã¨Å¿×ÅË¯¾õ");
	}
	
}

class Dog extends Animal {
	public void eat() {
		System.out.println("¹·Ï²»¶³Ô¹ÇÍ·");
	}
	
	public void sleep() {
		System.out.println("¹·Ï²»¶Õ¾×ÅË¯");
	}
	
}

class AnimalTool {
	public static void userCat(Cat c) {
		c.eat();
		c.sleep();
	}
	
	public static void userDog(Dog d) {
		d.eat();
		d.sleep();
	} 
	
	public static void userAnimal(Animal a) {
		a.eat();
		a.sleep();
		a.eat("pig","Ï²»¶³Ô°×²Ë");
	}
}

public class DuoTaiDemo2 {
	public static void main(String[] args) {
		Cat c = new Cat();
		AnimalTool.userCat(c);
		
		System.out.println("----------------");
		
		Cat c2 = new Cat();
		AnimalTool.userCat(c2);
		
		System.out.println("----------------");
		Animal a = new Animal();
		AnimalTool.userAnimal(a);
	}

}
