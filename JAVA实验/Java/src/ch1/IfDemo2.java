package ch1;

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		//����¼������
		Scanner sc = new Scanner(System.in);
        //����x��ֵ
		System.out.println("������x��ֵ��");
		int x = sc.nextInt();
        //����һ��y
		int y=0;
		//�����ж�
        if(x>=3) {
        	y = 2*x+1;
        	System.out.println(y);
        }else if(x<=-1&&x<3) {
        	y = 2*x;
        	System.out.println(y);
        }else if(x<=-1) {
        	y = 2*x-1;
        	System.out.println(y);
        }
   
	
	}

}
