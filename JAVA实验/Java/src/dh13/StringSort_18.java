package dh13;
/*���ַ�����������    ���磺dabcge
 *1�����ַ�����ַ�����
 *2������
 *3��ð������ѡ������
 *4�����ַ�����ת�����ַ���valueOf();//����ת��Ϊ��������
 *5���¶���һ���ַ������ڽ�����������ת������ַ����� 
 *
 */
public class StringSort_18 {
	public static void main(String[] args) {
		//����һ���ַ���
		String string = "dabcge";
		
		//���ַ�������ַ�����
		char[] ch = string.toCharArray();
		
		//ð������
		bubbleSort(ch);
		
		String str = String.valueOf(ch);
		System.out.println("ð������������ַ���Ϊ: "+str);
		
		//ѡ������
		choiceSort(ch);
		
		String str2 = String.valueOf(ch);
		System.out.println("ѡ���������ַ���Ϊ: "+str2);
		
	}
	
	//��������
	public static void printArray(char[] ch) {
		System.out.print("[");
		for(int i=0;i<ch.length;i++) {
			if(i!=ch.length) {
				System.out.print(ch[i]+",");
			}else {
				System.out.print(ch[i]);
			}
			System.out.print("]");
		}
	}
	
	//ð������
	public static void bubbleSort(char[] ch) {
		for(int x=0;x<ch.length-1;x++) {
			for(int y=0;y<ch.length-1-x;y++) {
				if(ch[y]>ch[y+1]) {
					char c = ch[y];
					ch[y] = ch[y+1];
					ch[y+1] = c;
				}
			}
		}
	}
	
	//ѡ������
	public static void choiceSort(char[] ch) {
		for(int x=0;x<ch.length-1;x++) {
			for(int y=x+1;y<ch.length;y++) {
				if(ch[x]>ch[y]) {
					char c = ch[x];
					ch[x] = ch[y];
					ch[y] = c;
				}
			}
		}
	}
	
}
