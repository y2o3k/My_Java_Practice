// ������ ������ŭ * ǥ�� (���1)
import java.util.Scanner;

public class PutAsterisk1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("�� ���� *�� ǥ���ұ��?:");
        int n = stdIn.nextInt();
        if(n>0) {
            int i = 0;
            while(i<n) {
                System.out.print('*');
                i++;
            }
            System.out.println();
        }
    }
}

