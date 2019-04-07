package dh14;

import java.util.Scanner;

/*校验QQ号码
 *  要求长度5到15
 *  并且0不能开头
 */
public class QQText_1 {
	public static void main(String[] args) {
		//定义一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要进行校验的QQ号码：");
		String string = sc.nextLine();
		
		boolean b = numberCheck(string);
		System.out.println("QQ号校验结果为："+b);
		
		System.out.println("校验结果为："+check(string));
	}
	
	//方法实现
	public static boolean numberCheck(String string) {
		boolean flag = true;
			
		if(string.length()<5||string.length()>15||(string.charAt(0)=='0')) {
			flag = false;
		}
		return flag;
	}
	
	//且QQ号码中只能是数字，不能是其他的类型
	public static boolean check(String s) {
		boolean flag = true;
		if(s.length()>=9&&s.length()<=11) {
			if(s.charAt(0)!='0') {
				char[] ch = s.toCharArray();
				for(int i=0;i<ch.length;i++) {
					if(!Character.isDigit(ch[i])) {
						flag = false;
						break;
					}
				}
			}else {
				flag = false;
			}	
		}else {
			flag = false;
		}
		
		return flag;
	}
}
