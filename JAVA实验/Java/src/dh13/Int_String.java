package dh13;

/*
 * ��ָ����int����ת��Ϊ�ַ������
 */
public class Int_String {
	public static void main(String[] args) {
		int[] arr = {15,46,78,65};
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("[");
		
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				buffer.append(arr[i]).append(",");
			}else {
				buffer.append(arr[i]).append("]");
			}
		}
		System.out.println("StringBuffer  "+buffer);
		
		//String�������
		String s = "";
		
		s += "{";
		
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				s += arr[i];
				s += ",";
			}else {
				s += arr[i];
				s += "}";
			}
		}
		System.out.println("String����������ַ���: "+s);
		
	}

}
