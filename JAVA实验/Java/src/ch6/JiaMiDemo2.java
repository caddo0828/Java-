package ch6;

/*
 * ��һ������������ʽת�䣬���ҽ�����Ӧ����
 */
import java.util.Scanner;

public class JiaMiDemo2 {
	public static void main(String[] args) {
		int number  = 123456;
		
		//��������
		int[] arr = new int[8];
		Scanner sc =new Scanner(System.in);
		int  x = sc.nextInt();
		
		//���������±�
		int index = 0;
	//�൱�ڰ������з�ת
		while(x > 0) {
			arr[index] = x%10;
			index++;
			x/=10;
		}
		
		//�������(�൱�������)
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		for(int i=0;i<index;i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp2 =arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp2;
		
		//���ܺ����
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]);
		}
	}

}
