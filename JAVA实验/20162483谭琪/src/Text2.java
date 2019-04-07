
class Telephone {
	  char number;
	  double ye;//余额
	  double yce;//话费预存额
	  public void telephoneCharge(double time){
		  double money;
		  money=0.3+(time-3)*0.1;
		  ye=yce-money;
		  System.out.println("使用话费为"+money);
		  System.out.println("余额为"+ye);
	  }
	  public void telephoneCharge(){
		  double time=5;
		  double money;
		  money=time*0.1;
		  ye=yce-money;
		  System.out.println("使用话费为"+money);
		  System.out.println("余额为"+ye);
	  }
}

public class Text2 {
	public static void main(String[] args){
		Telephone tp1=new Telephone();
		tp1.number=(char)10086;
		tp1.yce=10;
		tp1.telephoneCharge(10);
		System.out.println();
		Telephone tp2=new Telephone();
		tp2.number=(char)10010;
		tp2.yce=20;
		tp2.telephoneCharge();
	}
}