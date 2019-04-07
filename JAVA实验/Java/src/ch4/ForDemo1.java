package ch4;

//水仙花数 
public class ForDemo1 {
	public static void main(String[] args) {
        int a,b,c;
        int sum = 0;
        //水仙花数的范围
		for(int i=100;i<1000;i++) {
        	a = i%10;//个位
        	b = (i/10)%10;//十位
        	c = (i/100)%10;//百位
        	if(i==(a*a*a+b*b*b+c*c*c)){
        		sum++;
        		System.out.println(i);
        	}
        }
		System.out.println("总的水仙花数为:"+sum);
	}

}
