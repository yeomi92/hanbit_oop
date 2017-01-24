package bank2;

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
		return "["+Account.BANK_NAME+"]\n���¹�ȣ: "+accoutNo+"\n��������: ���࿹��\n������: "+createDate+"\n�ܾ�: "+money+"��";
	}
}
