package dh12;
/*String的转换功能
 *  byte[ ]  getBytes( )；//把字符串转换成字节数组
	char[ ]  toCharArray();//把字符串改变成字符数组
	static   String valueOf(char[] chs);//把字符数组转换成字符串
	static String valueOf(int  i) ;//把int类型的数据转换成字符串
		注意：String类型的valueOf能把任意类型的数据转换成字符串
	String  toLowerCase( );//把字符串全部变成小写
	String toUpperCase( );//把字符串全部变成大写
	String concat(String str);// 把字符串进行拼接
 * 
 */

public class StringZhuanHuan_18 {
	public static void main(String[] args) {
		//定义一个字符串
		String s ="JavaSE";
		
		//将字符串变成字节数组，并且遍历输出
		byte[] bytes = s.getBytes();
		for(int i=0;i<bytes.length;i++) {
			System.out.print(bytes[i]+" ");
		}
		System.out.println();
		//把字符串改变成字符数组
		char[] array = s.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.print("array[]= "+array[i]+" ");
		}
		System.out.println();
		//把字符数组转换成字符串
		String ss = String.valueOf(array);
		System.out.println("ss= "+ss);
		
		//把int类型的数据转换成字符串
		String m = String.valueOf(97);
		System.out.println("m= "+m);
		
		//把字符串全部变成小写
		String n = s.toLowerCase();
		System.out.println("变成小写后的字符串= "+n);
		
		//把字符串全部变成大写
		String o = s.toUpperCase();
		System.out.println("变成大写后的字符串= "+o);
		
		// 把字符串进行拼接
		String str = "basic";
		String p = s.concat(str);
		System.out.println("拼接后的字符串= "+p);
	}

}
