package dh14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*查找是否有满足正则表达式的子字符串，并且输出
 */
public class Find_Group {
	public static void main(String[] args) {
		//定义字符串
		String string = "da jia ting wo shuo,jin tian yao xia yu";
		
		//定义规则
		String regex = "\\b\\w{3}\\b";
		
		//将规则放在模式对象中
		Pattern p =Pattern.compile(regex);
		//将模式对象放置在模式匹配器中
		Matcher m = p.matcher(string);
		//调用对象的方法
		//用于查找是否存在满足条件的子字符串
		 boolean b = m.find();
		 System.out.println(b);
		//用于输出
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	}

}
