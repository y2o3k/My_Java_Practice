import java.util.Scanner;

public class Multiple0f10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값: "); 
		int a = stdIn.nextInt();
		
		
		if(a<0)
			System.out.println("음의 정숫값을 입력했습니다.");
		else if(a%10==0)
			System.out.println("이 값은 10의 배수입니다.");
		else
			System.out.println("이 값은 10의 배수가 아닙니다.");
		
	}

}
