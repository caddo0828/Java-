package dh12;
/*String���compareTo��Դ��鿴
 * 
 */
		
public class StringCompareTo_21 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hel";
		
		System.out.println(s1.compareTo(s2));//2
	}
	
	
	//compareToԴ�����
	//value����һ�����֣���ʾʹ����char[] toCharArray();//���ַ����ı���ַ�����
	/*
	   public int compareTo(String anotherString) {
        int len1 = value.length;   //����s1.toCharArray().length;
        int len2 = anotherString.value.length;  //����s2.toCharArray().length;
        int lim = Math.min(len1, len2);  //������С��Ϊlen2 = 3
        char v1[] = value;      //s1.toCharArray()
        char v2[] = anotherString.value;   //s2.toCharArray()

		//char v1[] ={'h','e','l','l','o'};
		//char v2[] ={'h','e','l'};
		
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;  //�ڲ�����������С��Χ�����ֵ�˳����бȽ�
            }
            k++;
        }
        return len1 - len2;  //������С�ĳ��ȷ�Χʱ�ó���ֵ���м�������
    }
	 */
	

}
