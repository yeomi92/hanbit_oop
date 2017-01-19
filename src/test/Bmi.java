package test;

public class Bmi { //instance variable은 반드시 initialize하지 않는다.
	private String uid;
	private double height, weight;
	
	public void setUid(String uid){
		this.uid=uid;
	}
	//setter를 생략하면, readOnly 파일, 외부에서 정보를 고칠 수 없다. 보안에 뛰어나다
	//stand alone
	public String calcBmi(double weight, double height){
		String result="";
		double bmi=0;
		bmi = weight / (height * height);
		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public String getUid(){
		return uid;
	}
	public double getHeight(){
		return height;
	}
	public double getWeight(){
		return weight;
	}
}
