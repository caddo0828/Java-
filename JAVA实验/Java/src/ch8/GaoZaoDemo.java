package ch8;
/*�̳��й��췽���Ĺ�ϵ��
 * A�����������еĹ��췽��������ʸ����е��޲ι��췽��
 * B�������ÿһ�����췽���ĵ�һ����䶼��Ĭ��Ϊsuper����//������ø��๹�췽��
 * C:ͨ��ʹ��super�ؼ��֣���ʾ��ȥ���ø�����вι��췽��
 * D:����ͨ��thisȥ���ñ�����������췽��
 *   ��������һ��Ҫ��һ��ȥ���ʸ���Ĺ��췽��������������û�н��г�ʼ����
   E:this������super�������й���ʱ������� ��һ�������
     ������Ƿ��ڵ�һ������ϣ��Ϳ��ܶԸ�������˶�γ�ʼ��
     
   F:���߾�̬����飬���߹������飬���߹��췽�����ȶԸ�����г�ʼ����
   ���߹���ʱ���ȰѸ��๹������͹��췽�������꣩
 */
class Fa {
	int age;
	
	public Fa() {
		System.out.println("�޲ι���");
	}
	
	public Fa(String name) {
		System.out.println("�вι���");
	}
	
}

class So extends Fa {
	public So() {
		super("gi");
		System.out.println("�����޲ι���");
	}
	
	public So(int age) {
		this();
		System.out.println("�����вι���");
	}
	
}

public class GaoZaoDemo {
	public static void main(String[] args) {
		So s = new So();
		System.out.println("------------");
		So s2 = new So(19);
		
	}

}
