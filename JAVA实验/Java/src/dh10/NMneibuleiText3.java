package dh10;
//�����ڲ���
/*
 * ǰ�᣺����һ������߽ӿ�
		�����������Ǿ�����Ҳ�����ǳ�����
	��ʽ��
		new �������߽ӿ�������{
		��д���� ;
		}
		
	ע�⣺��������ʵ���Ǽ̳и�����߽ӿ�ʵ����Ķ���
	    ��������ֻ�ܵ���һ��
 */
interface Inn {
	public abstract void show();
}

class Outer3 {
	public void method() {
		new Inn() {
			public void show() {
				System.out.println("�����ڲ���");
			}
		}.show();//�ӿ�����������show����
		
		
		//��̬(�ӿڵ�ʵ�������)
		Inn in = new Inn() {
			public void show() {
				System.out.println("��̬��������������");
			}
		};
		in.show();
	}
	
	
}

public class NMneibuleiText3 {
	public static void main(String[] args) {
		Outer3 ou = new Outer3();
		ou.method();
		
	}

}
