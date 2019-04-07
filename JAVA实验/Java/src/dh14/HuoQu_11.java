package dh14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*获取功能：
 * 获下面这个字符串中由三个字符组成的单词
 */
public class HuoQu_11 {
	public static void main(String[] args) {
		//定义字符串
		String string = "da jia ting wo shuo,jin tian yao xia yu";
		
		//定义规则\\b代表字符边界   \\w代表单词字符
		String regex = "\\b\\w{3}\\b";
		
		//把规则放在模式对象中
		Pattern p = Pattern.compile(regex);
		
		//把要匹配的内容放在匹配器中(通过模式对象的到匹配器对象)
		Matcher m = p.matcher(string);
		//对象调用功能   判断是否存在满足匹配的子序列
		boolean b = m.find();
		System.out.println(b);
		
		//找到就输出，没用找到就不输出
		//调用group之前必须先调用find，否则抛异常报错
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

}
