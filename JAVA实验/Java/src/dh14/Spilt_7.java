package dh14;
/*������ʽ�ķָ��  String[] split(String regex);
 */
public class Spilt_7 {
	public static void main(String[] args) {
		String string = "aa,bb,cc";
		String[] arr = string.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		//. �ָ�  ֱ��д.��ʾ���������ַ�    ���Ҫ��ʾ��.�Ļ�Ҫд��\\.
		String string2 = "aa.bb.cc";
		String[] arr2 = string2.split("\\.");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("--------------------------");
		//��·�����зָӦ�ý�\�ĳ�\\   ��Ӧ������ʽ����\\��Ӧ·����һ��\
		String string3 = "D:\\�½��ļ���\\images";
		String[] arr3 = string3.split("\\\\");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("----------------------------");
		//�����ɸ��ո���зָ�
		String string4 = "caddo  tq        minc";
		String[] arr4 = string4.split(" +");
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
	}

}
