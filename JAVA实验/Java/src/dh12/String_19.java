package dh12;
/*把字符串首字母进行大写，其他进行小写
 *注意：进行字母大小写转换的必须是字符串的操作
 *	采用截取字符串返回字符串方式进行  String substring方法
 *	进行大小写字母转换
 *	拼接 
 */
public class String_19 {
	public static void main(String[] args) {
		//定义字符串
		String s = "helloWORLD";
		
		//进行字符串的截取
		String s1 = s.substring(0, 1);
		
		String s2 = s.substring(1);
		
		//大小写转换
		String s3 = s1.toUpperCase();
		
		String s4 = s2.toLowerCase();
		
		//拼接字符串
		String ss = s3.concat(s4);
		
		System.out.println("转换后的字符串= "+ss);
		
		//优化后的程序
		String result = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println("result= "+result);
	}

}
