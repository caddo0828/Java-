package dh14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*��ȡ���ܣ�
 * ����������ַ������������ַ���ɵĵ���
 */
public class HuoQu_11 {
	public static void main(String[] args) {
		//�����ַ���
		String string = "da jia ting wo shuo,jin tian yao xia yu";
		
		//�������\\b�����ַ��߽�   \\w�������ַ�
		String regex = "\\b\\w{3}\\b";
		
		//�ѹ������ģʽ������
		Pattern p = Pattern.compile(regex);
		
		//��Ҫƥ������ݷ���ƥ������(ͨ��ģʽ����ĵ�ƥ��������)
		Matcher m = p.matcher(string);
		//������ù���   �ж��Ƿ��������ƥ���������
		boolean b = m.find();
		System.out.println(b);
		
		//�ҵ��������û���ҵ��Ͳ����
		//����group֮ǰ�����ȵ���find���������쳣����
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

}
