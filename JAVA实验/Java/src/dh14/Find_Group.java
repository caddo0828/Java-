package dh14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*�����Ƿ�������������ʽ�����ַ������������
 */
public class Find_Group {
	public static void main(String[] args) {
		//�����ַ���
		String string = "da jia ting wo shuo,jin tian yao xia yu";
		
		//�������
		String regex = "\\b\\w{3}\\b";
		
		//���������ģʽ������
		Pattern p =Pattern.compile(regex);
		//��ģʽ���������ģʽƥ������
		Matcher m = p.matcher(string);
		//���ö���ķ���
		//���ڲ����Ƿ�����������������ַ���
		 boolean b = m.find();
		 System.out.println(b);
		//�������
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	}

}
