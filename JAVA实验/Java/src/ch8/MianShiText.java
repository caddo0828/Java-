package ch8;
/*
 * һ����ĳ�ʼ�����̣�
 * A:��Ա�����ĳ�ʼ��
 *     Ĭ�ϳ�ʼ��
 *     ��ʾ��ʼ��
 *     ���췽����ʼ��
 * B:�Ӹ���ĳ�ʼ�����ֲ��ʼ����
 *   �Ƚ��и����ʼ����Ȼ����������ʼ��
 *   
 * ���⣺
 *  ��Ȼ����Ĺ��췽��Ĭ�ϻ���ʸ���Ĺ��췽������super�������ʣ�
 *  ��ʼ����ʱ�򣬲��ǰ����Ǹ�˳����е�
 *  ���ǰ��շֲ��ʼ�����е�
 *  ��������ʾҪ�ȳ�ʼ���������ݣ��ڳ�ʼ������
 */
//�����YXYZ
class X {
	Y b = new Y();
	X() {
		System.out.println("X");
	}
}

class Y {
	Y() {
		System.out.println("Y");
	}
}

public class MianShiText extends X {
	Y y = new Y();
	MianShiText()  {
		System.out.println("Z");
	}
	public static void main(String[] args) {
		new MianShiText();
	}
}
