package ch7;
//变量
/*
 * 成员变量：在类中方法外（有默认值）
 * 局部变量：在方法定义中或者在方法声明上（没有默认值必须初始化定义后才能使用）
   当成员变量和局部变量一样时采用就近原则
 */
/*
 * 基本类型： 基本类型：
                           引用类型：（类以及数组）必须创建相应类的对象
                           
  匿名对象：没有名字的对象
  应用场景：调用方法：仅仅只是调用一次的时候
  匿名对象作为实际参数的使用
  
 */  
class Student {
	public void show() {
		System.out.println("study");
	}
}

class StudentDemo {
	//如果看到了一个方法的形式参数是一个类类型（引用类型），需要创建该类的对象
	public void method(Student s) {//调用的时候是将地址值传送到这里
		s.show();
	}
}

public class VariableDemo1 {
	public static void main(String[] args) {
		//形式参数是引用类型的调用
		StudentDemo sc = new StudentDemo();
		//必须创建类类型的对象
		Student s = new Student();
		sc.method(s);//把s的地址传送到了这里
		
		//类名字的调用
		s.show();
		
		//匿名对象
		new Student();
		//匿名对象调用方法
		new Student().show();
		new Student().show();//创建了一个与上面不是同一个的新对象
		
		//
		StudentDemo ss = new StudentDemo();
		//匿名对象可以作为实际参数使用
		ss.method(new Student());//创建了student的匿名对象
	
	}

}
