package dh11;

class Demo {}

public class Equals {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Student s = new Student("�����",21);
		Student s2= new Student("�����",21);
		
		System.out.println(s==s2);//�Ƚϵ��ǵ�ֵַ
		
		System.out.println("-------------");
		//Ĭ����д����ǰ�Ƚϵ��ǵ�ֵַ��д����д������Ƚ϶��������Ƿ�һ��
		////������Ƚϵ���ͬһ�������
		System.out.println(s.equals(s2));
		
		System.out.println("--------------");
		//�Ƚϵ�����������ͬһ����Ķ���
		Demo d = new Demo();
		System.out.println(s.equals( d));
		
		//clone
		Student ss = new Student("��",22);
		Object obj = ss.clone();
		
		
		
	}

}
