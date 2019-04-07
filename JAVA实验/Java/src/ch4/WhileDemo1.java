package ch4;
/*24
 * 珠穆峰8088  height
 * 纸张0.01  hd
 * 折多少次才可以不低于山峰的高度
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
		}System.out.println("总共需要对折："+count+"次");
		
	}

}
