package ch5;

//�����������ݼ���¼�����������Ҷ�Ӧ����
import java.util.Scanner;

public class ShuZuDemo2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
        //����¼�� ����ֵ
		int x = sc.nextInt();
        
        //����һ���ַ�������
        String[] arr = {"����һ","���ڶ�","������"};
        
        System.out.println(arr[x]);
       
        
        System.out.println("����������������������������������������");
        //����һ������
        int[] a = {25,12,20,2,13,2,64};
        
        //��������(�ҳ���������ͬ���ֵ����ݣ������ҳ��������ʱ���±꣬������ִ���)
        int sum = 0;
        for(int i=0;i<a.length;i++) {
        	for(int j=1;(j+i)<a.length ;j++) {
        		if(a[i]==a[i+j]) {
        			sum++;
        			System.out.println("��������ͬ���ݳ��ֵ���:"+a[i]+"\t");
        			System.out.println("��������ֵ��±�Ϊ��"+i);
        		}   
        	}
        	
        }System.out.println("��"+sum+"���������ظ����ֵ�");
        
        System.out.println("����������������������������������������");
        //����Ԫ�ز���(�ҳ�ָ����Ԫ�ص�һ���������г��ֵ�����)
        int[] b ={60,20,16,24,83,20};
        
        //��������
      /*  for(int i=0;i<b.length;i++) {
        	for(int j=1;(j+i)<b.length;j++) {
        		if(b[i]==b[i+j]&&b[i]==20) {
            		System.out.println(i);
            	}
        	}
        }
       */
        
        for(int i=0;i<b.length;i++) {
        	if(b[i]==20) {
        		System.out.println(i);
        		break;//ֱ������ѭ��������ľ��ǵ�һ��ֵ
        	}
        }
  
	}

}
