package dh14;

import java.util.Arrays;

/*将字符串“91 27 46 38 50”
 * 用代码实现输出结果为：“27 38 46 50 91”
 * 
 */
public class String_Split_8 {
	public static void main(String[] args) {
		String string = "91 27 46 38 50";
		String[] chs = string.split(" ");
		//遍历每个字符，将字符转成int类型的数据
		int[] arr = new int[chs.length];
		for(int i=0;i<chs.length;i++) {
			 arr[i] = Integer.parseInt(chs[i]);
		}
		Arrays.sort(arr);
		
		StringBuffer buffer = new StringBuffer();
		for(int x =0;x<arr.length;x++) {
			buffer.append(arr[x]+" ");
		}
		
		String s = buffer.toString().trim();
		System.out.println(s);
		
	}

}
