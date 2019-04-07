package dh14;
/*正则表达式的分割功能  String[] split(String regex);
 */
public class Spilt_7 {
	public static void main(String[] args) {
		String string = "aa,bb,cc";
		String[] arr = string.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		//. 分割  直接写.表示的是任意字符    如果要表示成.的话要写成\\.
		String string2 = "aa.bb.cc";
		String[] arr2 = string2.split("\\.");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("--------------------------");
		//对路径进行分割，应该将\改成\\   对应正则表达式两个\\对应路径上一个\
		String string3 = "D:\\新建文件夹\\images";
		String[] arr3 = string3.split("\\\\");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("----------------------------");
		//对若干个空格进行分割
		String string4 = "caddo  tq        minc";
		String[] arr4 = string4.split(" +");
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
	}

}
