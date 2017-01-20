package hospital;

import java.util.Calendar;

import javax.swing.*;

import test.Bmi;

public class Controller {
	public String getGender(String ssn){
		String gender="";
		switch(ssn.charAt(7)){
			case '1':case '3':
				gender = "��";
				break;
			case '2':case '4':
				gender = "��";
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
		/*		+ "("����(�ǻ�:1, ��ȣ��:2, ȯ��:3)\n"
				+ "�̸�, �ֹι�ȣ(921015-2), �̸���, �޴�����ȣ"
				+ "(����: 0)");*/
		/*
		 [�ǻ�] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 [��ȣ��] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 [ȯ��] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 * */
		switch(input("�ǻ�:1, ��ȣ��:2, ȯ��:3")){
			case "1":
				Doctors doc = new Doctors(); //instance�� �����.
				doc.setDocName(input("�̸�?")); //instance�鼭 reference
				ssn=input("�ֹε�Ϲ�ȣ?");
				doc.setDocGen(con.getGender(ssn));
				doc.setDocEmail(input("�̸���?"));
				doc.setDocPhone(input("�޴�����ȣ?"));
				showMsg("[�ǻ�]"+doc.getDocName()+"("+doc.getDocGen()+")"+con.getAge(ssn)+"��"+doc.getDocEmail()+doc.getDocPhone());
				break;
			case "2":
				Nurses nur = new Nurses();
				nur.setNurName(input("�̸�?"));
				ssn=input("�ֹε�Ϲ�ȣ?");
				nur.setNurGen(con.getGender(ssn));
				nur.setNurEmail(input("�̸���?"));
				nur.setNurPhone(input("�޴�����ȣ?"));
				showMsg("[��ȣ��]"+nur.getNurName()+"("+nur.getNurGen()+")"+con.getAge(ssn)+"��"+nur.getNurEmail()+nur.getNurPhone());
				break;
			case "3":
				Patients pat = new Patients();
				pat.setPatName(input("�̸�?"));
				pat.setPatJumin(input("�ֹε�Ϲ�ȣ?"));
				pat.setPatGen(con.getGender(pat.getPatJumin()));
				pat.setPatEmail(input("�̸���?"));
				pat.setPatPhone(input("�޴�����ȣ?"));
				showMsg("[ȯ��]"+pat.getPatName()+"("+pat.getPatGen()+")"+con.getAge(pat.getPatJumin())+"��"+pat.getPatEmail()+pat.getPatPhone());
				break;
			case "0":
				System.out.println("����^^");
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
