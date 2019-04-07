package dh13;
/*StringBuffer的替换功能
 * public StringBuffer replace(int start,int end,String str)
       从指定位置开始到指定位置结束用str替换 
 */
public class StringBufferReplace {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		//添加数据
		buffer.append("java").append("basic");
		//将se替换掉basic
		System.out.println(buffer.replace(4, 9,"se"));
	
		System.out.println(buffer.insert(2,'a'));
		
	}

}
