package dh13;
/*基本查找：从头找到尾  （一般是无序的）
 *高级二分查找：对半找 （前提条件必须是有序的）
 * 
 * 思路：
 * 	  A:定义最小索引min，最大索引max
 * 	  B:计算出中间索引mid
 * 	  C:拿中间索引的值与要查找的元素进行比较
 *         相等 ，就直接返回当前的中间索引
 *         不相等
 *         		大了，往左边找
 *         		小了，往右边找
 *    D:重新获取最大索引值以及最小索引值    
 *          	大了 ，往左边找
 *          		max = mid-1;
 *     			小了，往右边找
 *     				min = mid+1;
 * 	  E:重新回到B位置
 */
public class StringFind_19 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {15,26,39,47,56,64,87};
		
		int element = 69;
		
		int x = erFind(arr,element);
		System.out.println("index="+x);
		
		
	}
	
	//功能实现
	public static int erFind(int[] arr,int element) {
		//定义最小索引，最大索引
		int min = 0;
		int max = arr.length-1;
				
		//定义中间索引
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
