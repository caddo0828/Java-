package ch9;
/*���಻�ܷ������������еĹ���
 * ���������������÷�����
 * ����ת�ͣ� ���������ת��Ϊ������� 
 *        F1 f = new Z1();
 * ����ת�ͣ��Ѹ������ǿ��ת�����������
 *        Z1 z = (Z1)f; 
 */
class F1 {
	int num = 10;
	public void show () {
		System.out.println("F");
	}
	
}

class Z1 extends F1 {
	int num = 20;
	public void show() {
		System.out.println("z");
	}
	public static void method() {
		System.out.println("zi");
	}
}


public class ZhuangXingDemo {
	public static void main(String[] args) {
		F1 f = new Z1();
		f.show();
		
		System.out.println("---------------");
		
		Z1 z = (Z1) f;
		z.show();
		z.method();
	}
	

}
