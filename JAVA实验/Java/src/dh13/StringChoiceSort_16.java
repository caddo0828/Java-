package dh13;
/*ѡ������
 * ÿ����Ҫ�����е�����������
 * 
 */
public class StringChoiceSort_16 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		
		//����ѡ������ǰ����������
		System.out.println("����ǰ������Ϊ:");
		printArray(arr);
		
		System.out.println();
		
		//ѡ����������������
		choiceSort(arr);
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
	
	//ѡ������
	public static void choiceSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
		System.out.println("ѡ������������Ϊ:");
		printArray(arr);
	}
	
}
