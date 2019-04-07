package ch9;
/*
 * ������ͳ��󷽷�������abstract����
 * �������в�һ���г��󷽷������ǳ��󷽷�����һ��Ҫ����ɳ�����
 * ���󷽷����������壺public abstract void show();
 * �����಻�ܱ�ʵ����
 * �������������ɳ�����ʱ��һ��Ҫ��д���󷽷�
 * �ö�̬��д������
 * 
 * һ����û�г��󷽷������Զ���Ϊ�����ࣨ���ô�������ֻ��ͨ��������ã�
 */
abstract class StudyPerson {
	private String name;
	private	int age;
	private String grand;
	
	StudyPerson() {}
	
	StudyPerson(String name,int age,String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
	}
	//���󷽷��޷�����
	public abstract void study();
	
	public void eat() {
		System.out.println("ѧϰ���ˣ��ͳԷ���");
	}
	
	public void show() {
		System.out.println(name+" "+age+" "+grand);
	}
	
}

class BasicStudent extends StudyPerson {
	BasicStudent() {}
	
	BasicStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("������ѧ��ѧϰJava");
	}
	
}

class WorkStudent extends StudyPerson {
	WorkStudent() {}
	
	WorkStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("��ҵ��ѧ��ѧϰJava");
	}
	
	public void method() {
		System.out.println("ѧϰjava�ķ���");
	}
}
public class Abatract {
	public static void main(String[] args) {
		StudyPerson st = new BasicStudent("����",21,"����");
		st.show();
		st.study();
		st.eat();
		
		System.out.println("------------------------");
		
		st = new WorkStudent("����",20,"����");
		st.show();
		st.study();
		st.eat();
		
		System.out.println("------------------------");
		//����ת��
		WorkStudent  ws = (WorkStudent) st;
		ws.method();
	}

}
