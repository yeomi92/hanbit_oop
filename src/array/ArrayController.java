package array;

import java.util.Scanner;

public class ArrayController {
	public static void main(String[] args) {
		ArrayService service = new ArrayServiceImpl();
		String[] arr = new String[5];
		arr=service.add();
		System.out.println("���� �� �ְ� ��ü ���: "+service.list());
		System.out.println("ù���ڰ� H�� �����ϴ� �ܾ ���: "+service.findOne());
		System.out.println("ù���ڰ� J�� �����ϴ� �ܾ ���: "+service.findSome());
		System.out.println("��ü ���: "+service.list());
		service.update();
		service.delete();
		System.out.println("����,���� �� ���: "+service.list());
	}
}
