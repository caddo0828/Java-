package ch2;
//���101��200�ڵ�������
public class ZhiShu {
	public static void main(String[] args){
		int sum=0;
		boolean flag=true;//����
		for(int i=101;i<=200;i+=2){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;//��ʱi��������
					break;
				}
			}
			if(!flag){
				continue;
			}
			sum++;
			System.out.println(i);
		}
		System.out.println("�������ܸ���Ϊ��"+sum);
	}

}
