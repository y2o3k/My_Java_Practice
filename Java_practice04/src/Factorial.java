import java.util.Scanner;

class Factorial {
	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);
	        int n;
	        do {
	            System.out.print("���� ������:");
	            n= stdIn.nextInt();
	        } while (n<=0);
			
	        int factorial = 1;
	        int i = 1;
	        
			
	        while (i<= n) {
	            factorial *= i;  //factorial�� i ���ϱ�
	            i++;             //i ����
	        }
	        System.out.println("1���� " + n + "������ ���� "+ factorial + "�Դϴ�." );
	    }
	}

