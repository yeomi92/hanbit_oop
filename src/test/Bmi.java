package test;

public class Bmi { //instance variable�� �ݵ�� initialize���� �ʴ´�.
	private String name, result;
	private int age;
	private double height, weight;
	
	public void setName(String name){
		this.name=name;
	}
	//setter�� �����ϸ�, readOnly ����, �ܺο��� ������ ��ĥ �� ����. ���ȿ� �پ��
	public void calcBmi(){
		double bmi = weight / (height * height);
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
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getHeight(){
		return height;
	}
	public double getWeight(){
		return weight;
	}
	public String getResult(){
		return result;
	}
}
