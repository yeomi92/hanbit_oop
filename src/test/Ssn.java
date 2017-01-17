package test;

import java.util.Scanner;

public class Ssn {
	String ssn, name;
	public String getGender(char ch){
		String gender="";
		switch(ch){
		case '1':case '3':
			gender = "남자";
			break;
		case '2':case '4':
			gender = "여자";
			break;
		case '5':case '6':
			gender = "외국인";
			break;
		default:
			System.out.println("잘못된 값을 입력했습니다.");
		}
		return gender;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ssn[] patients = new Ssn[3];
		for(int i=0;i<3;i++){
			patients[i] = new Ssn();
			System.out.println("이름, 주민등록번호를 입력하세요.");
			patients[i].name=s.next();
			patients[i].ssn=s.next();
			System.out.printf("%s입니다.\n",patients[i].getGender(patients[i].ssn.charAt(7)));
		}	
	}
}
