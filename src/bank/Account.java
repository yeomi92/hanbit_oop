package bank;

import java.util.Calendar;

import util.randomGenerator;

public abstract class Account {
	public final static String BANK_NAME="한빛뱅크";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="입금불가";
	protected int money,accoutNo;
	protected String uid,accountType,createDate;
	public Account() {}
	public Account(String uid,String accountType,int money){ //6자리 random숫자
		accoutNo=randomGenerator.getRandomNum(999999,100000);
		createDate=Calendar.getInstance().get(Calendar.YEAR)+"년"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"월"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일";
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	}
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
	public abstract boolean checkmoney(int money);
	public abstract String deposit(int money);
	public abstract String withdraw(int money);	
}
