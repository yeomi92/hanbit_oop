package array;

public interface ArrayService {
	//1.ADD "Java","Jsp","Spring","JS","HTML"
	public String[] add();
	//2.Find One
	public String findOne();
	//3.Find Some
	public String findSome();
	//4.List
	public String list();
	//5.Update
	public void update();
	//6.Delete
	public void delete();
	//Util
	//FindSomeNum
	public int someCount();
	//ListNum
	public int listCount();
}
