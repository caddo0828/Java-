package ch2;
//���1��100��ǰ5�����Ա�3��������

public class OddSum {
	public static void main(String[] args){
		int sum=0,i=1;
		while(i<=100){
			if(i%3==0){
				sum++;//������������
				System.out.println(i);
			}
			if(sum==5){
				break;
			}
			i++;
		}
		
	}
		

}
