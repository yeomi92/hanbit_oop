package test;

public class Bmi { //instance variable�� �ݵ�� initialize���� �ʴ´�.
	String name, bmiResult;
	int age;
	double height, weight;
	public String getResult(double weight, double height){
		double bmi = weight / (height * height);
		String result="";
		if (bmi > 30.0) {
			result = "����";
		} else if (bmi > 25.0) {
			result = "��";
		} else if (bmi > 23.0) {
			result = "��ü��";
		} else if (bmi > 18.5) {
			result = "����";
		} else {
			result = "��ü��";
		}
		return result;
	}
}
