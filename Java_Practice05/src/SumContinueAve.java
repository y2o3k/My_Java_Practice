import java.util.Scanner;

class SumContinueAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��?: ");
		
		int n = stdIn.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		
		for (i=0; i<n; i++) {
			System.out.print("����: ");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				continue;				
			}
			
			sum += t;
			count++;
			
		}
		
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		if (i != 0)
			System.out.println("����� " + sum / count + "�Դϴ�.");

	}

}