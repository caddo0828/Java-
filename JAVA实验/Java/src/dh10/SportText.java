package dh10;
/*
 * 教练以及运动员练习题
 */

abstract class Person {
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("每个人都要睡觉");
	}
	
	public void show() {
		System.out.println(name+" "+age);
	}
	
}
//athlete
//coach
abstract class Athlete extends Person{
	Athlete() {}
	
	Athlete(String name,int age) {
		super(name,age);
	}
	
	public abstract void study();
	
}

abstract class Coach extends Person {
	Coach() {}
	
	Coach(String name,int age) {
		super(name,age);
	}
	
	public abstract void teach();
	
}

interface StudyEnglish {
	public abstract void studyEnglish();
	
}

class TableTennisAthlete extends Athlete {
	TableTennisAthlete() {}
	
	TableTennisAthlete(String name,int age) {
		super(name,age);
	}
	
	public void study() {
		System.out.println("乒乓球运动员要学习基础的知识，并且完成对应的训练");
	}

	@Override
	public void eat() {
		System.out.println("乒乓球运动员根据相应的运动量调整饮食");	
	}
	
}

class BasketballAthlete extends Athlete {
	BasketballAthlete() {}
	
	BasketballAthlete(String name,int age) {
		super(name,age);
	}
	
	public void study() {
		System.out.println("篮球运动员要学习相应的篮球技巧");
	}
	
	public void eat() {
		System.out.println("篮球运动员要经常食用维生素含量高的食品");
	}
	
}

class TableTennisCoach extends Coach {
	TableTennisCoach() {}
	
	TableTennisCoach(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("乒乓球教练需要教授使用技巧，以及规则，制定相应的训练方式");
	}
	
	public void eat() {
		System.out.println("乒乓球教练吃肉");
	}
	
}

class BasketballCoach extends Coach {
	BasketballCoach() {}
	
	BasketballCoach(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("篮球教练吃蔬菜");
	}
	
	public void teach() {
		System.out.println("篮球教练教授相应的球场规则，进行相应的投球训练");
	}
	
}

class InterTableTennisCoach  extends TableTennisCoach implements StudyEnglish {
	InterTableTennisCoach() {}
	
	InterTableTennisCoach(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("乒乓球教练需要教授使用技巧，以及规则，制定相应的训练方式");
	}
	
	public void eat() {
		System.out.println("乒乓球教练吃肉");
	}
	
	public void studyEnglish() {
		System.out.println("此类乒乓球教练需要学习英语的相关知识");
	}
	
}
public class SportText {
	public static void main(String [] args) {
		Person pe = new InterTableTennisCoach("mike",25);
		pe.show();
		pe.eat();
		pe.sleep();
		
		InterTableTennisCoach tb = (InterTableTennisCoach) pe;
		tb.teach();
		tb.studyEnglish();
	}

}






