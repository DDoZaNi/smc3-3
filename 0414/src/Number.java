import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
		Scanner sc = new Scanner (System.in);
		int []num = new int[10];
		
		int brknum = sc.nextInt();
		
		for (int i=0; i<10; i++){
			 num[i]=(int)(Math.random()*50+1);
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
