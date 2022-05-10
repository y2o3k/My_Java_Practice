import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값: "); 
		int n = stdIn.nextInt(); 
		
		
		
		if(n >= 0)
			
		System.out.print("절댓값: " +n); 
		else
			System.out.print("절댓값: " +  -n);
		
	
	}

}
