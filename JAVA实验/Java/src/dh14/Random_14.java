package dh14;

import java.util.Random;

/*random的使用方法
 * public random() 没用给种子，默认是当前的毫秒值
 * public random(long seed)给出指定的种子
 * 
 * 区别： 给定种子后，每次得到的随机数是相同的
 * 
 * 成员方法：
 * 	public int nextInt();返回int类型的随机数
 * 	public int nextInt(int n)； 返回（0，n）范围内的随机数
 */
public class Random_14 {
	public static void main(String[] args) {
		//创建对象  (未给定种子，每次获取随机数不同)
	//	Random r = new Random();
		
		//创建对象  （给定种子，每次输出的随机数相同 ）
		Random r = new Random(1111);
		
		for(int i=0;i<10;i++) {
			//输出int范围内的随机数
			//int num = r.nextInt();
			//输出0-100内int类型的随机数
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}

}
