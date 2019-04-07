package ch6;

//数组求和
public class ArraySumDemo1 {
	public static void main(String[] args) {
		//定义二维数组并初始化
		int[][] sold ={{22,66,44},{77,33,98},{25,45,65},{11,66,99}};
		
		int total = 0;//一个季度的总销售量
		int sum = 0;//一年的总销售量
		//遍历
		for(int x=0;x<sold.length;x++) {
			for(int y=0;y<sold[x].length;y++) {
				//遍历数组并且输出每个季度的元素
				System.out.print(sold[x][y]+" ");
				total += sold[x][y];
				sum +=sold[x][y];
			}
			System.out.println();
			System.out.println("第"+(x+1)+"个季度总销售金额为："+total+"万元");
			total = 0;
			
		}
		System.out.println("总的年收入为:"+sum+"万元");
		System.out.println("——————————————————————————");
	    sumArray(sold);
	}
	
	public static void sumArray(int[][] a) {
		int sum=0;
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<a[x].length;y++) {
				//遍历数组并且输出每个季度的元素
				System.out.print(a[x][y]+" ");
				sum += a[x][y];
			}
			System.out.println();
		}
		System.out.println("总的年收入为:"+sum+"万元");
	}

}
