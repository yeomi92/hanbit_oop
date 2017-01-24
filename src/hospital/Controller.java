package hospital;

import java.util.Calendar;

import javax.swing.*;

public class Controller {
	public final static String EXE_OPTION=
			"0. EXIT\n"
			+ "1.REG-DOCTOR\n"
			+ "2.REG-NURSE\n"
			+ "3.REG-PATIENTS\n"
			+ "4.CHECK BMI\n";
	public final static String DOC_SPEC=
			"INPUT AS doctor ID, major treatment, name, ssn, phone, email, position";
	public final static String NUR_SPEC=
			"INPUT AS nurse ID, major job, name, ssn, phone, email, position";
	public final static String PAT_SPEC=
			"INPUT AS patient ID, nurse ID, doctor ID, name, ssn, address, phone, email, job";
	Doctors doc=null;
	Nurses nur=null;
	public void start(){
		while(true){
			switch(input(EXE_OPTION)){
				case "0":
					showMsg("종료^^");
					return;
				case "1":
					doc = new Doctors();
					String docInfo=input(DOC_SPEC);
					String[] docInfoArr= docInfo.split(" ");
					doc.setUid(Integer.parseInt(docInfoArr[0]));
					doc.setMajorTreat(docInfoArr[1]);
					doc.setName(docInfoArr[2]);
					doc.setSsn(docInfoArr[3]);
					doc.setPhone(docInfoArr[4]);
					doc.setEmail(docInfoArr[5]);
					doc.setDocPosition(docInfoArr[6]);
					showMsg(doc.toString());
					break;
				case "2":
					nur = new Nurses();
					String nurInfo=input(NUR_SPEC);
					String[] nurInfoArr=nurInfo.split(" ");
					nur.setUid(Integer.parseInt(nurInfoArr[0]));
					nur.setMajorJob(nurInfoArr[1]);
					nur.setName(nurInfoArr[2]);
					nur.setSsn(nurInfoArr[3]);
					nur.setPhone(nurInfoArr[4]);
					nur.setEmail(nurInfoArr[5]);
					nur.setNurPosition(nurInfoArr[6]);
					showMsg(nur.toString());
					break;
				case "3":
					int docId=0;
					int nurId=0;
					Patients pat = new Patients();
					String patInfo=input(PAT_SPEC);
					String[] patInfoArr=patInfo.split(" ");
					pat.setUid(Integer.parseInt(patInfoArr[0]));
					nurId=Integer.parseInt(patInfoArr[1]);
					docId=Integer.parseInt(patInfoArr[2]);
					if(docId==(doc.getUid())&&nurId==(nur.getUid())){
						pat.setDocId(docId);
						pat.setNurId(nurId);
					}else{
						showMsg("의사 또는 간호사 등록을 먼저하세요.");
						break;
					}
					pat.setName(patInfoArr[3]);
					pat.setSsn(patInfoArr[4]);
					pat.setAddr(patInfoArr[5]);
					pat.setPhone(patInfoArr[6]);
					pat.setEmail(patInfoArr[7]);
					pat.setPatJob(patInfoArr[8]);
					showMsg(pat.toString());
					break;
				case "4":
					Bmi bmi= new Bmi(); //initialize
					String bmiInfo=input("키,몸무게");
					String[] bmiInfoArr=bmiInfo.split(" ");
					bmi.setHeight((Double.parseDouble(bmiInfoArr[0]))/100);
					bmi.setWeight(Double.parseDouble(bmiInfoArr[1]));
					showMsg(bmi.toString());
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
