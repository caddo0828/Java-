package ch2;
//强制类型转换
/*
 byte,char,short在进行运算时，会自动转换成int类型
 且三者类型之间不可以互相转换
 容量小的数据类型向容量大的数据类型自动转换，数据容量大小排序为
 byte，char,short,->int->long->float->double
 容量大的向容量小的转换时需要进行强制类型转换
 //[扩展的运算符隐含了一个强制类型转换+=，-=，%=]
  s+=1;
  并不等于s=s+1;
 而是相当于s=(s的强制转换类型)(s+1);
  * 
 如  int a=10;
 float b=(float)a;
 */
public class convert {
/*	public static void main(String []args){
		int i1=1;
		int i2=2;
		double d1=(i1+i2)*1.2;//直接计算结果为double类型
		double d2=(i1+i2)*1;//计算结果为int型，直接转换为容量大的double类型
		float f1=(float)((i1+i2)*1.2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
		//((i1+i2)*1.2)计算结果为double类型，
		//转换成float类型时进行强制类型转换
		
		byte b1=1;
		byte b2=2;//范围在-128~127,超出范围被截取部分数值
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		//(b1+b2)默认转换成int型进行计算，在由int型，强制转换为Byte
		
		double d3=1e200;
		float f2=(float)d3;
		System.out.println(f2);//结果溢出（Infinity）
		
		//申明float型时，必须在末尾加上f或者F
		//否则默认为double型
		float f3=1.25f;
		long l1=123;
		long l2=10000000000l;//超出长度范围末尾加l进行计算
		float f=l1+l2+f3;//计算为float型
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
		j=j+10;//为给j赋值
		i=i/10;//结果为整数，自动删除小数点后的数
		i=(int)(i*0.1);//计算结果为double型，强制转换
	

	}
	
	
}	

	

		
