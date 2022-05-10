import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:"); 
		int a = stdIn.nextInt();
		
		
		if(a>0)
			System.out.print("값이 양수입니다.");
		else if (a==0)
			System.out.print("값이 " + a + "입니다.");
		else
			System.out.print("값이 음수입니다.");
	}

}
