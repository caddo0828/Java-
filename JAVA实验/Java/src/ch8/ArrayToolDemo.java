package ch8;
/**
 * 
 * @author ����
 * @version v1.0
 */
public class ArrayToolDemo {
	
	private ArrayToolDemo() {}//˽�л����캯����ֻ��ͨ����������
	
	/**
	 * @param arr ��������
	 */
	public static void printArray(int[] arr) {
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+".");
			}else {
				System.out.print(arr[i]+",");
			}
		
		}
		
		System.out.println("}");
		
	}
	
	/**
	 * @param arr ��������
	 * @return ���������е����ֵ
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max = arr[i];
			 }
		 }
		 
		 return max;
	}
	
	/**
	 * ��ȡָ��Ԫ���������е�һ�γ��ֵ����������Ԫ�ز����ڣ��򷵻�-1
	 * @param arr �����ҵ�����
	 * @param value  Ҫ���ҵ�Ԫ��
	 * @return  ���ض�Ӧ���ҵ��������������ڷ���-1
	 */
	public static int getIndex(int[] arr,int value) {
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				index = i;
				break;
			}
		}
		
		return index;
	} 

}
