package ch1;
import java.util.Scanner;
//键盘录入数据判断等级
public class IfDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>90&&score<=100) {
			System.out.println("very good");
		} 
		else if(score>80&&score<=90) {
			System.out.println("good");
		}else if(score>60&&score<=80) {
			System.out.println("soso");
		}
		else{
			System.out.println("worse");
		}
		
	}

}
