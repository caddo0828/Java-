package ch5;

//数组查表法，根据键盘录入索引，查找对应星期
import java.util.Scanner;

public class ShuZuDemo2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
        //键盘录入 索引值
		int x = sc.nextInt();
        
        //定义一个字符串数组
        String[] arr = {"星期一","星期二","星期三"};
        
        System.out.println(arr[x]);
       
        
        System.out.println("————————————————————");
        //定义一个数组
        int[] a = {25,12,20,2,13,2,64};
        
        //遍历数组(找出数组中相同出现的数据，并且找出最早出现时的下标，计算出现次数)
        int sum = 0;
        for(int i=0;i<a.length;i++) {
        	for(int j=1;(j+i)<a.length ;j++) {
        		if(a[i]==a[i+j]) {
        			sum++;
        			System.out.println("数组中相同数据出现的是:"+a[i]+"\t");
        			System.out.println("且最早出现的下标为："+i);
        		}   
        	}
        	
        }System.out.println("有"+sum+"个数据是重复出现的");
        
        System.out.println("————————————————————");
        //数据元素查找(找出指定的元素第一次在数组中出现的索引)
        int[] b ={60,20,16,24,83,20};
        
        //遍历查找
      /*  for(int i=0;i<b.length;i++) {
        	for(int j=1;(j+i)<b.length;j++) {
        		if(b[i]==b[i+j]&&b[i]==20) {
            		System.out.println(i);
            	}
        	}
        }
       */
        
        for(int i=0;i<b.length;i++) {
        	if(b[i]==20) {
        		System.out.println(i);
        		break;//直接跳出循环，输出的就是第一个值
        	}
        }
  
	}

}
