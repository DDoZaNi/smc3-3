import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10���� ���� ���� �� �ϳ��� ���纸����(1~50����):");
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
				System.out.println("��÷! ���ڰ� ��ġ�մϴ�.");
			}
			
			
		}
	}

}
