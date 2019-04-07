package ch4;

public class ForForDemo1 {
	public static void main(String[] args) {
		//四行五列的星星
		for(int i=1;i<=4;i++) {
			 for(int j=1;j<=5;j++) {
				 System.out.printf("*");
			 }
			 System.out.println();
		 }
		 System.out.println("————————————————————");
		//正三角形 
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		System.out.println("-------------------");
		//倒三角形
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//正的九九乘法表
		System.out.println("—————————————————————");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("—————————————————————————");
		//倒的九九乘法表
		for(int x=1;x<=9;x++) {
			for(int y=9;y>=x;y--) {
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}

}
