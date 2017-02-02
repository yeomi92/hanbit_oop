package array;

import java.util.Scanner;

public class ArrayController {
	public static void main(String[] args) {
		ArrayService service = new ArrayServiceImpl();
		String[] arr = new String[5];
		arr=service.add();
		System.out.println("최초 값 넣고 전체 출력: "+service.list());
		System.out.println("첫글자가 H로 시작하는 단어를 출력: "+service.findOne());
		System.out.println("첫글자가 J로 시작하는 단어를 출력: "+service.findSome());
		System.out.println("전체 출력: "+service.list());
		service.update();
		service.delete();
		System.out.println("수정,삭제 후 출력: "+service.list());
	}
}
