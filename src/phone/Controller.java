package phone;

import javax.swing.JOptionPane;
import util.Input;
import util.Output;

public class Controller{
	public void start(){
		while(true){
			switch (Input.input("��ɼ���: 1.�Ｚ��ȭ�� 2.��Ű�� 3.������ 4.������ 0.����")){
				case "0":return;
				case "1":
					Phone phone = new Phone();
					phone.setReceiver(Input.input("�������� ��ȭ�Ͻðڽ��ϱ�?"));
					phone.setCall(Input.input("�޼����� �ۼ��ϼ���."));
					Output.showMsg(phone.toString());
					break;
				case "2":
					Nokia nokia = new Nokia();
					nokia.setPotable(true);
					nokia.setReceiver(Input.input("�������� ��ȭ�Ͻðڽ��ϱ�?"));
					nokia.setCall(Input.input("�޼����� �ۼ��ϼ���."));
					Output.showMsg(nokia.toString());
					break;
				case "3":
					Iphone iphone = new Iphone();
					iphone.setPotable(true);
					iphone.setReceiver(Input.input("��� �˻��Ͻðڽ��ϱ�?"));
					iphone.setData(Input.input("������ �˻��Ͻðڽ��ϱ�?"));
					Output.showMsg(iphone.toString());
					break;
				case "4":
					GalaxyNote galaxyNote = new GalaxyNote();
					galaxyNote.setPotable(true);
					galaxyNote.setSize(Input.input("��ȭ���� �Է��ϼ���"));
					galaxyNote.setReceiver(Input.input("��� �˻��Ͻðڽ��ϱ�?"));
					galaxyNote.setData(Input.input("������ �˻��Ͻðڽ��ϱ�?"));
					Output.showMsg(galaxyNote.toString());
					break;
			}
		}
		
	}
}
