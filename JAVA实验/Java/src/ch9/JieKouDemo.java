package ch9;
//�ӿ�
interface AnimalTrain {
	public abstract void jump();
	public int num = 10;
	public final int num2 = 20;
	
}
 class CatText implements AnimalTrain {
	 public void jump() {
		 System.out.println("jump");
	 }
 }

public class JieKouDemo {
	public static void main(String[] args)  {
		 AnimalTrain a = new CatText();
		 System.out.println(a.num);
		 System.out.println(a.num2);
		 a.jump();
		 //�ӿ��еı���Ĭ��Ϊ������ֵ�����Ըı�;
		// a.num=200;
		 
	}

}
