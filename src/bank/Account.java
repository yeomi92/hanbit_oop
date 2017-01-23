package bank;

import java.util.Calendar;

import util.randomGenerator;

public abstract class Account {
	public final static String BANK_NAME="�Ѻ���ũ";
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
	public Account(String uid,String accountType,int money){ //6�ڸ� random����
		this.accoutNo=randomGenerator.getRandomNum(999999,100000);
		this.createDate=Calendar.getInstance().get(Calendar.YEAR)+"��"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"��"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"��";
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	}
	public abstract void deposit(int money);
	public abstract void withdraw(int money);
}
