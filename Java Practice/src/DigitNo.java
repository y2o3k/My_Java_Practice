// ���� �������� �о� �ڸ����� ǥ���Ѵ�
import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("���� �������� �ڸ����� ǥ���մϴ�.");
        int x;
        do {
            System.out.print("���� ������:");
            x = stdIn.nextInt();
        }   while (x<=0);
		
        int digit = 0; // �ڸ���
        while (x>0) {
            digit++;   // �ڸ����� ����
            x /= 10;   // x�� 10���� ����
        }
        System.out.println("�Է��� ���ڴ�" + digit + "�ڸ��Դϴ�.");
    }
}