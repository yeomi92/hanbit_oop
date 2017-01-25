package shopping;

public class CustomerServiceImpl implements CustomerService{
	Customer c;
	int i;
	public CustomerServiceImpl() {
		c= new Customer();
		i=0;
	}
	//���� ���� ���� Ȯ��, �����ϸ� �ܾ׺���
	@Override
	public String buy(Product p) {
		int money = c.getMoney();
		String result="�ܾ׺���\n�ܾ�: "+c.getMoney();
		if(money>p.getPrice()){
			add(p);
			result=p.getName()+"�� īƮ�� �߰�\n�ܾ�: "+c.getMoney();
		}
		return result;
	}
	//īƮ�� �߰���Ű�� ����
	@Override
	public void add(Product p) {
		int money=c.getMoney();
		money-=p.getPrice();
		c.setMoney(money);
		c.getCart()[i]=p;
		i++;
	}
	//������ ��ġ�� ������ ��� (toString�� �ܾ�)
	@Override
	public String getBill() {
		String bill="";
		for(int k=0;k<i;k++){
			bill+=""+c.getCart()[k].getName()+"..."+c.getCart()[k].getPrice()+"\n";
		}
		bill+="�ܾ�: "+c.getMoney();
		return bill;
	}
}
