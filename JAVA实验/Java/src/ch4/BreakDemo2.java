package ch4;
/*
 * С��������ÿ�����2.5ԪǮ���������������
 * ���ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
 * �����Ứȥ6ԪǮ�����ʣ����������죬
 * С���ſ��Դ浽100ԪǮ��
 */
public class BreakDemo2 {
	public static void main(String[] args) {
		//while����break��䷽ʽ(while�ʺϴ�������ȷ��)
/*		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;
		while(true) {
			daySum +=dayMoney;
			if(daySum>=100) {
				System.out.println("������"+dayCount+"��洢������100��Ǯ");
				break;
			}
			if(dayCount==5||(dayCount%5)==0) {
				System.out.println("�ڵ�"+dayCount+"��"+"\t"+"������6Ԫ");
				daySum -=6;
			}
			dayCount++;
		}
		
		//ֱ��forѭ����ʽ���ʺ�һ����Χ�ģ�
	*/
		int day=1;
		for(double sum = 2.5;sum<100;sum+=2.5) {
			if(day==5||(day%5)==0) {
				System.out.println("�ڵ�"+day+"��"+"\t"+"������6Ԫ");
				sum -=6;
			}
			day++;
		}
		System.out.println(day);
		
		
		
	}

}
