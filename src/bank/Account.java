package bank;

import java.util.Calendar;

public class Account {
	public final static String BANK_NAME="한빛뱅크";
	private int money,accoutNo;
	private String uid,accountType,createDate;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAccoutNo() {
		return accoutNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getCreateDate() {
		return createDate;
	}
	public Account(String uid,String accountType,int money){ //6자리 random숫자
		/*this.accoutNo=createAccountNo();*/
		this.accoutNo=(int)(Math.random()*(999999-100000+1)+100000);
		this.createDate=today();
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	}
	public String today(){
		String today="";
		Calendar now = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		sb.append(now.get(now.YEAR));
		sb.append("년");
		sb.append(now.get(now.MONTH)+1);
		sb.append("월");
		sb.append(now.get(now.DAY_OF_MONTH));
		sb.append("일");
		today=sb.toString();
		return today;
	}
	public int createAccountNo(){
		String random="";
		for(int i=0;i<6;i++){
			random+=""+(int)(Math.random()*10);
		}
		return Integer.parseInt(random);
	}
	
	
}
