package test;

public class Member {
	private String ssn,name,uid;
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public void setName(String name){
		
		this.name=name;
	}
	public void setId(String uid){
		this.uid= uid;
	}
	public String getSsn(){
		return ssn;
	}
	public String getName(){
		return name;
	}
	public String getUid(){
		return uid;
	}
	//������ �ʿ���� method�� stand alone���� �ۼ��ؾ��Ѵ�.(���Ӽ��� ���־� �Ѵ�.)
	public String calcGender(String ssn){
		String gender="";
		switch(ssn.charAt(7)){
			case '1':case '3':
				gender="����";
				break;
			case '2':case '4':
				gender="����";
				break;
			case '5':case '6':
				gender="�ܱ���";
				break;
		}
			return gender;
	}
}
