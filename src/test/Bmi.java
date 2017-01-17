package test;

public class Bmi { //instance variable은 반드시 initialize하지 않는다.
	String name, bmiResult;
	int age;
	double height, weight;
	public String getResult(double weight, double height){
		double bmi = weight / (height * height);
		String result="";
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
}
