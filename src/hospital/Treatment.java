package hospital;

public class Treatment extends Bmi{
	@Override
	public String calcBmi(double weight, double height) {
		String result="";
		double bmi=0;
		bmi = weight / (height * height);
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
	@Override
	public String toString() {
		return String.format("���ϴ� %s �Դϴ�.",calcBmi(weight,height));
	}
}
