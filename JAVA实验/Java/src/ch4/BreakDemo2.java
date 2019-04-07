package ch4;
/*
 * 小芳的妈妈每天给她2.5元钱，她都会存起来，
 * 但是，每当这一天是存钱的第5天或者5的倍数的话，
 * 她都会花去6元钱，请问，经过多少天，
 * 小芳才可以存到100元钱。
 */
public class BreakDemo2 {
	public static void main(String[] args) {
		//while……break语句方式(while适合次数不明确的)
/*		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;
		while(true) {
			daySum +=dayMoney;
			if(daySum>=100) {
				System.out.println("共花了"+dayCount+"天存储不少于100块钱");
				break;
			}
			if(dayCount==5||(dayCount%5)==0) {
				System.out.println("在第"+dayCount+"天"+"\t"+"消费了6元");
				daySum -=6;
			}
			dayCount++;
		}
		
		//直接for循环方式（适合一个范围的）
	*/
		int day=1;
		for(double sum = 2.5;sum<100;sum+=2.5) {
			if(day==5||(day%5)==0) {
				System.out.println("在第"+day+"天"+"\t"+"消费了6元");
				sum -=6;
			}
			day++;
		}
		System.out.println(day);
		
		
		
	}

}
