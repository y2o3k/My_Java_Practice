//���� �������� 0���� ī��Ʈ�ٿ�(�߸��� ����)
import java.util.Scanner;

public class CountDownPre {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("ī��Ʈ�ٿ� �մϴ�.");
        int x;
        do {
            System.out.print("���� ������:");
            x = stdIn.nextInt();
        }   while (x<=0);
		
        while (x>=0)
            System.out.println(--x); // x���� ǥ���� �� ���ҽ�Ŵ	
        System.out.println("x�� ����" + x + "�� �ƽ��ϴ�"); // x�� ǥ��
    }
}