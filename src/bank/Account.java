package bank;

import java.util.Calendar;

import util.randomGenerator;

public abstract class Account {
	public final static String BANK_NAME="한빛뱅크";
	protected int money,accoutNo;
	protected String uid,accountType,createDate;
	public Account() {}
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
		this.accoutNo=randomGenerator.getRandomNum(999999,100000);
		this.createDate=Calendar.getInstance().get(Calendar.YEAR)+"년"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"월"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일";
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	}
	public abstract void deposit(int money);
	public abstract void withdraw(int money);
}
