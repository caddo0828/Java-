package ch4;
/*
 ���ݼ���¼����ַ������ж��Ƿ�������Ҫ�������
 ������ʾ����
 */
import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[]args) {
/*		//����¼�����
		Scanner sc = new Scanner(System.in);
		//¼������,�����ַ�������
		System.out.println("������Ҫ����ƥ����ַ�����");
		String str = sc.nextLine();
		
		switch(str){
			case "hello":
				System.out.println("��������ַ���Ϊhello");
				break;
			case "java":
				System.out.println("��������ַ���Ϊjava");
				break;
		    default:
		    	System.out.println("������ַ����޶�Ӧ");
		    	break;
		
		}
		*/
		
		//����¼�����ݣ���switch����ж���ʲô�·�
		//����¼�����
		Scanner sc = new Scanner(System.in);
		//¼������,�����ַ�������
	    System.out.println("������Ҫ�����жϵ��·�:");
	    int month = sc.nextInt();
	    
	    switch(month) {
	    	case 3:
	    	case 4:
	    	case 5:
	    		System.out.println("��");
	    		break;
	    	case 6:
	    	case 7:
	    	case 8:
	    		System.out.println("��");
	    		break;
	    	case 9:
	    	case 10:
	    	case 11:
	    		System.out.println("��");
	    		break;
	    	case 12:
	    	case 1:
	    	case 2:
	    		System.out.println("��");
	    		break;
	    		default:
	    			System.out.println("�����·�����");
	    			break;
	    
	    }
				
	}

}
