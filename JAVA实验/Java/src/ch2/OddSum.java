package ch2;
//输出1到100内前5个可以被3整除的数

public class OddSum {
	public static void main(String[] args){
		int sum=0,i=1;
		while(i<=100){
			if(i%3==0){
				sum++;//计数器的作用
				System.out.println(i);
			}
			if(sum==5){
				break;
			}
			i++;
		}
		
	}
		

}
