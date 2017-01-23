package bank;

import java.util.Calendar;

import util.randomGenerator;

public class WageAccount extends Account{
	public WageAccount(String uid,String accountType,int money){ //6�ڸ� random����
		accoutNo=randomGenerator.getRandomNum(999999,100000);
		createDate=Calendar.getInstance().get(Calendar.YEAR)+"��"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"��"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"��";
		super.uid=uid;
		super.accountType=accountType;
		super.money=money;
	}
	@Override
	public void deposit(int money) {
		super.money+=money;
	}
	@Override
	public void withdraw(int money) {
		super.money=(super.money>money)?super.money-money:super.money;
	}
}
