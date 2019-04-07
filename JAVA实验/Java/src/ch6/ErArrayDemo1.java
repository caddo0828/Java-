package ch6;

/*
 * (1)数据类型[][] arr = new 数据类型[m][n];
 * m表示有几个一维数组，n表示每个一维数组的元素个数
 * 
 * (2) 数据类型[][] arr =new 数据类型[m][];
 * 每个一维数组的元素个数未定,即列数可变
 * 
 * (3)一个二维数组配合一个编号代表一维数组名(地址值或者null)。二维数组名配合两个编号代表二维数组元素
 * 
 * (4)静态初始化
 *   数据类型[][] arr = new 数据类型[][]{{},{},{}...};
 *   
 *   数据类型[][] arr ={{},{},{}....};
 * 
 */
public class ErArrayDemo1 {
	public static void main(String[] args) {
	    //第一种定义数组
		int[][] arr = new int[3][2];
		System.out.println(arr);//地址值
		System.out.println(arr[0]);//输出一维数组地址值 ，代表一维数组名字
		System.out.println(arr[0][0]);//代表二维数组元素
		
		System.out.println("———————————————————");
		//第二种定义方式
		int[][]  b = new int[3][];
		System.out.println(b);//地址值
		System.out.println(b[0]);//null值，为给一维数组分配空间
		
		//动态的为每个一维数组分配空间
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		System.out.println("——————————————————");
		System.out.println(b[0]);//地址值
		
		int[][] c ={{1,2,3},{4,5,6},{7,8,9}};
		/*
		 外循环控制的是一维数组的个数
		 内循环控制的是一维数组元素的个数
		 */
		System.out.println("遍历二维数组：第一种情况");
		//遍历二维数组(维数相同)

		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("遍历二维数组的第二种情况:");
		//遍历二维数组(维数不同)
		int[][] d={{1,2},{2,3,4},{4,5,6,7},{7,8,9,10}};
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("——————————————————————");
		//用方法来遍历二维数组元素
		getArray(d);
		
   	}
	
	public static void getArray(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
