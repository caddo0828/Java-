package dh12;
//String的获取功能
public class StringHuoQu_14 {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloworld";
		
		//int length获取字符串长度
		System.out.println("s.length="+s.length());
		System.out.println("-------------------");
		
		//char CharAt(int index);获取指定索引位置的字符
		System.out.println("指定索引位置的字符:  "+s.charAt(2));
		System.out.println("-------------------");

		//int indexOf(int ch);返回指定字符在此字符串中第一次出现的索引
		System.out.println("指定字符在此字符串中第一次出现的索引: "+s.indexOf('a'));
		System.out.println("-------------------");

		//int indexOf(String str);  //返回指定字符串在此字符串中第一次出现的索引值
		System.out.println("指定字符串在此字符串中第一次出现的索引值: "+s.indexOf("wo"));
		System.out.println("-------------------");
		
		//int indexOf(int ch,int fromIndex);//返回指定字符在此字符串从指定位置后第一次出现的索引位置
        System.out.println("指定字符，从哪里开始后第一次出现的索引位置： "+s.indexOf('o', 3));
 		System.out.println("-------------------");
 		
 		//String substring(int start)；//从指定位置开始获取字符串，默认到末尾结束
 		System.out.println("从指定位置开始，到末尾结束  "+s.substring(2));
 		System.out.println("-------------------");
 		
 		//String substring(int start ,int end);//从指定位置开始到指定的位置结束  
 		//[ x,y}表示x可以取，y取不到
 		System.out.println("从指定位置开始到指定位置结束  :"+s.substring(0, 1));



	
	
	
	}

}
