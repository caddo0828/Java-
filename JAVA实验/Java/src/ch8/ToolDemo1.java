package ch8;
/*工具类
 * 构造方法私有化，不能创建该类的对象
 * 静态方法还可以通过类名引用
 * javacdoc 用于解析文档注释
 * javac -d 目录  -author -version ArrayToolDemo.java
 */
public class ToolDemo1 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {28,55,33,12,19};
		
		//遍历数组
		ArrayToolDemo.printArray(arr);
		
		//取出最大值
		int result = ArrayToolDemo.getMax(arr);
		System.out.println("max: "+result);
		
		//求索引
		int ress = ArrayToolDemo.getIndex(arr, 33);
		System.out.println(ress);
		
	}
	

}
