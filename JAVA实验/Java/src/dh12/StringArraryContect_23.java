package dh12;
/*
 * ��int����ƴ���ַ���
 * �÷������иĽ�
 */

public class StringArraryContect_23 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		String ss = show(arr);
		System.out.println("ת������ַ���Ϊ = "+ss);
		
	}
	
	public static String show(int[] arr) {
		String s = "";
		
		s +="{";
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s += arr[i];
				s +="}";
			}else {
				s += arr[i];
				s +=",";
			}
		}
		return s;
		
	}
}
