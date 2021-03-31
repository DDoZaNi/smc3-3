import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Grade me = new Grade();
		
		System.out.println("수학, 과학, 영어 순으로  3개의 점수 입력>>");
		
		me.math =sc.nextInt();
		me.sience = sc.nextInt();
		me.english = sc.nextInt();
		
		me.average();


	}
	
}

class Grade{
	
	int math,  sience, english = 0;


public void average(){
	System.out.println("평균은 : " + (math + sience + english)/3 );
	}
}