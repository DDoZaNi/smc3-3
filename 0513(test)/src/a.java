import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~500������ �ڿ����� �ƹ��ų� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++){
			if(i%3==0){
				if(i%7==0){
					sum += i;
					System.out.println(i);
				}
			}
		}
		System.out.println("500������ �ڿ����� 3�� 7�� ������� ���� " + sum + "�Դϴ�.");
	}

}
