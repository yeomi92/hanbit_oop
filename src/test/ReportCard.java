package test;
import java.util.Scanner;
/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class ReportCard {
	private String name;
	private int score, total, average, subjectNum;
	private String grade;
	public void setName(String name){
		this.name=name;
	}
	public void setScore(int score){
		this.score=score;
	}
	public void setTotal(int total){
		this.total=total;
	}
	public void setAverage(int average){
		this.average=average;
	}
	public void setSubjectNum(int subjectNum){
		this.subjectNum=subjectNum;
	}
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
	public int getTotal(){
		return total;
	}
	public int getAverage(){
		return average;
	}
	public int getSubjectNum(){
		return subjectNum;
	}
	public String getGrade(){
		return grade;
	}
	public void calcGrade() {	
		if(average >=90){
			grade = "A";
		}else if(average >=80){
			grade = "B";
		}else if(average >=70){
			grade = "C";
		} else{
			grade = "D";
		}	
	}
	public void calcAverage(){
		this.average=total / subjectNum;
	}
}