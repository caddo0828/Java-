package ch7;

class WuMingFen {
	String theMa;//����
	int quantity;//�۵ķ���
	boolean likeSoup;//�Ƿ����
	
	//�޲ι���
	WuMingFen() {}
	
	//���������Ĺ���
	WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	
	//���������Ĺ���
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
		WuMingFen w1 =new WuMingFen("ţ��",3,true);
		w1.check();
		
		System.out.println("----------------");
		
		WuMingFen w2 =new WuMingFen("ţ��",2);
		w2.check();
		
		System.out.println("----------------");
		
		WuMingFen w3 =new WuMingFen();
		w3.theMa = "����";
		w3.quantity = 6;
		w3.likeSoup = true;
		w3.check();
	}

}
