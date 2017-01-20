package hospital;

import java.util.Calendar;

import javax.swing.*;

import test.Bmi;

public class Controller {
	public String getGender(String ssn){
		String gender="";
		switch(ssn.charAt(7)){
			case '1':case '3':
				gender = "남";
				break;
			case '2':case '4':
				gender = "여";
				break;
		}
		return gender;
	}
	public int getAge(String ssn){
		int age=0;
		int jumin=Integer.parseInt(ssn.substring(0,2));
		switch(ssn.charAt(7)){
			case '1':case '2':
				age=Calendar.getInstance().get(Calendar.YEAR)-(1900+jumin)+1;
				break;
			case '3':case '4':
				age=Calendar.getInstance().get(Calendar.YEAR)-(2000+jumin)+1;
				break;
		}
		return age;
	}
	public void start(){
		Bmi bmi = new Bmi();
		String ssn="";
		Controller con = new Controller();
		/*		+ "("역할(의사:1, 간호사:2, 환자:3)\n"
				+ "이름, 주민번호(921015-2), 이메일, 휴대폰번호"
				+ "(종료: 0)");*/
		/*
		 [의사] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 [간호사] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 [환자] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 * */
		switch(input("의사:1, 간호사:2, 환자:3")){
			case "1":
				Doctors doc = new Doctors(); //instance를 만든다.
				doc.setDocName(input("이름?")); //instance면서 reference
				ssn=input("주민등록번호?");
				doc.setDocGen(con.getGender(ssn));
				doc.setDocEmail(input("이메일?"));
				doc.setDocPhone(input("휴대폰번호?"));
				showMsg("[의사]"+doc.getDocName()+"("+doc.getDocGen()+")"+con.getAge(ssn)+"세"+doc.getDocEmail()+doc.getDocPhone());
				break;
			case "2":
				Nurses nur = new Nurses();
				nur.setNurName(input("이름?"));
				ssn=input("주민등록번호?");
				nur.setNurGen(con.getGender(ssn));
				nur.setNurEmail(input("이메일?"));
				nur.setNurPhone(input("휴대폰번호?"));
				showMsg("[간호사]"+nur.getNurName()+"("+nur.getNurGen()+")"+con.getAge(ssn)+"세"+nur.getNurEmail()+nur.getNurPhone());
				break;
			case "3":
				Patients pat = new Patients();
				pat.setPatName(input("이름?"));
				pat.setPatJumin(input("주민등록번호?"));
				pat.setPatGen(con.getGender(pat.getPatJumin()));
				pat.setPatEmail(input("이메일?"));
				pat.setPatPhone(input("휴대폰번호?"));
				showMsg("[환자]"+pat.getPatName()+"("+pat.getPatGen()+")"+con.getAge(pat.getPatJumin())+"세"+pat.getPatEmail()+pat.getPatPhone());
				break;
			case "0":
				System.out.println("종료^^");
				return;
		}
		
	}
	public String input(String str){
		return JOptionPane.showInputDialog(str);
	}
	public void showMsg(String str){
		JOptionPane.showMessageDialog(null, str);
	}
}
