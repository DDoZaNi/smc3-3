import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("[1:°¡À§ 2:¹ÙÀ§3:º¸]");
		int user = sc.nextInt();
		System.out.println("--°¡À§ ¹ÙÀ§ º¸ --");
		int com = (int)(Math.random()*3+1);
		game(user, com);
	}
	
	public static void game(int user, int com){
		switch (user){
		case 1 : 
			if(com==3){
				System.out.println("½Â¸®");
				break;
			} else if (com == 2){
				System.out.println("ÆÐ¹è");
				break;
			}else{
				System.out.println("¹«½ÂºÎ");
				break;
			}
			
		case 2 :
			if(com==1){
				System.out.println("½Â¸®");
				break;
			}else if(com==3){
				System.out.println("ÆÐ¹è");
				break;
			}else {
				System.out.println("¹«½ÂºÎ");
				break;
			}
			
		case 3 :
			if(com==2){
				System.out.println("½Â¸®");
				break;
			}else if(com==1){
				System.out.println("ÆÐ¹è");
				break;
			}else {
				System.out.println("¹«½ÂºÎ");
				break;
			}
		}
	}

}
