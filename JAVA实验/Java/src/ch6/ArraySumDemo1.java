package ch6;

//�������
public class ArraySumDemo1 {
	public static void main(String[] args) {
		//�����ά���鲢��ʼ��
		int[][] sold ={{22,66,44},{77,33,98},{25,45,65},{11,66,99}};
		
		int total = 0;//һ�����ȵ���������
		int sum = 0;//һ�����������
		//����
		for(int x=0;x<sold.length;x++) {
			for(int y=0;y<sold[x].length;y++) {
				//�������鲢�����ÿ�����ȵ�Ԫ��
				System.out.print(sold[x][y]+" ");
				total += sold[x][y];
				sum +=sold[x][y];
			}
			System.out.println();
			System.out.println("��"+(x+1)+"�����������۽��Ϊ��"+total+"��Ԫ");
			total = 0;
			
		}
		System.out.println("�ܵ�������Ϊ:"+sum+"��Ԫ");
		System.out.println("����������������������������������������������������");
	    sumArray(sold);
	}
	
	public static void sumArray(int[][] a) {
		int sum=0;
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<a[x].length;y++) {
				//�������鲢�����ÿ�����ȵ�Ԫ��
				System.out.print(a[x][y]+" ");
				sum += a[x][y];
			}
			System.out.println();
		}
		System.out.println("�ܵ�������Ϊ:"+sum+"��Ԫ");
	}

}
