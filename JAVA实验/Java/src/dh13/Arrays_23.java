package dh13;

import java.util.Arrays;

import javax.sound.midi.Synthesizer;

/*Arrays数组工具类的使用
 * 
 * 
 */
public class Arrays_23 {
	public static void main(String[] args) {
		int[] arr = {14,56,37,48,69,21};
		
		String s = Arrays.toString(arr);
		System.out.println("排序前的数组转换成字符串为: "+s);
		
		//排序
		Arrays.sort(arr);
		System.out.println("排序后:"+Arrays.toString(arr));
		
		//二分查找
		int x = Arrays.binarySearch(arr, 48);
		System.out.println(x);
	}

}
