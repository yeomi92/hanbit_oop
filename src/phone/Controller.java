package phone;

import javax.swing.JOptionPane;
import util.Input;
import util.Output;

public class Controller{
	public void start(){
		while(true){
			switch (Input.input("기능선택: 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시 0.종료")){
				case "0":return;
				case "1":
					Phone phone = new Phone();
					phone.setReceiver(Input.input("누구한테 전화하시겠습니까?"));
					phone.setCall(Input.input("메세지를 작성하세요."));
					Output.showMsg(phone.toString());
					break;
				case "2":
					Nokia nokia = new Nokia();
					nokia.setPotable(true);
					nokia.setReceiver(Input.input("누구한테 전화하시겠습니까?"));
					nokia.setCall(Input.input("메세지를 작성하세요."));
					Output.showMsg(nokia.toString());
					break;
				case "3":
					Iphone iphone = new Iphone();
					iphone.setPotable(true);
					iphone.setReceiver(Input.input("어디서 검색하시겠습니까?"));
					iphone.setData(Input.input("무엇을 검색하시겠습니까?"));
					Output.showMsg(iphone.toString());
					break;
				case "4":
					GalaxyNote galaxyNote = new GalaxyNote();
					galaxyNote.setPotable(true);
					galaxyNote.setSize(Input.input("대화면을 입력하세요"));
					galaxyNote.setReceiver(Input.input("어디서 검색하시겠습니까?"));
					galaxyNote.setData(Input.input("무엇을 검색하시겠습니까?"));
					Output.showMsg(galaxyNote.toString());
					break;
			}
		}
		
	}
}
