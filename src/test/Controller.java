package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { //local variable �ݵ�� initialize
		Scanner s = new Scanner(System.in);
		int i=0;
		String ssn="";
		Member member=null;//��ü�� �ʱⰪ�� null
		while(true){
		System.out.printf("� �۾��� ���Ͻó���?\n"
				+ "1.ȸ����� 2.BMI 3.�ζ� 4.����ǥ 0.����\n");
			switch(s.nextInt()){
				case 0: return;
				case 1:
					member=new Member();
					char ch=0;
					System.out.println("���̵�, �̸�");
					//Input ID
					member.setId(s.next());
					member.setName(s.next());
					while(true){ 
						System.out.println("�ֹε�Ϲ�ȣ(921015-2)");
						ssn=s.next();
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							System.out.println("�ٽ� �Է��ϼ���.\n");
						}else{
							break;
						}
					}
					member.setSsn(ssn);
					System.out.printf("%s(%s)\n\n",member.getName(),member.calcGender(ssn));
					break;
				case 2:
						Bmi patients= new Bmi(); //initialize
						String uid="";
						while(true){	
							System.out.print("ID?\n");
							uid=s.next();
							if(member.getUid().equals(uid)){
								break;
							}else{
								System.out.println("ID�� �ٽ��Է��ϼ���.\n");
							}
						}
						patients.setUid(uid);
						System.out.print("����, ������?\n");
						patients.setHeight((s.nextDouble())/100);
						patients.setWeight(s.nextDouble());
						System.out.printf("%s�� %s�Դϴ�.\n\n",member.getName(),patients.calcBmi(patients.getWeight(),patients.getHeight()));
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
				case 5:
					
					break;
	    	}
		}
	}
}
