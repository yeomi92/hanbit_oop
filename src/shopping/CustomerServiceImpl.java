package shopping;

public class CustomerServiceImpl implements CustomerService{
	Customer c;
	int i;
	public CustomerServiceImpl() {
		c= new Customer();
		i=0;
	}
	//물건 구매 여부 확인, 부족하면 잔액부족
	@Override
	public String buy(Product p) {
		int money = c.getMoney();
		String result="잔액부족\n잔액: "+c.getMoney();
		if(money>p.getPrice()){
			add(p);
			result=p.getName()+"를 카트에 추가\n잔액: "+c.getMoney();
		}
		return result;
	}
	//카트에 추가시키는 로직
	@Override
	public void add(Product p) {
		int money=c.getMoney();
		money-=p.getPrice();
		c.setMoney(money);
		c.getCart()[i]=p;
		i++;
	}
	//쇼핑을 마치고 영수증 출력 (toString과 잔액)
	@Override
	public String getBill() {
		String bill="";
		for(int k=0;k<i;k++){
			bill+=""+c.getCart()[k].getName()+"..."+c.getCart()[k].getPrice()+"\n";
		}
		bill+="잔액: "+c.getMoney();
		return bill;
	}
}
