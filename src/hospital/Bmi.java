package hospital;

public abstract class Bmi { //instance variable�� �ݵ�� initialize���� �ʴ´�.
	protected double height, weight;
	//setter�� �����ϸ�, readOnly ����, �ܺο��� ������ ��ĥ �� ����. ���ȿ� �پ��
	//stand alone

	/*public String calcBmi(double weight, double height){
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
	}*/
	public void setHeight(double height){
		this.height=height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getHeight(){
		return height;
	}
	public double getWeight(){
		return weight;
	}
	public abstract String calcBmi(double weight, double height);
}
