package dh11;


class out extends Object {
	public void show() {
		System.out.println("jjjjj");
	}
	@Override
	public String toString() {
		return "out [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
public class HashCode {
	public static void main(String[] args) {
		//���ش˶���ĵ�ֵַ����ʵ��һ����ϣ�룬��������ÿ�δ�������Ĳ�ͬ����ϣ�붼�����
		out  ou = new out();
		System.out.println(ou.hashCode());
		//getclass���ص��Ƕ������ڵ��࣬getname :���ش��������
		System.out.println(ou.getClass().getName());
	
		//tostring��������һ���ַ���
		System.out.println(ou.toString());
		
		 
		
	}

	@Override
	public String toString() {
		return "HashCode []";
	}

}
