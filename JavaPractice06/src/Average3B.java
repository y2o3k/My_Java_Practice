
import java.util.Scanner;

public class Average3B {
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
        System.out.println("������ x,y,z�� ����� ���մϴ�.");
        System.out.print("x�� : "); int x = scan.nextInt();
        System.out.print("y�� : "); int y = scan.nextInt();
        System.out.print("z�� : "); int z = scan.nextInt();
		
        double ave = (double)(x+y+z)/3;
        System.out.printf("x,y,z�� ����� %.3f �Դϴ�.\n", ave);
    }
}
