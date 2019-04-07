package ch1;
import java.util.*;
//文件录入
/*
 导包      import java.util.Scanner;
录入对象   Scanner sc=new Scanner(System.in);
通过对象获取数据    int x=sc.nextInt(); 
 */
public class ScannerDemo {
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
 
      int temp=(x>y)?x:y;
      int max=(temp>z)?temp:z;
      //  int total=(x>y)?((x>z)?x:z):((y>z)?y:z);
      System.out.println(max);
      /*  if(x>y){
    	  System.out.println(x);
      }
      else{
    	  System.out.println(y);
      }
      */
     
      
	}

}
