package ch7;
/*
 * 构造方法：给对象数据进行初始化
 *        1、方法名与类名相同
 *        2、没有返回值类型，连void都没有
 *        3、没有具体的返回值
 * 重载：方法名与类名相同，  无返回值，参数类型不同    
 *{ 如果不给构造方法系统将提供无参构造方法，
 *  但是只要给定了构造方法系统将不提供无参的构造方法，
 *  如果还要使用无参构造方法必须自己给出 }
 */ 
class Stu {
	String brand;
	int price;
	
	Stu(String brand,int price) {
		this.brand=brand;
		this.price=price;
		
	}
	
	Stu(String brand){
		this.brand = brand;
	}
	
	public void getBrand() {
		System.out.println(brand);
	}
	
	public void get() {
		System.out.println(brand+" "+price);
	}
	
}


public class GouZaoDemo1 {
	public static void main(String[] args) {
		Stu st = new Stu("三星",2005);
		st.get();
		
		//
		System.out.println("----------");
		Stu s2 = new Stu("华为");
		s2.getBrand();
	}

}
