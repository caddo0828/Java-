package ch4;
/*24
 * ���·�8088  height
 * ֽ��0.01  hd
 * �۶��ٴβſ��Բ�����ɽ��ĸ߶�
 * Hd>=height
 * Hd=hd*2
 * sum++;
*/
public class WhileDemo1 {
	public static void main(String[] args) {
		int height = 8088;
		double hd = 0.01;
		int count = 0;
		while(hd<height) {
			hd *= 2;
			count++;
			System.out.println(hd);
		}System.out.println("�ܹ���Ҫ���ۣ�"+count+"��");
		
	}

}
