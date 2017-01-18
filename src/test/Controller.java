package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { //local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		int i=0;
		System.out.println("1.SSN 2.BMI 3.로또 4.성적표 0.종료");
		switch(s.nextInt()){
		case 0: return;
		case 1:
			String temp="";
				Ssn spatients = new Ssn();
				System.out.println("이름, 주민등록번호를 입력하세요.");
				spatients.setName(s.next());
				temp=s.next();
				char ch=temp.charAt(7);
				while(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
					System.out.println("다시 입력하세요.");
					return;
				}
				spatients.setSsn(temp);
				spatients.calcGender();
				System.out.printf("%s(%s)\n",spatients.getName(),spatients.getGender());
			break;
		case 2:
			System.out.println("환자가 몇명인가요?");
			Bmi[] patients = new Bmi[s.nextInt()];
			for(i=0;i<patients.length;i++){
				patients[i]= new Bmi(); //initialize
				System.out.print("이름, 주민번호 앞 6자리, 신장, 몸무게? ");
				patients[i].setName(s.next());
				patients[i].setAge(s.nextInt());
				patients[i].setHeight((s.nextDouble())/100);
				patients[i].setWeight(s.nextDouble());
				patients[i].calcBmi();
				System.out.printf("%s은 %s입니다.",patients[i].getName(),patients[i].getResult());
			}
			break;
		case 3:
			//lotto
			break;
		case 4:
			int total=0;
			ReportCard rc = new ReportCard();
			System.out.printf("Name:");
			rc.setName(s.next());
			for(i=0;i<6;i++){
				System.out.printf("Score:");
				total+=s.nextInt();
			}
			rc.setTotal(total);
			rc.setSubjectNum(i);
			rc.setAverage(total/i);
			rc.calcGrade();
			System.out.printf("Name: %s\n"
					+ "The Number of Subject: %d\n"
					+ "Total: %d\n"
					+ "Average: %d\n"
					+ "Grade: %s",rc.getName(),rc.getSubjectNum(),rc.getTotal(),rc.getAverage(),rc.getGrade());
			break;
    	}
	}
}
