package dh14;

import java.util.Arrays;

/*
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý����� 
 */
public class SystemArrayCopy_17 {
	public static void main(String[] args) {
		int[] arr = {12,25,13,25,49,86,45};
		
		int[] end = {22,33,44,55};
		
		System.arraycopy(arr, 2, end, 0, 4);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(end));
	}

}
