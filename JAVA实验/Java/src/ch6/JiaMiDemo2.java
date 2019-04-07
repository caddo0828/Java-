package ch6;

/*
 * 将一个数用数组形式转变，并且进行相应加密
 */
import java.util.Scanner;

public class JiaMiDemo2 {
	public static void main(String[] args) {
		int number  = 123456;
		
		//定义数组
		int[] arr = new int[8];
		Scanner sc =new Scanner(System.in);
		int  x = sc.nextInt();
		
		//定义索引下标
		int index = 0;
	//相当于把数进行翻转
		while(x > 0) {
			arr[index] = x%10;
			index++;
			x/=10;
		}
		
		//输出数据(相当于逆序后)
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		for(int i=0;i<index;i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp2 =arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp2;
		
		//加密后遍历
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]);
		}
	}

}
