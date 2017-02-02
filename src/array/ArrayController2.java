package array;

import java.util.Scanner;

public class ArrayController2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java","Jsp","Spring","JS","HTML"};
		int i=0;
		String result="";
		//검색(1)..첫글자가 H로 시작하는 단어를 출력
		for(i=0;i<arr.length;i++){
			if('H'==arr[i].charAt(0)){
				result=arr[i];
				break;
			}
		}
		System.out.println("첫글자가 H로 시작하는 단어를 출력: "+result);
		//검색(some)...첫글자가 J로 시작하는 단어를 출력
		result="";
		for(i=0;i<arr.length;i++){
			if('J'==arr[i].charAt(0)){
				result+=arr[i]+" ";
			}			
		}
		System.out.println("첫글자가 J로 시작하는 단어를 출력: "+result);
		//전체 출력
		result="";
		for(i=0;i<arr.length;i++){
				result+=arr[i]+" ";
		}
		System.out.println("전체 출력: "+result);
		//수정(JS를 JavaScript로 변경) //매 알고리즘이 완성되면 배열 arr를 프린트하기
		for(i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]="JavaScript";
				break;
			}
		}
		result="";
		for(i=0;i<arr.length;i++){
				result+=arr[i]+" ";
		}
		System.out.println("수정 후 전체 출력: "+result);
		//삭제(Spring를 삭제)
		for(i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				break;
			}
		}
		result="";
		for(i=0;i<arr.length-1;i++){
				result+=arr[i]+" ";
		}
		System.out.println("삭제 후 전체 출력: "+result);
	}
}
