package test;

import java.util.Scanner;

import javax.swing.JOptionPane;

import hospital.Treatment;

public class Controller {
	public void start(){
		Scanner s = new Scanner(System.in);
		int i=0;
		String ssn="";
		Member member=null;//��ü�� �ʱⰪ�� null
		while(true){
			/*int opt=Integer.parseInt(option);//String to int
			String opt2=String.valueOf(opt);//int to String*/			
			switch(input("� �۾��� ���Ͻó���?\n1.ȸ����� 2.BMI 3.�ζ� 4.����ǥ 0.����\n")){
				case "0": return;
				case "1":
					member=new Member();
					char ch=0;
					//Input ID
					while(true){ 
						ssn=input("�ֹε�Ϲ�ȣ(921015-2)");
						ch=ssn.charAt(7);
						if(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'){
							showMsg("�ٽ� �Է��ϼ���.");
						}else{
							break;
						}
					}
					member.setSsn(ssn);
					member.setId(input("���̵�"));
					member.setName(input("�̸�"));
					showMsg(member.getName()+"("+member.calcGender(ssn)+")"+"�� ȸ������� �Ǿ����ϴ�.");
					break;
				case "3":
					//lotto
					break;
				case "4":
					int total=0;
					ReportCard rc = new ReportCard();
					rc.setName(input("Name?"));
					for(i=0;i<6;i++){
						total+=Integer.parseInt(input("Score:"));
					}
					rc.setTotal(total);
					rc.setSubjectNum(i);
					rc.setAverage(total/i);
					rc.calcGrade();
					showMsg("Name:"+rc.getName()+"\nThe Number of Subject:"+rc.getSubjectNum()+"\nTotal: "+rc.getTotal()+"\nAverage: "+rc.getAverage()+"\nGrade: "+rc.getGrade());
					break;
				case "5":
					
					break;
	    	}
		}
	}
	public String input(String str){
		return JOptionPane.showInputDialog(str);
	}
	public void showMsg(String str){
		JOptionPane.showMessageDialog(null, str);
	}
}
