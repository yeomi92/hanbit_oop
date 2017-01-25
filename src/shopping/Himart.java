package shopping;

import javax.swing.JOptionPane;

public class Himart {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		Customer c = new Customer();
		while(true){
			switch(JOptionPane.showInputDialog("1.청소기 2.컴퓨터 3.스마트폰 4.TV 5.영수증 0.종료")){
				case"0":return;
				case"1":
					Product cleaner = new Cleaner();
					JOptionPane.showMessageDialog(null, (service.buy(cleaner)));
					break;
				case"2":
					Product computer = new Computer();
					JOptionPane.showMessageDialog(null, (service.buy(computer)));
					break;
				case"3":
					Product phone = new SmartPhone();
					JOptionPane.showMessageDialog(null, (service.buy(phone)));
					break;
				case"4":
					Product tv = new TV();
					JOptionPane.showMessageDialog(null, (service.buy(tv)));
					break;
				case"5":
					JOptionPane.showMessageDialog(null, service.getBill());
					break;
			}
		}
	}
}
