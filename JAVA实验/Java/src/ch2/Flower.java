package ch2;

public class Flower {
	public static void main(String[]args){
		int sum=0;
		for(int i=1;i<=500;i++){
			double a,b,c,d;
			a=i%10;//��λ
			b=(i/10)%10;//ʮλ
			c=(i/100)%10;//��λ
			d=(i/1000)%10;//ǧλ
	        double j=Math.pow(a, 3);//��ĳ�����ļ��η�
	        double k=Math.pow(b, 3);
	        double r=Math.pow(c, 3);
			if(j+k+r==i){
				sum++;
				System.out.println(i);
			}
			
	  }System.out.println("ˮ�ɻ�����Ϊ��"+sum);

		
	}

}
