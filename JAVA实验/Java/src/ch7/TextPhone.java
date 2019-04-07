package ch7;

class Phone {
	String brand;
	int price;
	String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color =color;
	}
	
	public void get() {
		System.out.println(brand+" "+price+" "+color);
	}
	
}
public class TextPhone {
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.get();
		//¸øÖµ
		System.out.println("-------------------");
		Phone ss = new Phone();
		ss.setBrand("ÈýÐÇ");
		ss.setPrice(4500);
		ss.setColor("black");
		ss.get();
	}

}
