// ���� ���߱� ����
import java.util.Random;
import java.util.Scanner;

public class Number2digits {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no = 10 + rand.nextInt(90); // ����� �ϴ� ����:10~99�� ���� ����
        System.out.println("���� ���߱� ���� ����!");
        System.out.println("10���� 99������ ���ڸ� ���߼���.");
        int x; //�д� ��
            do {
            System.out.println("� �����ϱ�?:");
            x = stdIn.nextInt();
			
            if(x>no)
                System.out.println("�� ���� �����Դϴ�.");
            else if (x<no)
                System.out.println("�� ū �����Դϴ�.");
            //������ �ƴϸ� �ݺ��Ѵ�.
        }    while (x != no);
        System.out.println("�����Դϴ�.");
    }
}