
class Car{
	String mark;
	public void drive(){
		System.out.println("������Ʒ����"+mark);
	}
}
class SubCar extends Car{
	int price;
	int speed;
	public void speedChange(int newSpeed){
		 drive();
		 speed=newSpeed;
		 System.out.println(mark+"���ļ۸���"+price);
		 System.out.println(mark+"��ԭ�����ٶ���"+speed);
		 System.out.println("����������ʻ");
		 System.out.println(mark+"�����ڵ��ٶ���"+speed);
	}
}
public class Text3 {
	public  static void main(String[] args){
		SubCar aodi=new SubCar();
		aodi.mark="�µ�";
		aodi.price=50;
		aodi.speed=80;
		aodi.speedChange(120);
		System.out.println();
		SubCar benchi=new SubCar();
		benchi.mark="����";
		benchi.price=100;
		benchi.speed=90;
		benchi.speedChange(120);
	}

}