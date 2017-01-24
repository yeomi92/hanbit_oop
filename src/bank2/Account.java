package bank2;

public abstract class Account {
	public final static String BANK_NAME="�Ѻ���ũ";
	public final static String WITHDRAW_SUCCESS="��ݼ���";
	public final static String WITHDRAW_FAIL="�ܾ׺���";
	public final static String DEPOSIT_SUCCESS="�Աݼ���";
	public final static String DEPOSIT_FAIL="�ԱݺҰ�";
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
	public abstract boolean checkmoney(int money);
	public abstract String deposit(int money);
	public abstract String withdraw(int money);	
}
