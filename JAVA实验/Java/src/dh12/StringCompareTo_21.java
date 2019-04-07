package dh12;
/*String类的compareTo的源码查看
 * 
 */
		
public class StringCompareTo_21 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hel";
		
		System.out.println(s1.compareTo(s2));//2
	}
	
	
	//compareTo源码解析
	//value代表一个数字，表示使用了char[] toCharArray();//把字符串改变成字符数组
	/*
	   public int compareTo(String anotherString) {
        int len1 = value.length;   //代表s1.toCharArray().length;
        int len2 = anotherString.value.length;  //代表s2.toCharArray().length;
        int lim = Math.min(len1, len2);  //长度最小的为len2 = 3
        char v1[] = value;      //s1.toCharArray()
        char v2[] = anotherString.value;   //s2.toCharArray()

		//char v1[] ={'h','e','l','l','o'};
		//char v2[] ={'h','e','l'};
		
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;  //在不超过长度最小范围内用字典顺序进行比较
            }
            k++;
        }
        return len1 - len2;  //超过最小的长度范围时用长度值进行减法运算
    }
	 */
	

}
