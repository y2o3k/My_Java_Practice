import java.util.Scanner;

class HeightWeight {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("�� cm����:");
        int hMin = stdIn.nextInt();
        System.out.print("�� cm����:");
        int hMax = stdIn.nextInt();
        System.out.print("�� cm ����:");
        int step = stdIn.nextInt();
        System.out.println("���� ǥ�� ü��");
        System.out.println("--------");
		
        for (int i = hMin; i<= hMax; i+=step)
            System.out.println(i + " " + 0.9 * (i- 100));
    }
}