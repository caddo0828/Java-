package ch8;
/*java�̳е��ص�:
 *   a:java��ֻ�����̳����Σ��������̳�;
 *   b:java֧�ֶ��̳�(Ҳ��˵һ���༴������Ϊ���࣬Ҳ���Լ̳�������)
 *   c:����ֻ�ܼ̳и������з�˽�еĳ�Ա����������
 *   d:���಻�ܼ̳и���Ĺ��췽����������ͨ��super�ؼ��������ø���Ĺ��췽��
 *   e:��ҪΪ�˲��ֹ���ȥ�̳У�
 *   
 *  ��Ա����������͸����еĳ�Ա������һ�������þͽ�ԭ��
 *  ����������ľֲ����ң�������ĳ�Ա���ң��ڸ������ң����򱨴�
 */
class Student {
	public int num = 10;
	
}
class Son extends Student {
	public int num = 20;
	public void show() {
		int num = 40;
		System.out.println(num);
		
	}
}

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
