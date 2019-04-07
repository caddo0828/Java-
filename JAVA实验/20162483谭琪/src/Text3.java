
class Car{
	String mark;
	public void drive(){
		System.out.println("本车的品牌是"+mark);
	}
}
class SubCar extends Car{
	int price;
	int speed;
	public void speedChange(int newSpeed){
		 drive();
		 speed=newSpeed;
		 System.out.println(mark+"车的价格是"+price);
		 System.out.println(mark+"车原来的速度是"+speed);
		 System.out.println("本车正在行驶");
		 System.out.println(mark+"车现在的速度是"+speed);
	}
}
public class Text3 {
	public  static void main(String[] args){
		SubCar aodi=new SubCar();
		aodi.mark="奥迪";
		aodi.price=50;
		aodi.speed=80;
		aodi.speedChange(120);
		System.out.println();
		SubCar benchi=new SubCar();
		benchi.mark="奔驰";
		benchi.price=100;
		benchi.speed=90;
		benchi.speedChange(120);
	}

}