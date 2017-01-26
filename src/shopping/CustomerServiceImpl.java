package shopping;

public class CustomerServiceImpl implements CustomerService{
	Customer customer;
	Product[] cart;
	int i;
	public CustomerServiceImpl() {
		customer= new Customer();
		cart = new Product[4];
		i=0;
	}
	//물건 구매 여부 확인, 부족하면 잔액부족
	@Override
	public String buy(Product p) {
		int money = customer.getMoney();
		String result="잔액부족\n잔액: "+customer.getMoney();
		if(money>p.getPrice()){
			add(p);
			result=p.getName()+"를 카트에 추가\n잔액: "+customer.getMoney();
		}
		return result;
	}
	//카트에 추가시키는 로직
	@Override
	public void add(Product p) {
		int money=customer.getMoney();
		money-=p.getPrice();
		customer.setMoney(money);
		cart[i]=p;
		i++;
	}
	//쇼핑을 마치고 영수증 출력 (toString과 잔액)
	@Override
	public String getBill() {
		String bill="";
		for(int k=0;k<i;k++){
			bill+=""+cart[k].getName()+"..."+cart[k].getPrice()+"\n";
		}
		bill+="잔액: "+customer.getMoney();
		return bill;
	}
}
