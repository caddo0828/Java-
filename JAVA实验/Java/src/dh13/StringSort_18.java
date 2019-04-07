package dh13;
/*对字符串进行排序    例如：dabcge
 *1、将字符变成字符数组
 *2、遍历
 *3、冒泡排序，选择排序
 *4、将字符数组转换成字符串valueOf();//可以转换为任意类型
 *5、新定义一个字符串用于接收排序后的且转换后的字符数组 
 *
 */
public class StringSort_18 {
	public static void main(String[] args) {
		//定义一个字符串
		String string = "dabcge";
		
		//将字符串变成字符数组
		char[] ch = string.toCharArray();
		
		//冒泡排序
		bubbleSort(ch);
		
		String str = String.valueOf(ch);
		System.out.println("冒泡排序输出的字符串为: "+str);
		
		//选择排序
		choiceSort(ch);
		
		String str2 = String.valueOf(ch);
		System.out.println("选择排序后的字符串为: "+str2);
		
	}
	
	//遍历数组
	public static void printArray(char[] ch) {
		System.out.print("[");
		for(int i=0;i<ch.length;i++) {
			if(i!=ch.length) {
				System.out.print(ch[i]+",");
			}else {
				System.out.print(ch[i]);
			}
			System.out.print("]");
		}
	}
	
	//冒泡排序
	public static void bubbleSort(char[] ch) {
		for(int x=0;x<ch.length-1;x++) {
			for(int y=0;y<ch.length-1-x;y++) {
				if(ch[y]>ch[y+1]) {
					char c = ch[y];
					ch[y] = ch[y+1];
					ch[y+1] = c;
				}
			}
		}
	}
	
	//选择排序
	public static void choiceSort(char[] ch) {
		for(int x=0;x<ch.length-1;x++) {
			for(int y=x+1;y<ch.length;y++) {
				if(ch[x]>ch[y]) {
					char c = ch[x];
					ch[x] = ch[y];
					ch[y] = c;
				}
			}
		}
	}
	
}
