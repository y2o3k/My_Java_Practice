import java.util.Scanner;

class PutAsterisk5A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("�� ���� *�� ǥ���ұ��?:");
        int n= stdIn.nextInt();
        if (n > 0) {
            for(int i=0; i < n; i++) {
                System.out.println('*');
                if (i % 5 == 4)
                    System.out.println();
            }
            if (n % 5 != 0)
                System.out.println();
        }
    }
}