package ch5;
//定义以及初始化
/*
 * int[] a;
 * int a[]
 *动态初始化 int[] a = new int[3];
 * 获取数组元素   数组名[索引]  a[0];
 * int[] arr = new int[3]; 动态初始化
   System.out.println(arr);输出数组所在的地址(输出数组名)
   System.out.println(arr[0]);输出数组中第一个数据,未进行赋值
 *  
 */
public class ShuZuDemo1 {
	public static void main(String[] args) {
		//初始化定义数组
		int[] arr = new int[3];
        //用于输出数组中第一个元素
		System.out.println(arr[0]);
		//定义新数组，并且遍历该数组
		System.out.println("遍历数组元素");
		int[] a = {4,25,13,2,49,66};
		for(int i=0;i<a.length ;i++) {
			System.out.println(a[i]);
		}
		//遍历数组
		System.out.println("————————————————————");
		printArray(a);
		
		System.out.println();
		System.out.println("————————————————————");
		System.out.println("数组中最大元素为：");
		maxArray(a);
		
		//将数组以逆序的方式输出
		System.out.println("逆序后的数组为：");
		inverseArray(a);
		printArray(a);
		
	}

	//用方法实现遍历数组，以{4，25，13，2，49，66}的形式输出数组
	public static void printArray(int[] arr) {
		System.out.print("{");
		for(int i=0;i<arr.length ;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+"}");
			}else {
				System.out.print(arr[i]+",");
			}
			
		}
	}
	
	//获取数组中的最大值
	public static void maxArray(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	//将数组以逆序的形式输出
	public static void inverseArray(int[] arr) {
		for(int i=0;i<(arr.length)/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	
	}
	
}
