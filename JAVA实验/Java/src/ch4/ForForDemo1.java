package ch4;

public class ForForDemo1 {
	public static void main(String[] args) {
		//�������е�����
		for(int i=1;i<=4;i++) {
			 for(int j=1;j<=5;j++) {
				 System.out.printf("*");
			 }
			 System.out.println();
		 }
		 System.out.println("����������������������������������������");
		//�������� 
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		System.out.println("-------------------");
		//��������
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//���ľžų˷���
		System.out.println("������������������������������������������");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("��������������������������������������������������");
		//���ľžų˷���
		for(int x=1;x<=9;x++) {
			for(int y=9;y>=x;y--) {
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}

}
