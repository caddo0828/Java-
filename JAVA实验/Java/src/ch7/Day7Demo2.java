package ch7;

class Account {
	long id;//�˺ź���
	String password;//�˺�����
	String name;//����
	String personID;//���֤����
	String email;//��������
	double balance;//�˻����
	
	Account() {}
	
	Account(String password,String email) {
		this.password = password;
		this.email = email;	
	}
	
	public void deposit(double money) {
		balance += money;
		//System.out.println("�˻����Ϊ��"+balance+"Ԫ");
	}
	
	public void withdraw(double money) {
		if(balance < money||balance < 100) {
			System.out.println("���㣬�޷�ȡ����");
		}else {
			balance = balance-money;
		//	System.out.println("�˴ι�ȡ����"+money+"Ԫ");
		//	System.out.println("ʣ���"+balance);
		}
		
	}
	
	public void show() {
		System.out.println("�˺ź���: "+id+"\n"+
	                       "�˺�����: "+password+"\n"+
	                       "����: "+name+"\n"+
	                       "���֤����: "+personID+"\n"+
	                       "��������: "+email+"\n"+
							"�˻����: "+balance);
	}
	
}

public class Day7Demo2 {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.id=2108163365;
		ac.password="123456";
		ac.name="����";
		ac.personID="9854298";
		ac.email="2108163365@qq.com";
		ac.deposit(2000);
		ac.withdraw(500);
		ac.show();
		
		System.out.println("------------------------");
		
		Account ac2 = new Account("111111","jxau.com");
		ac2.id = 1234;
		ac2.name = "����";
		ac.personID = "1234567";
		ac2.deposit(150);
		ac2.withdraw(200);
		ac2.show();
		
		
	}

}
