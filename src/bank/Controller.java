package bank;

import java.util.Calendar;
import java.util.Scanner;
import test.Member;

public class Controller {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Member member=null;
		Account account=null;
		String ssn="";
		int i=0;
		while(true){
			System.out.println("0.���� 1.ȸ����� 2.���尳�� 3.�Ա� 4.��� 5.��ȸ 6.����");
			switch(s.nextInt()){
				case 0:return;
				case 1:
					member = new Member();
					char ch=0;
					while(true){
						System.out.println("�ֹε�Ϲ�ȣ?");
						ssn=s.next();
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							System.out.println("�ٽ��Է��ϼ���.\n");
						}else{
							break;
						}
					}
					System.out.println("ID, �̸�?");
					member.setId(s.next());
					member.setName(s.next());
					member.setSsn(ssn);
					break;
				case 2:
					String uid="";
					while(true){
						System.out.println("ID?");
						uid=s.next();
						if(member.getUid().equals(uid)){
						break;
						}else{
							System.out.println("ID�� �ٽ� �Է��ϼ���.");
						}
					}
					System.out.println("��������, �Ա� �ݾ�?");
					account= new Account(uid,s.next(),s.nextInt());
					System.out.printf("[%s]\n���¹�ȣ:%d\n��������:���࿹�� %s��\n������:%s\n�ܾ�:%d��\n\n",Account.BANK_NAME,account.getAccoutNo(),member.getName(),account.getCreateDate(),account.getMoney());
					/*System.out.printf("[%s]\n���¹�ȣ:%d\n��������:���࿹�ݿ�������\n������:%s\n�ܾ�:��0\n"Account.BANK_NAME,,);*/
					break;
				case 3:break;
				case 4:break;
				case 5:break;
				case 6:break;
			}
		}
	}
}
