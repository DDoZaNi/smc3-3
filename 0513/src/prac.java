import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int arr[] = new int[5];   // arr[0]~arr[4]
				int max = 0;
				int j=0;
				for(int i=0; i<arr.length; i++) {   // �迭�� �� �Է�
					System.out.println((i+1)+"�� �Է�:");
					arr[i] = scan.nextInt();
				}
				for(int i=0; i<arr.length; i++) {  // �� ��
					if(max < arr[i]) {
						max = arr[i]; 
						j = i+1;
					}
				}
				System.out.println("���� ū ���� " + j +"��° ������ " + max);
	}

}



//commit�׽�Ʈ
