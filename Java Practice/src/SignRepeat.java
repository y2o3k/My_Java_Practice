import java.util.Scanner;

public class SignRepeat {
	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);
	        int retry; // �ٽ� �ѹ�?
			
	        do {
	            System.out.println("������:");
	            int n = stdIn.nextInt();
				
	            if (n>0)
	                System.out.println("�� ���� ��� �Դϴ�.");
	            else if (n<0)
	                System.out.println("�� ���� ���� �Դϴ�.");
	            else
	                System.out.println("�� ���� 0�Դϴ�.");
				
	            System.out.println("�ٽ� �ѹ�? 1-yes / 0-No");
	            retry = stdIn.nextInt();
	        }   while (retry==1);
	    }
	}
}
