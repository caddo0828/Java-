package dh13;
/*
 *String与StringBuffer作为参数类型返回：
	1、基本类型
	2、引用类型：必须创建相应的对象
		注意：String类型的参数转变和基本类型是一样的
		常量池的内容不变
 */
public class String_StringBuffer_canshu13 {
	public static void main(String[] args) {
		String s1 = "basic";
		String s2 = "java";
		System.out.println(s1+"-----"+s2);
		change(s1,s2);
		System.out.println(s1+"-----"+s2);
		
		System.out.println("StringBuffer类型");
		
		StringBuffer buffer1 = new StringBuffer("basic");
		StringBuffer buffer2 = new StringBuffer("java");
		System.out.println(buffer1+"----"+buffer2);
		change(buffer1,buffer2);
		System.out.println(buffer1+"----"+buffer2);
		
	}

	public static void change(StringBuffer buffer1, StringBuffer buffer2) {
		buffer1 = buffer2;
		buffer2.append(buffer1);//只有方法实体才会改变常量内容
	}
	
	public static void change(String s1, String s2) {
		s1= s2;//方法中改变，main函数不变
		s2 +=s1;//与基本类型一样
	}

}
