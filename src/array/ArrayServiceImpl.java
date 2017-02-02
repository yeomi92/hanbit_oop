package array;

public class ArrayServiceImpl implements ArrayService{
	private int listCount;
	private String[] arr;
	public ArrayServiceImpl() {
		listCount=5;
		arr= new String[listCount];	
	}
	@Override
	public String[] add() {
		arr[0]="Java";
		arr[1]="Jsp";
		arr[2]="Spring";
		arr[3]="JS";
		arr[4]="HTML";
		return arr;
	}

	@Override
	public String findOne() {
		String result="";
		for(int i=0;i<arr.length;i++){
			if('H'==arr[i].charAt(0)){
				result=arr[i];
				break;
			}
		}
		return result;
	}

	@Override
	public String findSome() {
		String result="";
		for(int i=0;i<arr.length;i++){
			if('J'==arr[i].charAt(0)){
				result+=arr[i]+" ";
			}			
		}
		return result;
	}

	@Override
	public String list() {
		String result="";
		for(int i=0;i<listCount();i++){
			result+=arr[i]+" ";
		}
		return result;
	}

	@Override
	public void update() {
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]="JavaScript";
				break;
			}
		}
	}

	@Override
	public void delete() {
		for(int i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				listCount--;
				break;
			}
		}
	}

	@Override
	public int someCount() {
		return 0;
	}

	@Override
	public int listCount() {
		return listCount;
	}

}
