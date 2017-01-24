package bank2;

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
	public boolean checkmoney(int money) {
		return money>=0;
	}
	@Override
	public String deposit(int money) {
		String result="";
		if(checkmoney(money)){
			super.money+=money;
			result=DEPOSIT_SUCCESS;
		}else{
			result=DEPOSIT_FAIL;
		}
		return result;
	}
	@Override
	public String withdraw(int money) {
		String result="";
		if(checkmoney(super.money-money)){
			super.money-=money;
			result=WITHDRAW_SUCCESS;
		}else{
			result=WITHDRAW_FAIL;
		}
		return result;
	}
	@Override
	public String toString() {
		return "["+Account.BANK_NAME+"]\n계좌번호: "+accoutNo+"\n예금종류: 저축예금\n가입일: "+createDate+"\n잔액: "+money+"원";
	}
}
