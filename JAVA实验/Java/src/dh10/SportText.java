package dh10;
/*
 * �����Լ��˶�Ա��ϰ��
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
		System.out.println("ÿ���˶�Ҫ˯��");
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
		System.out.println("ƹ�����˶�ԱҪѧϰ������֪ʶ��������ɶ�Ӧ��ѵ��");
	}

	@Override
	public void eat() {
		System.out.println("ƹ�����˶�Ա������Ӧ���˶���������ʳ");	
	}
	
}

class BasketballAthlete extends Athlete {
	BasketballAthlete() {}
	
	BasketballAthlete(String name,int age) {
		super(name,age);
	}
	
	public void study() {
		System.out.println("�����˶�ԱҪѧϰ��Ӧ��������");
	}
	
	public void eat() {
		System.out.println("�����˶�ԱҪ����ʳ��ά���غ����ߵ�ʳƷ");
	}
	
}

class TableTennisCoach extends Coach {
	TableTennisCoach() {}
	
	TableTennisCoach(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("ƹ���������Ҫ����ʹ�ü��ɣ��Լ������ƶ���Ӧ��ѵ����ʽ");
	}
	
	public void eat() {
		System.out.println("ƹ�����������");
	}
	
}

class BasketballCoach extends Coach {
	BasketballCoach() {}
	
	BasketballCoach(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("����������߲�");
	}
	
	public void teach() {
		System.out.println("�������������Ӧ���򳡹��򣬽�����Ӧ��Ͷ��ѵ��");
	}
	
}

class InterTableTennisCoach  extends TableTennisCoach implements StudyEnglish {
	InterTableTennisCoach() {}
	
	InterTableTennisCoach(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("ƹ���������Ҫ����ʹ�ü��ɣ��Լ������ƶ���Ӧ��ѵ����ʽ");
	}
	
	public void eat() {
		System.out.println("ƹ�����������");
	}
	
	public void studyEnglish() {
		System.out.println("����ƹ���������ҪѧϰӢ������֪ʶ");
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






