package dh12;
/*统计大串中小串出现的次数
 * 1、定义两个字符串
 *    A：定义一个大串
 *    B：定义一个小串
 * 2、定义统计变量
 * 3、判断第一次是否存在
 *   <1> 存在index返回一个值
 *  	若存在则将count++;
 *  	起始位置的index = index+小串的字符长度
 *      截取大串，返回新的大串，并赋值给大串
 *   <2> 否则返回-1
 * 4、满足则统计变量加1
 * 5、否则输出
 * 
 */
public class StringFind_25 {
	public static void main(String[] args) {
		//定义一个字符串
		String f = "javaandlinuxandjavawebandandroid";
		
		//定义小串
		String s = "java";
		
		//输出次数
		int count = getCount(f,s);
		System.out.println("小串在大串中出现的次数为: "+count);
		
	}
 /*     
	public static int getCount(String maxString ,String minString) {
		//定义统计变量
		int count = 0;
		
		//定义一个初始索引
		int index = maxString.indexOf(minString);
		
		while(index!=-1) {
				count++;
			//	int StartIndex = index+minString.length();
			//	maxString = maxString.substring(StartIndex);
				maxString = maxString.substring(index+minString.length());
				index = maxString.indexOf(minString);	
			
		 }
	
		return count;
	}
	*/
	
	//代码优化
	public static int getCount(String maxString ,String minString) {
		//定义统计变量
		int count = 0;
		
		int index;
		while((index=maxString.indexOf(minString))!=-1) {
			count++;
			maxString = maxString.substring(index+minString.length());
		}
	
		return count;
	}

}
