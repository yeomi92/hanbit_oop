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
	//���� ���� ���� Ȯ��, �����ϸ� �ܾ׺���
	@Override
	public String buy(Product p) {
		int money = customer.getMoney();
		String result="�ܾ׺���\n�ܾ�: "+customer.getMoney();
		if(money>p.getPrice()){
			add(p);
			result=p.getName()+"�� īƮ�� �߰�\n�ܾ�: "+customer.getMoney();
		}
		return result;
	}
	//īƮ�� �߰���Ű�� ����
	@Override
	public void add(Product p) {
		int money=customer.getMoney();
		money-=p.getPrice();
		customer.setMoney(money);
		cart[i]=p;
		i++;
	}
	//������ ��ġ�� ������ ��� (toString�� �ܾ�)
	@Override
	public String getBill() {
		String bill="";
		for(int k=0;k<i;k++){
			bill+=""+cart[k].getName()+"..."+cart[k].getPrice()+"\n";
		}
		bill+="�ܾ�: "+customer.getMoney();
		return bill;
	}
}
