package ch4;
/*请在控制台输出满足如下条件的五位数
  个位等于万位
  十位等于千位
  个位+十位+千位+万位=百位；
  并且统计出满足条件的个数
*/
public class ForDemo2 {
	public static void main(String[]args) {
		int sum = 0;
		//五位数范围
		for(int i=10000;i<100000;i++) {
			int g,s,b,q,w;
			g = i%10;//个位
			s = (i/10)%10;//十位
			b = (i/100)%10;//百位
			q = (i/1000)%10;//千位
			w = i/10000;//万位
			//条件判断
			if(g==w&&s==q&&g+s+q+w==b) {
				System.out.print(i+"\t");
				sum++;
			}
		}	
		System.out.println("\n"+"满足条件的五位数共有："+sum);
	}
}
