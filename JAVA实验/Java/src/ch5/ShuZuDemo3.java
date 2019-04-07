package ch5;

public class ShuZuDemo3 {
	public static void main(String[] args) {
		//初始化数组
		int[] arr ={60,20,16,24,83};
		System.out.println(getIndex1(arr,200));
		
		System.out.println("第二种方法：");
		int index = getIndex2(arr,83);
		System.out.println("对应数据的索引下标为："+index);
	}
	
	public static int getIndex1(int[] arr,int value) {
		  for(int i=0;i<arr.length;i++) {
	        	if(arr[i]==value) {
	        		return i;
	        	}
	        }
		  //只要是判断就有可能是错误的，若找不到的话就用一个负数输出
		  return -1;
	}
	
	public static int getIndex2(int[] arr,int value) {
		//定义索引用于保存下标
		int index = -1;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==value) {
				//满足条件，修改下标
				index = j;
			  //  return index;
				break;
			}
			
		}
		
		//return -1;
		return index;
	}
	

}
