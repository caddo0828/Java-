package dh13;

import java.util.Arrays;

import javax.sound.midi.Synthesizer;

/*Arrays���鹤�����ʹ��
 * 
 * 
 */
public class Arrays_23 {
	public static void main(String[] args) {
		int[] arr = {14,56,37,48,69,21};
		
		String s = Arrays.toString(arr);
		System.out.println("����ǰ������ת�����ַ���Ϊ: "+s);
		
		//����
		Arrays.sort(arr);
		System.out.println("�����:"+Arrays.toString(arr));
		
		//���ֲ���
		int x = Arrays.binarySearch(arr, 48);
		System.out.println(x);
	}

}
