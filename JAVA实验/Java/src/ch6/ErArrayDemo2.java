package ch6;
/*
 * ��ӡ�������(�������Լ���¼��)
 * 1 
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
import java.util.Scanner;

public class ErArrayDemo2 {
	public static void main(String[] args) {
		//��ȡ����¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("����������");
		int x = sc.nextInt();
		
		//��������
		int[][] arr= new int[x][x];
		
		for(int i=0;i<arr.length;i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		
		for(int i=2;i<arr.length;i++) {
			for(int j=1;j<=i-1;j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
			
		}
		//��������
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	

}
