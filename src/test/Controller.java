package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { //local variable �ݵ�� initialize
		Scanner s = new Scanner(System.in);
		System.out.println("ȯ�ڰ� ����ΰ���?");
		Bmi[] patients = new Bmi[s.nextInt()];
		Ssn ssn= new Ssn();
		for(int i=0;i<patients.length;i++){
			patients[i]= new Bmi(); //initialize
			System.out.print("�̸�, �ֹι�ȣ �� 6�ڸ�, ����, ������? ");
			patients[i].name=s.next();
			patients[i].age=s.nextInt();
			patients[i].height=(s.nextDouble())/100;
			patients[i].weight=s.nextDouble();
			System.out.printf("%s�� %s�Դϴ�.\n", patients[i].name, 
					patients[i].getResult(patients[i].weight,patients[i].height));
		}
	}
}
