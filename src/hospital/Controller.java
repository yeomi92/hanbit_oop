package hospital;

import java.util.Calendar;
import java.util.Scanner;

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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ssn="";
		Controller con = new Controller();
		System.out.println("역할(의사:1, 간호사:2, 환자:3)\n"
				+ "이름, 주민번호(921015-2), 이메일, 휴대폰번호"
				+ "(종료: 0)");
		/*
		 [의사] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 [간호사] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 [환자] 한석규(남), 26세, hsk@gmail.com, 010-1234-5678
		 * */
		switch(s.nextInt()){
		case 1:
			Doctors doc = new Doctors();
			doc.docName=s.next();
			ssn=s.next();
			doc.docGen=con.getGender(ssn);
			doc.docEmail=s.next();
			doc.docPhone=s.next();
			System.out.printf("[의사] %s(%s), %d세, %s, %s"
					,doc.docName,doc.docGen,con.getAge(ssn),doc.docEmail,doc.docPhone);
			break;
		case 2:
			Nurses nur = new Nurses();
			nur.nurName=s.next();
			ssn=s.next();
			nur.nurGen=con.getGender(ssn);
			nur.nurEmail=s.next();
			nur.nurPhone=s.next();
			System.out.printf("[간호사] %s(%s), %d세, %s, %s"
					,nur.nurName,nur.nurGen,con.getAge(ssn),nur.nurEmail,nur.nurPhone);
			break;
		case 3:
			Patients pat = new Patients();
			pat.patName=s.next();
			pat.patJumin=s.next();
			pat.patGen=con.getGender(pat.patJumin);
			pat.patEmail=s.next();
			pat.patPhone=s.next();
			System.out.printf("[환자] %s(%s), %d세, %s, %s"
					,pat.patName,pat.patGen,con.getAge(pat.patJumin),pat.patEmail,pat.patPhone);
			break;
		case 0:
			System.out.println("종료^^");
			return;
		}
	}
}
