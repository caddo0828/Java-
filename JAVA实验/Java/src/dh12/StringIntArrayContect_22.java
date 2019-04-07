package dh12;
/*把int数组拼接字符串
 *举例：int[] arr = {1,2,3};
 *
 分析：
 a:第一步定义数组
 b:定义一个空的字符串
 c:可以用”+“运算符进行拼接
 d:对数组进行遍历
    1、根据条件判断：如果是最后一个拼接 } 
    2、否则拼接 ，
    3、输出最后的字符串
 * 
 */
public class StringIntArrayContect_22 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		String s = "";
		
		s += "{";
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s += arr[i];
				s += "}";
			}else {
				s += arr[i];
				s += ",";
			}
		}
		System.out.println("最终的字符串形式输出为： "+s);
	}

}
