package ch8;
/**
 * 
 * @author 老腰
 * @version v1.0
 */
public class ArrayToolDemo {
	
	private ArrayToolDemo() {}//私有化构造函数，只能通过类名调用
	
	/**
	 * @param arr 遍历数组
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
	 * @param arr 遍历数组
	 * @return 返回数组中的最大值
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
	 * 获取指定元素在数组中第一次出现的索引，如果元素不存在，则返回-1
	 * @param arr 被查找的数组
	 * @param value  要查找的元素
	 * @return  返回对应查找到的索引，不存在返回-1
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
