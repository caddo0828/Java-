package dh13;
/* int �� String ת��
 * 
 * int -----String
 * 		����ã�String.valueOf(int i)
 * 
 * String-----int
 * 		Interger.parseInt(String s);		
 */
public class Int_String26 {
	public static void main(String[] args) {
		int i = 100;
		
		//1����ʽһ      �ַ���ƴ��
		String s1 ="";
		s1 += i;
		System.out.println("s1="+s1);
		
		//��ʽ��  valueOf
		String s2 =String.valueOf(i);
		System.out.println("s2="+s2);
		
		//��ʽ��    int ---Integer---String
		Integer ii = new Integer(i);
		String s3 = ii.toString();
		System.out.println("s3="+s3);
		
		//��ʽ��   ��̬����ֱ�ӽ�int������string�������
		String s4  = Integer.toString(i);
		System.out.println("s4="+s4);
		
		
		System.out.println("------------=--------");
		//string----int
		
		String ss1 ="100";
		
		//��ʽһ   String----Integer----int
		Integer  sss = new Integer(ss1);
		int i1 = sss.intValue();
		System.out.println("i1="+i1);
		
		//��ʽ��    
		int i2 = Integer.parseInt(ss1);
		System.out.println("i2="+i2);
		
	}

}
