package hashSet;
import java.util.*;

import sun.security.util.Length;
public class HashSetController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java","Jsp","Spring","JS","HTML"};
		HashSet<String> set1= new HashSet<String>();
		for(String i : arr){
			set1.add(i);
		}
		System.out.println("set1 : "+set1.toString());
		System.out.print("arr : ");
		for(String i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("삭제를 원하는 값을 입력하세요..");
		String del = s.next();                                                                                                                                             
		String result="";
		for(int i=0;i<arr.length;i++){
			if(del.equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				result="삭제됬습니다.";
				break;
			}else{
				result="입력하신 값은 없습니다.";
			}
		}
		System.out.println(result);
		for(String i : arr){
			if(i!=null){
				System.out.print(i+" ");
			}
		}
		/*if(set1.contains(del)){
			set1.remove(del);
		}else{
			System.out.println("입력하신 값은 없습니다.");
		}*/
		
	}
}
