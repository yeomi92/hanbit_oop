package bank;

public abstract class Account {
	public final static String BANK_NAME="ÇÑºû¹ðÅ©";
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
	public abstract void deposit(int money);
	public abstract void withdraw(int money);
}
