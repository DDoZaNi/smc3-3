import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		int j=0;
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(i+1 +"번 입력 : ");
			arr[i] = sc.nextInt();
			max = i;
			j=i;
		}
		System.out.println("가장큰 수는 " + (j+1) + "번째  숫자인" + arr[max]);
	}

}
