package dh13;
/*ð������
 * ��ʽ��
 */
public class StringBubbleSort_15 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		
		//�������
		System.out.println("�������ǰ�����飺");
		printArray(arr);
		
		System.out.println();
		
		//����ð�����򷽷����
		bubbleSort(arr);
		
	}
    
	//����
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
		System.out.print("]");
	}
	//ð������
	public static void bubbleSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++) {
			for(int y=0;y<arr.length-1-x;y++) {
				if(arr[y]>arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
		System.out.println("ð������������Ϊ�� ");
		printArray(arr);
	}
	
	
	
}
