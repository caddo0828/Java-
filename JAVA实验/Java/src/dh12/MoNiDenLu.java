package dh12;
//模拟用户登录
//13
import java.util.Scanner;

public class MoNiDenLu {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		for(int i=0;i<3;i++){
		//x=0,1,2
		//键盘录入用户名和密码
		Scanner sc = new Scanner(System.in);
		
		//键盘录入数据
		System.out.println("请输入用户名");
		String name = sc.nextLine();
		System.out.println("请输入用户密码");
		String pwd = sc.nextLine();
		
		//用户名及密码都正确，则登录成功，否则失败
		if(name.equals(username)&&pwd.equals(password)) {
			System.out.println("登录成功!");
			//跳转到猜数字游戏界面
			System.out.println("欢迎进入猜数字游戏：");
			GuessNumberGame.start();
			break;
		}else {
			//机会为0，账号被锁定
			if((2-i)==0) {
				System.out.println("账号被锁定，请与客服联系");
			}else {
				//还有2，1，0次机会
				System.out.println("登录失败"+(2-i)+"次机会");
			}
		}
	}
	}
	

}
