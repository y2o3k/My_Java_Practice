import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값: "); 
		int a = stdIn.nextInt();
		
		if(a%5==0)
			System.out.println("이 값은 5로 나누어집니다.");
		
		else
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		
	}

}
