
class Goods{
	String shape;
	String kind;
	int number;
	float price;
	public void showprice(){
	    System.out.println("非会员价为"+price);
	}
	public void setprice(float price){
		this.price=price;
	}
}
class Milk extends Goods{
	String shape;
	String kind;
	int number;
	float price;
	float afterprice;
	public void showprice(){
		System.out.println("会员价"+0.8*afterprice);
	}
	public void setprice(float price){
		this.price=price;
	}
}
public class Text1 {
    public static void main(String[]args){
    	Milk milk =new Milk();
    	milk.price=3;
    	milk.afterprice=(float)2.6;
    	milk.showprice();
    }
    
}
