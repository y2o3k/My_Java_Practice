import java.util.Scanner;

class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("�� ���� *�� ǥ���ұ��?:");
        int n= stdIn.nextInt();
        if (n > 0) {
            for(int i=0; i < n; i++)
                System.out.print('*');
            System.out.println();
        }
    }
}