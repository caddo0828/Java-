package dh12;
/*ͳ�ƴ���С�����ֵĴ���
 * 1�����������ַ���
 *    A������һ����
 *    B������һ��С��
 * 2������ͳ�Ʊ���
 * 3���жϵ�һ���Ƿ����
 *   <1> ����index����һ��ֵ
 *  	��������count++;
 *  	��ʼλ�õ�index = index+С�����ַ�����
 *      ��ȡ�󴮣������µĴ󴮣�����ֵ����
 *   <2> ���򷵻�-1
 * 4��������ͳ�Ʊ�����1
 * 5���������
 * 
 */
public class StringFind_25 {
	public static void main(String[] args) {
		//����һ���ַ���
		String f = "javaandlinuxandjavawebandandroid";
		
		//����С��
		String s = "java";
		
		//�������
		int count = getCount(f,s);
		System.out.println("С���ڴ��г��ֵĴ���Ϊ: "+count);
		
	}
 /*     
	public static int getCount(String maxString ,String minString) {
		//����ͳ�Ʊ���
		int count = 0;
		
		//����һ����ʼ����
		int index = maxString.indexOf(minString);
		
		while(index!=-1) {
				count++;
			//	int StartIndex = index+minString.length();
			//	maxString = maxString.substring(StartIndex);
				maxString = maxString.substring(index+minString.length());
				index = maxString.indexOf(minString);	
			
		 }
	
		return count;
	}
	*/
	
	//�����Ż�
	public static int getCount(String maxString ,String minString) {
		//����ͳ�Ʊ���
		int count = 0;
		
		int index;
		while((index=maxString.indexOf(minString))!=-1) {
			count++;
			maxString = maxString.substring(index+minString.length());
		}
	
		return count;
	}

}
