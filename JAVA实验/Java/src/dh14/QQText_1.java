package dh14;

import java.util.Scanner;

/*У��QQ����
 *  Ҫ�󳤶�5��15
 *  ����0���ܿ�ͷ
 */
public class QQText_1 {
	public static void main(String[] args) {
		//����һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ����У���QQ���룺");
		String string = sc.nextLine();
		
		boolean b = numberCheck(string);
		System.out.println("QQ��У����Ϊ��"+b);
		
		System.out.println("У����Ϊ��"+check(string));
	}
	
	//����ʵ��
	public static boolean numberCheck(String string) {
		boolean flag = true;
			
		if(string.length()<5||string.length()>15||(string.charAt(0)=='0')) {
			flag = false;
		}
		return flag;
	}
	
	//��QQ������ֻ�������֣�����������������
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
