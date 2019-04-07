package ch2;
//输出101到200内的质数；
public class ZhiShu {
	public static void main(String[] args){
		int sum=0;
		boolean flag=true;//质数
		for(int i=101;i<=200;i+=2){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;//此时i不是质数
					break;
				}
			}
			if(!flag){
				continue;
			}
			sum++;
			System.out.println(i);
		}
		System.out.println("质数的总个数为："+sum);
	}

}
