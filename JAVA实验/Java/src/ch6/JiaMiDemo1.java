package ch6;
//
public class JiaMiDemo1 {
	public static void main(String[] args) {
		int[] number = new int[]{1,2,3,4,5,6};
		
		//����
		for(int i=0;i<number.length/2;i++){
			int temp = number[i];
			number[i] = number[number.length-1-i];
			number[number.length-1-i] = temp;
		
		}
		//������������
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]);
		} 
		
		System.out.println();
		
		for(int i=0;i<number.length;i++) {
			number[i] += 5;
			number[i] %= 10;
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]);
		} 
		System.out.println();
		//��������
		int temp2 = number[0];
		number[0] = number[number.length-1];
		number[number.length-1] = temp2;
		

		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]);
		} 
	}

}
