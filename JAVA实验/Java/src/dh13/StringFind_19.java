package dh13;
/*�������ң���ͷ�ҵ�β  ��һ��������ģ�
 *�߼����ֲ��ң��԰��� ��ǰ����������������ģ�
 * 
 * ˼·��
 * 	  A:������С����min���������max
 * 	  B:������м�����mid
 * 	  C:���м�������ֵ��Ҫ���ҵ�Ԫ�ؽ��бȽ�
 *         ��� ����ֱ�ӷ��ص�ǰ���м�����
 *         �����
 *         		���ˣ��������
 *         		С�ˣ����ұ���
 *    D:���»�ȡ�������ֵ�Լ���С����ֵ    
 *          	���� ���������
 *          		max = mid-1;
 *     			С�ˣ����ұ���
 *     				min = mid+1;
 * 	  E:���»ص�Bλ��
 */
public class StringFind_19 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {15,26,39,47,56,64,87};
		
		int element = 69;
		
		int x = erFind(arr,element);
		System.out.println("index="+x);
		
		
	}
	
	//����ʵ��
	public static int erFind(int[] arr,int element) {
		//������С�������������
		int min = 0;
		int max = arr.length-1;
				
		//�����м�����
		int mid = (min+max)/2;
		
		while(arr[mid]!=element) {
			if(arr[mid]>element) {
				max = mid-1;
				mid = (min+max)/2;
			}else if(arr[mid]<element) {
				min = mid+1;
				mid =(min+max)/2;
			}
			
			if(min>max) {
				return -1;
			}
			
		}
		
		
		return mid;
	}
}
