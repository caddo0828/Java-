package dh13;
/*public StringBuffer deleteCharAt(int index) ; 
// 删除指定位置的字符

public StringBuffer delete(int start ,int end)；
删除指定位置开始指定位置结束的内容，并且返回本身
 * 
 */
public class StringBufferDelete {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("hello").append("word").append("java");
		
		System.out.println(buffer.deleteCharAt(1));
		System.out.println("buffer="+buffer.delete(0, buffer.length()));
		
	}

}
