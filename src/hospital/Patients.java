package hospital;

public class Patients extends Member{
	private String patJob;
	private int docId,nurId;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public int getNurId() {
		return nurId;
	}
	public void setNurId(int nurId) {
		this.nurId = nurId;
	}
	public String getPatJob() {
		return patJob;
	}
	public void setPatJob(String patJob) {
		this.patJob = patJob;
	}
	@Override
	public String toString() {
		return String.format("patient ID: %s\n"
					+ "nurse ID: %s\n"
					+ "doctor ID: %s\n"
					+ "name: %s\n"
					+ "gender: %s\n"
					+ "ssn: %s\n"
					+ "address: %s\n"
					+ "phone: %s\n"
					+ "email: %s\n"
					+ "job: %s\n",
					uid,nurId,docId,name,getGender(ssn),ssn,addr,phone,email,patJob);
	}
}
