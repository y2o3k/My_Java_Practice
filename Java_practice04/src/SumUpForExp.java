import java.util.Scanner;

class SumUpForExp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1���� n������ ���� ���մϴ�.");
        int n;
        do {
            System.out.print("n�� ��:");
            n = stdIn.nextInt();
        } while (n <= 0);
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;    //sum�� i�� ���Ѵ�
        }
        System.out.print(n + " = ");
        sum += n;        //sum�� n�� ���Ѵ�
        System.out.println(sum);
    }
}
