package dh12;
//遍历字符串
/*A：如何遍历？
 *   char  charAt(int index)
 *B:如何知道字符到底有多少呢？
 * 	int length();  
 * 
 */
public class StringBianLi_15 {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloworld";
		
		for(int i =0;i<s.length();i++) {
			//char ch = s.charAt();
			//输出
			System.out.print(s.charAt(i)+" ");
		}
		
	}

}
