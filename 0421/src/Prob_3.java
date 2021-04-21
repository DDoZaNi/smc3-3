import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		Grade me = new Grade();
		me.math=scan.nextInt();
		me.science=scan.nextInt();
		me.english=scan.nextInt();
		
		me.average();
	}
}
class Grade{
	int math;
	int science;
	int english;
	public void average() {
		System.out.println("평균은 " + (math+science+english)/3);
		
	}
}