package test;

import java.util.Scanner;

public class Ssn {
	private String ssn, name, gender;
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public void setName(String name){
		
		this.name=name;
	}
	public String getSsn(){
		return ssn;
	}
	public String getName(){
		return name;
	}
	public String getGender(){
		
		return gender;
	}
	public void calcGender(){
		switch(ssn.charAt(7)){
			case '1':case '3':
				gender = "����";
				break;
			case '2':case '4':
				gender = "����";
				break;
			case '5':case '6':
				gender = "�ܱ���";
				break;
		}
	}
}
