package dh12;
/*��int����ƴ���ַ���
 *������int[] arr = {1,2,3};
 *
 ������
 a:��һ����������
 b:����һ���յ��ַ���
 c:�����á�+�����������ƴ��
 d:��������б���
    1�����������жϣ���������һ��ƴ�� } 
    2������ƴ�� ��
    3����������ַ���
 * 
 */
public class StringIntArrayContect_22 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		String s = "";
		
		s += "{";
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s += arr[i];
				s += "}";
			}else {
				s += arr[i];
				s += ",";
			}
		}
		System.out.println("���յ��ַ�����ʽ���Ϊ�� "+s);
	}

}
