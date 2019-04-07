package dh13;

/*
 * 将指定的int数组转换为字符串输出
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
		
		//String类型输出
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
		System.out.println("String类型输出的字符串: "+s);
		
	}

}
