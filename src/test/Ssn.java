package test;

import java.util.Scanner;

public class Ssn {
	String ssn, name;
	public String getGender(char ch){
		String gender="";
		switch(ch){
		case '1':case '3':
			gender = "����";
			break;
		case '2':case '4':
			gender = "����";
			break;
		case '5':case '6':
			gender = "�ܱ���";
			break;
		default:
			System.out.println("�߸��� ���� �Է��߽��ϴ�.");
		}
		return gender;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ssn[] patients = new Ssn[3];
		for(int i=0;i<3;i++){
			patients[i] = new Ssn();
			System.out.println("�̸�, �ֹε�Ϲ�ȣ�� �Է��ϼ���.");
			patients[i].name=s.next();
			patients[i].ssn=s.next();
			System.out.printf("%s�Դϴ�.\n",patients[i].getGender(patients[i].ssn.charAt(7)));
		}	
	}
}
