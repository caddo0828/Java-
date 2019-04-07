package dh12;
//统计一个字符串中的大写字母，小写字母，以及数字出现的次数
//键盘录入数据进行改进17
/*
 * 
 *ASCII码
 * 0   48   数字比较
 * A   65	大写比较
 * a   97	小写比较
 */
public class StringTongJi_16 {
	public static void main(String[] args) {
		//定义一个字符
		String ss = "Hello3World4";
		
		//定义大写，小写，数字变量用于存值
		int maxCount = 0;
		int minCount = 0;
		int number = 0;
		
		//if条件内进行比较时，自动转换成int类型进行数值比较
		for(int i =0;i<ss.length();i++) {
			//用于接收每个字符
			char ch = ss.charAt(i);
			if(ch>='0'&&ch<='9') {
				number++;
			}else if(ch>='A'&&ch<='Z') {
				maxCount++;
			}else if(ch>='a'&&ch<='z'){
				minCount++;
			}
		}
		System.out.println("maxCount="+maxCount);
		System.out.println("minCount="+minCount);
		System.out.println("number="+number);
	}

}
