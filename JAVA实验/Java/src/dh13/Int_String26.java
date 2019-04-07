package dh13;
/* int 与 String 转换
 * 
 * int -----String
 * 		最佳用：String.valueOf(int i)
 * 
 * String-----int
 * 		Interger.parseInt(String s);		
 */
public class Int_String26 {
	public static void main(String[] args) {
		int i = 100;
		
		//1、方式一      字符串拼接
		String s1 ="";
		s1 += i;
		System.out.println("s1="+s1);
		
		//方式二  valueOf
		String s2 =String.valueOf(i);
		System.out.println("s2="+s2);
		
		//方式三    int ---Integer---String
		Integer ii = new Integer(i);
		String s3 = ii.toString();
		System.out.println("s3="+s3);
		
		//方式四   静态方法直接将int类型用string类型输出
		String s4  = Integer.toString(i);
		System.out.println("s4="+s4);
		
		
		System.out.println("------------=--------");
		//string----int
		
		String ss1 ="100";
		
		//方式一   String----Integer----int
		Integer  sss = new Integer(ss1);
		int i1 = sss.intValue();
		System.out.println("i1="+i1);
		
		//方式二    
		int i2 = Integer.parseInt(ss1);
		System.out.println("i2="+i2);
		
	}

}
