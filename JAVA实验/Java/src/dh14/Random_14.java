package dh14;

import java.util.Random;

/*random��ʹ�÷���
 * public random() û�ø����ӣ�Ĭ���ǵ�ǰ�ĺ���ֵ
 * public random(long seed)����ָ��������
 * 
 * ���� �������Ӻ�ÿ�εõ������������ͬ��
 * 
 * ��Ա������
 * 	public int nextInt();����int���͵������
 * 	public int nextInt(int n)�� ���أ�0��n����Χ�ڵ������
 */
public class Random_14 {
	public static void main(String[] args) {
		//��������  (δ�������ӣ�ÿ�λ�ȡ�������ͬ)
	//	Random r = new Random();
		
		//��������  ���������ӣ�ÿ��������������ͬ ��
		Random r = new Random(1111);
		
		for(int i=0;i<10;i++) {
			//���int��Χ�ڵ������
			//int num = r.nextInt();
			//���0-100��int���͵������
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}

}
