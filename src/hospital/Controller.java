package hospital;

import java.util.Calendar;
import java.util.Scanner;
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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bmi bmi = new Bmi();
		String ssn="";
		Controller con = new Controller();
		System.out.println("����(�ǻ�:1, ��ȣ��:2, ȯ��:3)\n"
				+ "�̸�, �ֹι�ȣ(921015-2), �̸���, �޴�����ȣ"
				+ "(����: 0)");
		/*
		 [�ǻ�] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 [��ȣ��] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 [ȯ��] �Ѽ���(��), 26��, hsk@gmail.com, 010-1234-5678
		 * */
		switch(s.nextInt()){
			case 1:
				Doctors doc = new Doctors(); //instance�� �����.
				doc.setDocName(s.next()); //instance�鼭 reference
				ssn=s.next();
				doc.setDocGen(con.getGender(ssn));
				doc.setDocEmail(s.next());
				doc.setDocPhone(s.next());
				System.out.printf("[�ǻ�] %s(%s), %d��, %s, %s"
						,doc.getDocName(),doc.getDocGen(),con.getAge(ssn),doc.getDocEmail(),doc.getDocPhone());
				break;
			case 2:
				Nurses nur = new Nurses();
				nur.setNurName(s.next());
				ssn=s.next();
				nur.setNurGen(con.getGender(ssn));
				nur.setNurEmail(s.next());
				nur.setNurPhone(s.next());
				System.out.printf("[��ȣ��] %s(%s), %d��, %s, %s"
						,nur.getNurName(),nur.getNurGen(),con.getAge(ssn),nur.getNurEmail(),nur.getNurPhone());
				break;
			case 3:
				Patients pat = new Patients();
				pat.setPatName(s.next());
				pat.setPatJumin(s.next());
				pat.setPatGen(con.getGender(pat.getPatJumin()));
				pat.setPatEmail(s.next());
				pat.setPatPhone(s.next());
				System.out.printf("[ȯ��] %s(%s), %d��, %s, %s"
						,pat.getPatName(),pat.getPatGen(),con.getAge(pat.getPatJumin()),pat.getPatEmail(),pat.getPatPhone());
				break;
			case 0:
				System.out.println("����^^");
				return;
		}
	}
}
