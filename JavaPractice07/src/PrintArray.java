// �迭�� ��� ��ҿ� ���� �о �ʱⰪ �������� ǥ��

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("��� ��:");
        int n = stdIn.nextInt();    // ��� �� �Է�
        int[] a = new int[n];      // �迭 ����
        
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = stdIn.nextInt();
        }
        
        System.out.print("a = {");
        if (n >= 2)
            for (int i = 0; i < n-1; i++)   //  �տ������� n-1�� ��� ǥ��
                System.out.print(a[i] + ",");
        if (n >= 1)
            System.out.print(a[n-1]);   // ������ ��� ǥ��
        System.out.print("}");
    }
}