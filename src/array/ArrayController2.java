package array;

import java.util.Scanner;

public class ArrayController2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java","Jsp","Spring","JS","HTML"};
		int i=0;
		String result="";
		//�˻�(1)..ù���ڰ� H�� �����ϴ� �ܾ ���
		for(i=0;i<arr.length;i++){
			if('H'==arr[i].charAt(0)){
				result=arr[i];
				break;
			}
		}
		System.out.println("ù���ڰ� H�� �����ϴ� �ܾ ���: "+result);
		//�˻�(some)...ù���ڰ� J�� �����ϴ� �ܾ ���
		result="";
		for(i=0;i<arr.length;i++){
			if('J'==arr[i].charAt(0)){
				result+=arr[i]+" ";
			}			
		}
		System.out.println("ù���ڰ� J�� �����ϴ� �ܾ ���: "+result);
		//��ü ���
		result="";
		for(i=0;i<arr.length;i++){
				result+=arr[i]+" ";
		}
		System.out.println("��ü ���: "+result);
		//����(JS�� JavaScript�� ����) //�� �˰����� �ϼ��Ǹ� �迭 arr�� ����Ʈ�ϱ�
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
		System.out.println("���� �� ��ü ���: "+result);
		//����(Spring�� ����)
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
		System.out.println("���� �� ��ü ���: "+result);
	}
}
