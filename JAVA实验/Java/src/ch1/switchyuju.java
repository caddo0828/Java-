package ch1;

//switch���
/*switch����еı��ʽ���������ͻ����ַ��ͣ���int��short,byte,char
 * �����ʽ��ֵ��case��䳣�����ʽ��ֵһ��ʱ��ִ��case������������
 * �����ʽ��ֵ��ƥ��ʱ��ִ��default������������
 * default����ǿ���ѡ��ģ��д�������ִ�У���ʱ������
 * break������ڽ���switch���
 * �����ɸ�case�Ӿ���ִ�е����ݿ���ͬһ�������ʱ��������Щcase��乲��һ�����
 *
 * 
 * */
public class switchyuju {
	public static void main(String[] args){
		int score=65;
		int textscore=score/10;
		switch(textscore){
		case 10:
			break;
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����");
	    	break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		default :
			System.out.println("�޴�ƥ����");
			break;
		}
	}

}
