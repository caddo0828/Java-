package ch2;
//ǿ������ת��
/*
 byte,char,short�ڽ�������ʱ�����Զ�ת����int����
 ����������֮�䲻���Ի���ת��
 ����С����������������������������Զ�ת��������������С����Ϊ
 byte��char,short,->int->long->float->double
 �������������С��ת��ʱ��Ҫ����ǿ������ת��
 //[��չ�������������һ��ǿ������ת��+=��-=��%=]
  s+=1;
  ��������s=s+1;
 �����൱��s=(s��ǿ��ת������)(s+1);
  * 
 ��  int a=10;
 float b=(float)a;
 */
public class convert {
/*	public static void main(String []args){
		int i1=1;
		int i2=2;
		double d1=(i1+i2)*1.2;//ֱ�Ӽ�����Ϊdouble����
		double d2=(i1+i2)*1;//������Ϊint�ͣ�ֱ��ת��Ϊ�������double����
		float f1=(float)((i1+i2)*1.2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
		//((i1+i2)*1.2)������Ϊdouble���ͣ�
		//ת����float����ʱ����ǿ������ת��
		
		byte b1=1;
		byte b2=2;//��Χ��-128~127,������Χ����ȡ������ֵ
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		//(b1+b2)Ĭ��ת����int�ͽ��м��㣬����int�ͣ�ǿ��ת��ΪByte
		
		double d3=1e200;
		float f2=(float)d3;
		System.out.println(f2);//��������Infinity��
		
		//����float��ʱ��������ĩβ����f����F
		//����Ĭ��Ϊdouble��
		float f3=1.25f;
		long l1=123;
		long l2=10000000000l;//�������ȷ�Χĩβ��l���м���
		float f=l1+l2+f3;//����Ϊfloat��
		long l=(long)f;
		System.out.println(l);
*/	
	public static void main(String[] args){
		int i=1,j=0;
		float f1=0.1f;
		float f2=123;
		long l1=123,l2=456;
		double d1=2e20,d2=124;
		byte b1=1,b2=2,b3=127;
		j=j+10;//Ϊ��j��ֵ
		i=i/10;//���Ϊ�������Զ�ɾ��С��������
		i=(int)(i*0.1);//������Ϊdouble�ͣ�ǿ��ת��
	

	}
	
	
}	

	

		
