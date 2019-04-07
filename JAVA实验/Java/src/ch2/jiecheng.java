package ch2;

public class jiecheng {
	public static void main(String args[]){
	/*	int j=1,sum=0;
		for(int i=1;i<=10;i++){
			j=j*i;
			sum=sum+j;
		}
		System.out.println("sum="+sum);
	*/
		int a=1,b=1,total=0;
		do{
			b=a*b;
			total=total+b;
			a++;
		}while(a<=10);
		System.out.println("total="+total);
	}                                  

}
