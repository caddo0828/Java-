package ch7;
/*static (�������γ�Ա�����Լ�����): 
 *          ���ε����ݱ����ж�����
 * 			������ļ��ض�����
 * ʹ���龰�����ĳ����Ա�����Ǳ����ж�����ģ���Ӧ�ö���Ϊ��̬��
 *      (����ͨ����������,Ҳ����ͨ�����������ã�
 * ע������ھ�̬��������û��this�ؼ��ֵ�
 *       ����̬����ֻ�ܷ��ʾ�̬��Ա�����;�̬�ĳ�Ա������
		   ����̬�ȶ����ȴ��ڣ�
		  ��̬������ֻ���Է��ʾ�̬����
		 �Ǿ�̬���������Է��ʷǾ�̬�Լ���̬����,�Լ�����
 */
class Text {
	int num = 10;
	static int num2 = 20;
	
	//�Ǿ�̬���������Է��ʷǾ�̬�Լ���̬����,�Լ�����
	public void printNum() {
		System.out.println(num);
		System.out.println(num2);
	}
	
	//��̬������ֻ���Է��ʾ�̬����
	public static void printNum2() {
		System.out.println(num2);
	}
	
	
}

public class StaticDemo {
	public static void main(String[] args) {
		Text te = new Text();
		te.printNum();
		te.printNum2();
	}

}
