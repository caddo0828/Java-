package ch7;

//ͬһ�����в�������ͬ���ֵ��࣬����ᱨ��
//����Ա�����������Ա����Ϣ

class Person {
	String number;//ְԱ���
	String name;//Ա������
	int age;//����
	
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
		System.out.println("ְԱ���: "+number);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getName() {
		System.out.println("����: "+name);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getAge() {
		System.out.println("����: "+age);
	}
	
	public void show() {
		System.out.println("ְԱ���: "+number+" "+"����: "+name+" "+"����: "+age);
	}
}

public class PersonText {
	public static void main(String[] args) {
		Person pe = new Person();
		pe.setNumber("008");
		pe.setName("����");
		pe.setAge(21);
		pe.getNumber();
		pe.getName();
		pe.getAge();
		
		System.out.println("--------------------");
		pe.show();
		
		System.out.println("-------------");
		Person pe2 = new Person("002","����",21);
		pe2.show();
	}
	

}
