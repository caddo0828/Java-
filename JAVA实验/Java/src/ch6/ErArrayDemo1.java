package ch6;

/*
 * (1)��������[][] arr = new ��������[m][n];
 * m��ʾ�м���һά���飬n��ʾÿ��һά�����Ԫ�ظ���
 * 
 * (2) ��������[][] arr =new ��������[m][];
 * ÿ��һά�����Ԫ�ظ���δ��,�������ɱ�
 * 
 * (3)һ����ά�������һ����Ŵ���һά������(��ֵַ����null)����ά���������������Ŵ����ά����Ԫ��
 * 
 * (4)��̬��ʼ��
 *   ��������[][] arr = new ��������[][]{{},{},{}...};
 *   
 *   ��������[][] arr ={{},{},{}....};
 * 
 */
public class ErArrayDemo1 {
	public static void main(String[] args) {
	    //��һ�ֶ�������
		int[][] arr = new int[3][2];
		System.out.println(arr);//��ֵַ
		System.out.println(arr[0]);//���һά�����ֵַ ������һά��������
		System.out.println(arr[0][0]);//�����ά����Ԫ��
		
		System.out.println("��������������������������������������");
		//�ڶ��ֶ��巽ʽ
		int[][]  b = new int[3][];
		System.out.println(b);//��ֵַ
		System.out.println(b[0]);//nullֵ��Ϊ��һά�������ռ�
		
		//��̬��Ϊÿ��һά�������ռ�
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		System.out.println("������������������������������������");
		System.out.println(b[0]);//��ֵַ
		
		int[][] c ={{1,2,3},{4,5,6},{7,8,9}};
		/*
		 ��ѭ�����Ƶ���һά����ĸ���
		 ��ѭ�����Ƶ���һά����Ԫ�صĸ���
		 */
		System.out.println("������ά���飺��һ�����");
		//������ά����(ά����ͬ)

		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("������ά����ĵڶ������:");
		//������ά����(ά����ͬ)
		int[][] d={{1,2},{2,3,4},{4,5,6,7},{7,8,9,10}};
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("��������������������������������������������");
		//�÷�����������ά����Ԫ��
		getArray(d);
		
   	}
	
	public static void getArray(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
