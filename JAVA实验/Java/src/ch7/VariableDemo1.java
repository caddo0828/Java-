package ch7;
//����
/*
 * ��Ա�����������з����⣨��Ĭ��ֵ��
 * �ֲ��������ڷ��������л����ڷ��������ϣ�û��Ĭ��ֵ�����ʼ����������ʹ�ã�
   ����Ա�����;ֲ�����һ��ʱ���þͽ�ԭ��
 */
/*
 * �������ͣ� �������ͣ�
                           �������ͣ������Լ����飩���봴����Ӧ��Ķ���
                           
  ��������û�����ֵĶ���
  Ӧ�ó��������÷���������ֻ�ǵ���һ�ε�ʱ��
  ����������Ϊʵ�ʲ�����ʹ��
  
 */  
class Student {
	public void show() {
		System.out.println("study");
	}
}

class StudentDemo {
	//���������һ����������ʽ������һ�������ͣ��������ͣ�����Ҫ��������Ķ���
	public void method(Student s) {//���õ�ʱ���ǽ���ֵַ���͵�����
		s.show();
	}
}

public class VariableDemo1 {
	public static void main(String[] args) {
		//��ʽ�������������͵ĵ���
		StudentDemo sc = new StudentDemo();
		//���봴�������͵Ķ���
		Student s = new Student();
		sc.method(s);//��s�ĵ�ַ���͵�������
		
		//�����ֵĵ���
		s.show();
		
		//��������
		new Student();
		//����������÷���
		new Student().show();
		new Student().show();//������һ�������治��ͬһ�����¶���
		
		//
		StudentDemo ss = new StudentDemo();
		//�������������Ϊʵ�ʲ���ʹ��
		ss.method(new Student());//������student����������
	
	}

}
