package ch9;
/*
 *��̬��ͬһ������������ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬
 *ǰ�᣺Ҫ�м̳й�ϵ
 *     Ҫ�з�����д
 *     Ҫ�и�������ָ���������
 *     ��  f = new �ӣ�����
 *�ص㣺����
 *��Ա���������뿴��ߣ����Ҳ�ǿ����
 *���췽���������������ʱ����������Ĺ��췽�����Ը������ݽ��г�ʼ��
 *��Ա���������뿴��ߣ�������ұ�
 *��̬���������뿴��ߣ��������ߣ���ֻ̬�����йأ�
 */
class F {
	int num = 10;
	public void show () {
		System.out.println("F");
	}
	
	public static void method() {
		System.out.println("fu");
	}
}

class Z extends F {
	int num = 20;
	public void show() {
		System.out.println("z");
	}
	public static void method() {
		System.out.println("zi");
	}
}

public class DuoTai {
	public static void main(String[] args) {
		F f = new Z();
		f.show();
		//�������ܱ���д��֮�ܷ��ʸ����
		System.out.println(f.num);
		f.method();
	}

}
