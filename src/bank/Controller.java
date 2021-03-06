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
			switch(input("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지")){
				case "0":return;
				case "1":
					member = new Member();
					char ch=0;
					while(true){
						ssn=input("주민등록번호?");
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							showMsg("다시입력하세요.");
						}else{
							break;
						}
					}
					member.setSsn(ssn);
					member.setId(input("ID?"));
					member.setName(input("이름?"));
					break;
				case "2":
					String uid="";
					while(true){
						uid=input("ID?");
						if(member.getUid().equals(uid)){
						break;
						}else{
							showMsg("ID를 다시 입력하세요.\n");
						}
					}
					String accountType=input("예금종류?");
					int money=Integer.parseInt(input("입금금액?")); 
					account= new WageAccount(uid,accountType,money);
					showMsg(account.toString());
					break;
				case "3":
					showMsg(account.deposit(Integer.parseInt(input("입금할 금액을 입력하세요."))));
					break;
				case "4":
					showMsg(account.withdraw(Integer.parseInt(input("출금할 금액을 입력하세요."))));
					break;
				case "5":
					showMsg("잔액은"+String.valueOf(account.getMoney())+"원입니다.");
					break;
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

