package bank;

import java.util.Calendar;

import util.randomGenerator;

public class Account {
	public final static String BANK_NAME="�Ѻ���ũ";
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
	public Account(String uid,String accountType,int money){ //6�ڸ� random����
		this.accoutNo=randomGenerator.getRandomNum(999999,100000);
		this.createDate=Calendar.getInstance().get(Calendar.YEAR)+"��"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"��"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"��";
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	}
	//�Ա�
	public void deposit(int money){
		this.money+=money;
	}
	//���
	public void withdraw(int money){
		this.money=(this.money>money)?this.money-money:this.money;
	}
}
