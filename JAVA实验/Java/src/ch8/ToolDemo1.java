package ch8;
/*������
 * ���췽��˽�л������ܴ�������Ķ���
 * ��̬����������ͨ����������
 * javacdoc ���ڽ����ĵ�ע��
 * javac -d Ŀ¼  -author -version ArrayToolDemo.java
 */
public class ToolDemo1 {
	public static void main(String[] args) {
		//��������
		int[] arr = {28,55,33,12,19};
		
		//��������
		ArrayToolDemo.printArray(arr);
		
		//ȡ�����ֵ
		int result = ArrayToolDemo.getMax(arr);
		System.out.println("max: "+result);
		
		//������
		int ress = ArrayToolDemo.getIndex(arr, 33);
		System.out.println(ress);
		
	}
	

}
