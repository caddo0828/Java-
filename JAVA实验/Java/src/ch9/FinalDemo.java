package ch9;
/*final:���������࣬����������
 * �ص㣺
 * A:final���ε��಻�ܱ�������̳�
 * B:��final���εķ������ܱ���д
 * C����final���εı������ñ������ܱ����¸�ֵ����ʵҲ��������
 * D:�������������ͱ���ʱ�������Ըı��ֵַ���ȶ������ݿɱ䣬��ֵַ���ܱ�
 *   Ҳ���Ƕ����ܹ����ű������ڴ棺
 */
class Fu {
	final int num = 10;
	int num2 = 100;
	public  void show() {
		System.out.println();
	}
	public final void get() {
		
	}
}
class Zi extends Fu {
	public void show() {
		//num = 100;��final���εĲ��ܱ���д
		System.out.println(num);
	}
/*	public void get() {
		
	}���ܱ���д 
	*/
}

public abstract class FinalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		
		//���Ըı�����ֵ���ǲ��ܸĶ���ĵ�ַ
		final Zi zz = new Zi();
		System.out.println(zz.num2);
		zz.num2 = 200;
		System.out.println(zz.num2);
		
		 
		
		
	}

}
