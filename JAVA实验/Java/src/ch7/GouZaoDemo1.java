package ch7;
/*
 * ���췽�������������ݽ��г�ʼ��
 *        1����������������ͬ
 *        2��û�з���ֵ���ͣ���void��û��
 *        3��û�о���ķ���ֵ
 * ���أ���������������ͬ��  �޷���ֵ���������Ͳ�ͬ    
 *{ ����������췽��ϵͳ���ṩ�޲ι��췽����
 *  ����ֻҪ�����˹��췽��ϵͳ�����ṩ�޲εĹ��췽����
 *  �����Ҫʹ���޲ι��췽�������Լ����� }
 */ 
class Stu {
	String brand;
	int price;
	
	Stu(String brand,int price) {
		this.brand=brand;
		this.price=price;
		
	}
	
	Stu(String brand){
		this.brand = brand;
	}
	
	public void getBrand() {
		System.out.println(brand);
	}
	
	public void get() {
		System.out.println(brand+" "+price);
	}
	
}


public class GouZaoDemo1 {
	public static void main(String[] args) {
		Stu st = new Stu("����",2005);
		st.get();
		
		//
		System.out.println("----------");
		Stu s2 = new Stu("��Ϊ");
		s2.getBrand();
	}

}
