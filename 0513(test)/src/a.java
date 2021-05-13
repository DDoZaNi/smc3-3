import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~500이하의 자연수를 아무거나 입력하시오.");
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
		System.out.println("500이하의 자연수중 3과 7의 공배수의 합은 " + sum + "입니다.");
	}

}
