package ch4;

//ˮ�ɻ��� 
public class ForDemo1 {
	public static void main(String[] args) {
        int a,b,c;
        int sum = 0;
        //ˮ�ɻ����ķ�Χ
		for(int i=100;i<1000;i++) {
        	a = i%10;//��λ
        	b = (i/10)%10;//ʮλ
        	c = (i/100)%10;//��λ
        	if(i==(a*a*a+b*b*b+c*c*c)){
        		sum++;
        		System.out.println(i);
        	}
        }
		System.out.println("�ܵ�ˮ�ɻ���Ϊ:"+sum);
	}

}
