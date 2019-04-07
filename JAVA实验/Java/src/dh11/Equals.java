package dh11;

class Demo {}

public class Equals {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Student s = new Student("刘大大",21);
		Student s2= new Student("刘大大",21);
		
		System.out.println(s==s2);//比较的是地址值
		
		System.out.println("-------------");
		//默认重写方法前比较的是地址值，写完重写方法后比较对象内容是否一致
		////俩个相比较的是同一个类对象
		System.out.println(s.equals(s2));
		
		System.out.println("--------------");
		//比较的两个数不是同一个类的对象
		Demo d = new Demo();
		System.out.println(s.equals( d));
		
		//clone
		Student ss = new Student("九",22);
		Object obj = ss.clone();
		
		
		
	}

}
