import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Grade me = new Grade();
		
		System.out.println("����, ����, ���� ������  3���� ���� �Է�>>");
		
		me.math =sc.nextInt();
		me.sience = sc.nextInt();
		me.english = sc.nextInt();
		
		me.average();


	}
	
}

class Grade{
	
	int math,  sience, english = 0;


public void average(){
	System.out.println("����� : " + (math + sience + english)/3 );
	}
}