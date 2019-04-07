package dh12;
//09
//String 类的构造方法
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);//对象未赋值，方法也未被重写，打出空值
		System.out.println(s1.length());
		System.out.println("-----------------");
		
		//把字节数组转换成字符串
		byte[] bye = {97,98,99,100,101};
		String s2 = new String(bye);
		System.out.println("s2:"+s2);
		System.out.println(s2.length());
		
		System.out.println("-----------------");
		
		//把字节数组的一部分转换成字符串
		byte[] byt = {97,98,99,100,101};
		String s3 = new String(byt,1,3);
		System.out.println("s3="+s3);
		System.out.println(s3.length());
		
		System.out.println("-----------------");
		
		//把字符串常量值转换成字符串
		String original  = "你好中国";
		String s4 = new String(original);
		System.out.println(s4);
		
		//把字符数组转换成字符串
		char[] varlue = {'a','b','c','d','e','f'};
		String s5 = new String(varlue);
		System.out.println("s5="+s5);
		
	}

}
