package ch4;
/*���ڿ���̨�������������������λ��
  ��λ������λ
  ʮλ����ǧλ
  ��λ+ʮλ+ǧλ+��λ=��λ��
  ����ͳ�Ƴ����������ĸ���
*/
public class ForDemo2 {
	public static void main(String[]args) {
		int sum = 0;
		//��λ����Χ
		for(int i=10000;i<100000;i++) {
			int g,s,b,q,w;
			g = i%10;//��λ
			s = (i/10)%10;//ʮλ
			b = (i/100)%10;//��λ
			q = (i/1000)%10;//ǧλ
			w = i/10000;//��λ
			//�����ж�
			if(g==w&&s==q&&g+s+q+w==b) {
				System.out.print(i+"\t");
				sum++;
			}
		}	
		System.out.println("\n"+"������������λ�����У�"+sum);
	}
}
