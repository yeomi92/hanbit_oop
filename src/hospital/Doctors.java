package hospital;

import java.util.Calendar;

public class Doctors { //탄생목적이 db에 값을 가져가서 저장하는 것이다. 그러므로 schema와 같게 만들어야 한다.
	private String docName, docGen, docPhone, docEmail, docPosition, majorTreat;
	private int docId;
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocGen() {
		return docGen;
	}
	public void setDocGen(String docGen) {
		this.docGen = docGen;
	}
	public String getDocPhone() {
		return docPhone;
	}
	public void setDocPhone(String docPhone) {
		this.docPhone = docPhone;
	}
	public String getDocEmail() {
		return docEmail;
	}
	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}
	public String getDocPosition() {
		return docPosition;
	}
	public void setDocPosition(String docPosition) {
		this.docPosition = docPosition;
	}
	public String getMajorTreat() {
		return majorTreat;
	}
	public void setMajorTreat(String majorTreat) {
		this.majorTreat = majorTreat;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	
}
