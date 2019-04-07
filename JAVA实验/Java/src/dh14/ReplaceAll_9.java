package dh14;

import java.util.Arrays;

/*替换功能：
String类的public String replaceAll(String regex, String replacement);
注意： 使用给定的replacement 替换此字符串所有匹配正则表达式的子字符串
*/
public class ReplaceAll_9 {
	public static void main(String[] args) {
		//定义一个字符串
		String string ="caddo12345javaandweb";
		//定义新的串接收替换后的字符串
		String string2 = string.replaceAll("\\d+", "*");
		//注意\\d+  ， "*" 表示出现数字一次或一次以上替换一个*给原字符串
		//   \\d , "*" 表示数字出现一次就替换一个*给原字符串
		System.out.println(string2);
		
		
		String s = "27 90 48 12 56";
		String[] sh =s.split(" ");//以空格分割字符串
		//将字符数组变成int类型
		int[] arr =new int[sh.length];
		//遍历字符数组，转成int类型数据
		for(int i=0;i<sh.length;i++) {
			arr[i] = Integer.parseInt(sh[i]);
		}
		//升序
		Arrays.sort(arr);  // 默认升序
		//加空格
		StringBuffer buffer = new StringBuffer();
		for(int j=0;j<arr.length;j++) {
			buffer.append(arr[j]).append(" "); //最后一个数据加上了空格
		}

		//toString 将StringBuffer 换成String类型   
		//StringBuffer中  public String trim（）用于去除字符串首尾空格
		String result = buffer.toString().trim();
		System.out.println(result);

	}

}
