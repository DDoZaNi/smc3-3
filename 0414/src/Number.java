import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");//#1~50까지의 단어를 입력하고 10개의 숫자중 하나를 맞춤
		Scanner sc = new Scanner (System.in);//#scanner를 선언
		int []num = new int[10];//#0~9를 가진 int 배열
		
		int brknum = sc.nextInt();//#맞출 숫자 입력
		
		for (int i=0; i<10; i++){
			 num[i]=(int)(Math.random()*50+1);//#1~50의 수 랜덤으로 
			 System.out.print(num[i]+" ");	
		}
		System.out.println();
		
		for(int a=0; a<10; a++){
			if(num[a] == brknum) {
				System.out.println("당첨! 숫자가 일치합니다.");
			}
			
			
		}
	}

}
