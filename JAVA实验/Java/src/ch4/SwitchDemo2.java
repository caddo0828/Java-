package ch4;
/*
 根据键盘录入的字符串，判断是否有满足要求的数据
 否则提示错误
 */
import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[]args) {
/*		//键盘录入对象
		Scanner sc = new Scanner(System.in);
		//录入数据,对象字符串类型
		System.out.println("输入你要进行匹配的字符串：");
		String str = sc.nextLine();
		
		switch(str){
			case "hello":
				System.out.println("你输入的字符串为hello");
				break;
			case "java":
				System.out.println("你输入的字符串为java");
				break;
		    default:
		    	System.out.println("输入的字符串无对应");
		    	break;
		
		}
		*/
		
		//键盘录入数据，用switch语句判断是什么月份
		//键盘录入对象
		Scanner sc = new Scanner(System.in);
		//录入数据,对象字符串类型
	    System.out.println("输入你要进行判断的月份:");
	    int month = sc.nextInt();
	    
	    switch(month) {
	    	case 3:
	    	case 4:
	    	case 5:
	    		System.out.println("春");
	    		break;
	    	case 6:
	    	case 7:
	    	case 8:
	    		System.out.println("夏");
	    		break;
	    	case 9:
	    	case 10:
	    	case 11:
	    		System.out.println("秋");
	    		break;
	    	case 12:
	    	case 1:
	    	case 2:
	    		System.out.println("冬");
	    		break;
	    		default:
	    			System.out.println("输入月份有误");
	    			break;
	    
	    }
				
	}

}
