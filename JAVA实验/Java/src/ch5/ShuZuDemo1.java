package ch5;
//�����Լ���ʼ��
/*
 * int[] a;
 * int a[]
 *��̬��ʼ�� int[] a = new int[3];
 * ��ȡ����Ԫ��   ������[����]  a[0];
 * int[] arr = new int[3]; ��̬��ʼ��
   System.out.println(arr);����������ڵĵ�ַ(���������)
   System.out.println(arr[0]);��������е�һ������,δ���и�ֵ
 *  
 */
public class ShuZuDemo1 {
	public static void main(String[] args) {
		//��ʼ����������
		int[] arr = new int[3];
        //������������е�һ��Ԫ��
		System.out.println(arr[0]);
		//���������飬���ұ���������
		System.out.println("��������Ԫ��");
		int[] a = {4,25,13,2,49,66};
		for(int i=0;i<a.length ;i++) {
			System.out.println(a[i]);
		}
		//��������
		System.out.println("����������������������������������������");
		printArray(a);
		
		System.out.println();
		System.out.println("����������������������������������������");
		System.out.println("���������Ԫ��Ϊ��");
		maxArray(a);
		
		//������������ķ�ʽ���
		System.out.println("����������Ϊ��");
		inverseArray(a);
		printArray(a);
		
	}

	//�÷���ʵ�ֱ������飬��{4��25��13��2��49��66}����ʽ�������
	public static void printArray(int[] arr) {
		System.out.print("{");
		for(int i=0;i<arr.length ;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+"}");
			}else {
				System.out.print(arr[i]+",");
			}
			
		}
	}
	
	//��ȡ�����е����ֵ
	public static void maxArray(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	//���������������ʽ���
	public static void inverseArray(int[] arr) {
		for(int i=0;i<(arr.length)/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	
	}
	
}
