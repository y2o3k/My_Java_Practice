import java.util.Scanner;

class CountUp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("ī��Ʈ�� �մϴ�.");
        int x;
        do {
            System.out.println("���� ������:");
            x = stdIn.nextInt();
        } while (x <= 0);
		
        for (int i = 0 ; i <= x ; i++)
            System.out.println(i);     // i �� ǥ��
    }
}
