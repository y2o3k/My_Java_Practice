// ���� �������� 0���� ī��Ʈ�ٿ�
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("ī��Ʈ�ٿ� �մϴ�.");
        int x;
        do {
            System.out.print("���� ������:");
            x = stdIn.nextInt();
        }   while (x<=0);
        // do �� ���� �� x�� �ݵ�� ���� ���� �ȴ�.
		
        // while��
        while (x>=0)
            System.out.println(x--);
            System.out.println("x�� ����" + x +"�� �ƽ��ϴ�.");
    }
}