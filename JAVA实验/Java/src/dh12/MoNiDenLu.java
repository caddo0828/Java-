package dh12;
//ģ���û���¼
//13
import java.util.Scanner;

public class MoNiDenLu {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		for(int i=0;i<3;i++){
		//x=0,1,2
		//����¼���û���������
		Scanner sc = new Scanner(System.in);
		
		//����¼������
		System.out.println("�������û���");
		String name = sc.nextLine();
		System.out.println("�������û�����");
		String pwd = sc.nextLine();
		
		//�û��������붼��ȷ�����¼�ɹ�������ʧ��
		if(name.equals(username)&&pwd.equals(password)) {
			System.out.println("��¼�ɹ�!");
			//��ת����������Ϸ����
			System.out.println("��ӭ�����������Ϸ��");
			GuessNumberGame.start();
			break;
		}else {
			//����Ϊ0���˺ű�����
			if((2-i)==0) {
				System.out.println("�˺ű�����������ͷ���ϵ");
			}else {
				//����2��1��0�λ���
				System.out.println("��¼ʧ��"+(2-i)+"�λ���");
			}
		}
	}
	}
	

}
