import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("[1:���� 2:����3:��]");
		int user = sc.nextInt();
		System.out.println("--���� ���� �� --");
		int com = (int)(Math.random()*3+1);
		game(user, com);
	}
	
	public static void game(int user, int com){
		switch (user){
		case 1 : 
			if(com==3){
				System.out.println("�¸�");
				break;
			} else if (com == 2){
				System.out.println("�й�");
				break;
			}else{
				System.out.println("���º�");
				break;
			}
			
		case 2 :
			if(com==1){
				System.out.println("�¸�");
				break;
			}else if(com==3){
				System.out.println("�й�");
				break;
			}else {
				System.out.println("���º�");
				break;
			}
			
		case 3 :
			if(com==2){
				System.out.println("�¸�");
				break;
			}else if(com==1){
				System.out.println("�й�");
				break;
			}else {
				System.out.println("���º�");
				break;
			}
		}
	}

}
