package dh10;
//�ֲ��ڲ���
class Outer2 {
	public int num =10;
	
	public void show() {
		//1���ֲ��ڲ�����ʾֲ�������������final����
		final int num2 = 20;
		class Inner4 {
			public void method() {
				System.out.println("�ֲ��ڲ���");
				System.out.println(num2);
				//����ֱ�ӷ����ⲿ��ĳ�Ա
				System.out.println(num);
			}
		}
		//2���ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ���ķ�������ʹ���ڲ�����ض�����
		Inner4 ou = new Inner4();
		ou.method();
	}
}

public class JBneibuleiText2 {
	public static void main(String[] args) {
		Outer2 pu = new Outer2();
		pu.show();
		
	}

}
