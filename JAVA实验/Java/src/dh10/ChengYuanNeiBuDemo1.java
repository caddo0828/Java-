package dh10;

interface inner{
	void show();//������public abstract
}

class Out {
	public static inner method() {
		return new inner() {
			public void show(){
				System.out.println("helloword");
			}
		};
	}
}


public class ChengYuanNeiBuDemo1 {
	public static void main(String[] args) {
		Out.method().show();
		//out.method();�����������������Ǹ��������󣬲����Ǿ�̬����
		//����������Ǽ̳и��������ʵ����һ���ӿڵ���������
		//�����ڵ���show����
		/*out.method(); ���Կ���method()Ӧ����out�е�һ����̬����
		 * Out.method().show();���Կ���method�������ص���һ������
		 * �����ڽӿ�����show()������������Ϊ�Ƿ���ֵ�ǽӿ�����
		 * 
		*/
		
		
	}
	

}
