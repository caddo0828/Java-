package ch7;

//��������ε�����Լ��ܳ�

class Circle {
	double width;//��
	double height;//��
	double length;//��
	
	Circle(double width,double length) {
		this.width = width;
		this.length = length;
	}
	
	Circle(double width,double length,double height) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double perrimeter() {
		return (length+width)*2;
	}
	
	public double area() {
		return length*width*height;
	}
}

public class CircleText {
	public static void main(String[] args) {
		Circle c = new Circle(2,3);
		System.out.println(c.perrimeter());
		
		System.out.println("---------------");
		Circle c1 = new Circle(2,3,4);
		System.out.println(c1.area());
	}

}
