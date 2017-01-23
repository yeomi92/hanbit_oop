package bank;

import java.util.Calendar;

import util.randomGenerator;

public class WageAccount extends Account{
	public WageAccount(String uid,String accountType,int money){ //6자리 random숫자
		accoutNo=randomGenerator.getRandomNum(999999,100000);
		createDate=Calendar.getInstance().get(Calendar.YEAR)+"년"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"월"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일";
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
