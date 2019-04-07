package ch7;

class Account {
	long id;//账号号码
	String password;//账号密码
	String name;//姓名
	String personID;//身份证号码
	String email;//电子邮箱
	double balance;//账户余额
	
	Account() {}
	
	Account(String password,String email) {
		this.password = password;
		this.email = email;	
	}
	
	public void deposit(double money) {
		balance += money;
		//System.out.println("账户余额为："+balance+"元");
	}
	
	public void withdraw(double money) {
		if(balance < money||balance < 100) {
			System.out.println("金额不足，无法取出！");
		}else {
			balance = balance-money;
		//	System.out.println("此次共取出："+money+"元");
		//	System.out.println("剩余存款："+balance);
		}
		
	}
	
	public void show() {
		System.out.println("账号号码: "+id+"\n"+
	                       "账号密码: "+password+"\n"+
	                       "姓名: "+name+"\n"+
	                       "身份证号码: "+personID+"\n"+
	                       "电子邮箱: "+email+"\n"+
							"账户余额: "+balance);
	}
	
}

public class Day7Demo2 {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.id=2108163365;
		ac.password="123456";
		ac.name="张张";
		ac.personID="9854298";
		ac.email="2108163365@qq.com";
		ac.deposit(2000);
		ac.withdraw(500);
		ac.show();
		
		System.out.println("------------------------");
		
		Account ac2 = new Account("111111","jxau.com");
		ac2.id = 1234;
		ac2.name = "江江";
		ac.personID = "1234567";
		ac2.deposit(150);
		ac2.withdraw(200);
		ac2.show();
		
		
	}

}
