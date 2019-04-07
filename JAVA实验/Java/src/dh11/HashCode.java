package dh11;


class out extends Object {
	public void show() {
		System.out.println("jjjjj");
	}
	@Override
	public String toString() {
		return "out [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
public class HashCode {
	public static void main(String[] args) {
		//返回此对象的地址值，其实是一个哈希码，但是随着每次创建对象的不同，哈希码都会更新
		out  ou = new out();
		System.out.println(ou.hashCode());
		//getclass返回的是对象所在的类，getname :返回此类的名字
		System.out.println(ou.getClass().getName());
	
		//tostring方法返回一个字符串
		System.out.println(ou.toString());
		
		 
		
	}

	@Override
	public String toString() {
		return "HashCode []";
	}

}
