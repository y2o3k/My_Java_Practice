// ������ ������ ������ ���� �ͺ��� ������� ǥ��
import java.util.Scanner;

public class EnumScope {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("���� A:");	int a = stdIn.nextInt();
        System.out.print("���� B:");	int b = stdIn.nextInt();
        if (a>b) {		//a�� b���� ũ��
            int t = a;	//�� ���� ��ȯ
            a = b;
            b = t;
        }
		
        do {
            System.out.print(a + " ");		
            a = a + 1;
        }   while (a<=b);
        System.out.println();
    }	
}


