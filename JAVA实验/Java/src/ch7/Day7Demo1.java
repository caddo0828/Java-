package ch7;

class WuMingFen {
	String theMa;//面码
	int quantity;//粉的分量
	boolean likeSoup;//是否带汤
	
	//无参构造
	WuMingFen() {}
	
	//三个参数的构造
	WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	
	//两个参数的构造
	WuMingFen(String theMa,int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
	}
	
	public void check() {
		System.out.println(theMa+" "+quantity+" "+likeSoup);
	}
	
}

public class Day7Demo1 {
	public static void main(String[] args) {
		WuMingFen w1 =new WuMingFen("牛肉",3,true);
		w1.check();
		
		System.out.println("----------------");
		
		WuMingFen w2 =new WuMingFen("牛肉",2);
		w2.check();
		
		System.out.println("----------------");
		
		WuMingFen w3 =new WuMingFen();
		w3.theMa = "羊肉";
		w3.quantity = 6;
		w3.likeSoup = true;
		w3.check();
	}

}
