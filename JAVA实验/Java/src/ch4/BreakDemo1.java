package ch4;

/*ʵ�ֳ�����жϽ���
  ȡ��ǩ��ʵ�������ж�    ��ǩ�������
*/

public class BreakDemo1 {
	public static void main(String[] args) {
	wc:	for(int i=1;i<=5;i++) {
		nc:	for(int j=1;j<=4;j++) {
				if(j==3) {
					break nc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
