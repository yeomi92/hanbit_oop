package bank;

import test.Member;
import javax.swing.*;

public class Controller {
	public void start(){
		Member member=null;
		Account account=null;
		String ssn="";
		int i=0;
		int temp=0;
		while(true){
			switch(input("0.���� 1.ȸ����� 2.���尳�� 3.�Ա� 4.��� 5.��ȸ 6.����")){
				case "0":return;
				case "1":
					member = new Member();
					char ch=0;
					while(true){
						ssn=input("�ֹε�Ϲ�ȣ?");
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							showMsg("�ٽ��Է��ϼ���.");
						}else{
							break;
						}
					}
					member.setSsn(ssn);
					member.setId(input("ID?"));
					member.setName(input("�̸�?"));
					break;
				case "2":
					String uid="";
					while(true){
						uid=input("ID?");
						if(member.getUid().equals(uid)){
						break;
						}else{
							showMsg("ID�� �ٽ� �Է��ϼ���.\n");
						}
					}
					String accountType=input("��������?");
					int money=Integer.parseInt(input("�Աݱݾ�?")); 
					account= new Account(uid,accountType,money);
					showMsg("["+Account.BANK_NAME+"]\n���¹�ȣ: "+account.getAccoutNo()+"\n��������: ���࿹��\n"+member.getName()+"��\n������: "+account.getCreateDate()+"\n�ܾ�: "+account.getMoney()+"��");
					break;
				case "3":
					account.deposit(Integer.parseInt(input("�Ա��� �ݾ��� �Է��ϼ���.")));
					showMsg("�ܾ��� "+account.getMoney()+"���Դϴ�.");
					break;
				case "4":
					temp=account.getMoney();
					account.withdraw(Integer.parseInt(input("����� �ݾ��� �Է��ϼ���.")));
					showMsg((temp==account.getMoney())?"�ܰ� �����մϴ�.":"�ܾ��� "+account.getMoney()+"���Դϴ�.");
					break;
				case "5":break;
				case "6":break;
			}
		}
	}
	public String input(String str){
		return JOptionPane.showInputDialog(str);
	}
	public void showMsg(String str){
		JOptionPane.showMessageDialog(null, str);
	}
}

