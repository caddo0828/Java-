package ch2;

public class Flower {
	public static void main(String[]args){
		int sum=0;
		for(int i=1;i<=500;i++){
			double a,b,c,d;
			a=i%10;//个位
			b=(i/10)%10;//十位
			c=(i/100)%10;//百位
			d=(i/1000)%10;//千位
	        double j=Math.pow(a, 3);//求某个数的几次方
	        double k=Math.pow(b, 3);
	        double r=Math.pow(c, 3);
			if(j+k+r==i){
				sum++;
				System.out.println(i);
			}
			
	  }System.out.println("水仙花个数为："+sum);

		
	}

}
