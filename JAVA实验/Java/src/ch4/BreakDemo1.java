package ch4;

/*实现程序的中断结束
  取标签名实现外层的中断    标签名：语句
*/

public class BreakDemo1 {
	public static void main(String[] args) {
	wc:	for(int i=1;i<=5;i++) {
		nc:	for(int j=1;j<=4;j++) {
				if(j==3) {
					break nc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
