import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수:");
		int a = stdIn.nextInt();
		
		
		if (a>=0 && a<=59) {
			System.out.println("퇴학");
			
		} else if (a>=0 && a<=59){
			System.out.println("가");
			
		} else if (a>=60 && a<=69) {
			System.out.println("양");
			
		} else if (a>=70 && a<=79) {
			System.out.println("미");
			
		} else if (a>=80 && a<=89) {
			System.out.println("우");
			
		} else if (a>=90 && a<=100) {
			System.out.println("수");
		}
		 else {
			System.out.println("잘못된 점수입니다.");
		}
		
	}

}
