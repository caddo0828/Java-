package dh13;
/*选择排序
 * 每个数要和所有的数进行排序
 * 
 */
public class StringChoiceSort_16 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		
		//进行选择排序前的数组序列
		System.out.println("排序前的数组为:");
		printArray(arr);
		
		System.out.println();
		
		//选择排序后的数组序列
		choiceSort(arr);
	}
	
	//遍历
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
	
	//选择排序
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
		System.out.println("选择排序后的数组为:");
		printArray(arr);
	}
	
}
