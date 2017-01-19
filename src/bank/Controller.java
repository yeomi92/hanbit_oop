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
			System.out.println("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지");
			switch(s.nextInt()){
				case 0:return;
				case 1:
					member = new Member();
					char ch=0;
					while(true){
						System.out.println("주민등록번호?");
						ssn=s.next();
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							System.out.println("다시입력하세요.\n");
						}else{
							break;
						}
					}
					System.out.println("ID, 이름?");
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
							System.out.println("ID를 다시 입력하세요.");
						}
					}
					System.out.println("예금종류, 입금 금액?");
					account= new Account(uid,s.next(),s.nextInt());
					System.out.printf("[%s]\n계좌번호:%d\n예금종류:저축예금 %s님\n가입일:%s\n잔액:%d원\n\n",Account.BANK_NAME,account.getAccoutNo(),member.getName(),account.getCreateDate(),account.getMoney());
					/*System.out.printf("[%s]\n계좌번호:%d\n예금종류:저축예금염혜선님\n가입일:%s\n잔액:￦0\n"Account.BANK_NAME,,);*/
					break;
				case 3:break;
				case 4:break;
				case 5:break;
				case 6:break;
			}
		}
	}
}
