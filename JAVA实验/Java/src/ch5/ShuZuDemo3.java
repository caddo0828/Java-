package ch5;

public class ShuZuDemo3 {
	public static void main(String[] args) {
		//��ʼ������
		int[] arr ={60,20,16,24,83};
		System.out.println(getIndex1(arr,200));
		
		System.out.println("�ڶ��ַ�����");
		int index = getIndex2(arr,83);
		System.out.println("��Ӧ���ݵ������±�Ϊ��"+index);
	}
	
	public static int getIndex1(int[] arr,int value) {
		  for(int i=0;i<arr.length;i++) {
	        	if(arr[i]==value) {
	        		return i;
	        	}
	        }
		  //ֻҪ���жϾ��п����Ǵ���ģ����Ҳ����Ļ�����һ���������
		  return -1;
	}
	
	public static int getIndex2(int[] arr,int value) {
		//�����������ڱ����±�
		int index = -1;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==value) {
				//�����������޸��±�
				index = j;
			  //  return index;
				break;
			}
			
		}
		
		//return -1;
		return index;
	}
	

}
