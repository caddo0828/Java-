package dh12;
//ͳ��һ���ַ����еĴ�д��ĸ��Сд��ĸ���Լ����ֳ��ֵĴ���
//����¼�����ݽ��иĽ�17
/*
 * 
 *ASCII��
 * 0   48   ���ֱȽ�
 * A   65	��д�Ƚ�
 * a   97	Сд�Ƚ�
 */
public class StringTongJi_16 {
	public static void main(String[] args) {
		//����һ���ַ�
		String ss = "Hello3World4";
		
		//�����д��Сд�����ֱ������ڴ�ֵ
		int maxCount = 0;
		int minCount = 0;
		int number = 0;
		
		//if�����ڽ��бȽ�ʱ���Զ�ת����int���ͽ�����ֵ�Ƚ�
		for(int i =0;i<ss.length();i++) {
			//���ڽ���ÿ���ַ�
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
