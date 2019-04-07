package dh13;
/*冒泡排序
 * 方式：
 */
public class StringBubbleSort_15 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		
		//遍历输出
		System.out.println("输出排序前的数组：");
		printArray(arr);
		
		System.out.println();
		
		//调用冒泡排序方法输出
		bubbleSort(arr);
		
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
	//冒泡排序
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
		System.out.println("冒泡排序后的数组为： ");
		printArray(arr);
	}
	
	
	
}
