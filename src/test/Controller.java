package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { //local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		System.out.println("환자가 몇명인가요?");
		Bmi[] patients = new Bmi[s.nextInt()];
		Ssn ssn= new Ssn();
		for(int i=0;i<patients.length;i++){
			patients[i]= new Bmi(); //initialize
			System.out.print("이름, 주민번호 앞 6자리, 신장, 몸무게? ");
			patients[i].name=s.next();
			patients[i].age=s.nextInt();
			patients[i].height=(s.nextDouble())/100;
			patients[i].weight=s.nextDouble();
			System.out.printf("%s은 %s입니다.\n", patients[i].name, 
					patients[i].getResult(patients[i].weight,patients[i].height));
		}
	}
}
