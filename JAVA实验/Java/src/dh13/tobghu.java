package dh13;
/*
 * 统计大串中含有小串的次数
 */
public class tobghu {
	public static void main(String[] args) {
		String s1 = "javawebandjavaandnumber";
		String s2 = "and";
		int i = isContains(s1,s2);
		System.out.println(i);
		
	}
	
	public static int isContains(String s1,String s2) {
		int count = 0;
		
		int index = s1.indexOf(s2);
		
		while(index!=-1) {
			count++;
			s1 = s1.substring(index+s2.length());
			index = s1.indexOf(s2);
		}
		
		
		return count;
	}
	
}


