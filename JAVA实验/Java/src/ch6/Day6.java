package ch6;

import java.util.*;

public class Day6 {
	public static void main(String[] args) {
		//遍历二维数组
	/*	int[][] arr = {{2,3,4},{4,5,6,7},{10,12,15,49}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
	/*
		//求出公司的销售总额
		int[][] brr ={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		
		int total = 0;
		int sum = 0;
		
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
				total += brr[i][j];
				sum += brr[i][j];
			}
			System.out.println();
			System.out.println("第"+(i+1)+"季度的销售额为"+total);
			total = 0;
		}
		System.out.println("____________________________");
		System.out.println(sum);
		
		//
		int s = 0;
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
				s += brr[i][j];
			}
			System.out.println();
		}	
		System.out.println(s);
		
		
		*/
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int[][] a = new int[x][x];
		
		for(int i=0;i<a.length;i++) {
			a[i][0] = 1;
			a[i][i] = 1;
		}
	
		for(int i=2;i<a.length;i++) {
			for(int j=1;j<=i-1;j++) {
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
