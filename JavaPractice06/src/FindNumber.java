import java.util.Random;
import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
	//	������ ���� 0~99�� ����
Random rand = new Random();
Scanner stdIn = new Scanner(System.in);
	
final int MAX_NO = 6;//�÷��̾ �Է��Ҽ��ִ� Ƚ���� ���� 
int leftNo = MAX_NO;
int no = rand.nextInt(100);		//if ���� Ƚ�� ���� ������ ���� ��� 

System.out.println("���� ���߱� ���� ����!");		//������ ǥ�� & ������ ���� 
System.out.println("0���� 99������ ���ڸ� ���߼���.");
		
int x;  //�÷��̾ �Է��� �� 
do {
	System.out.println("���� Ƚ��" + (leftNo--)+"ȸ, � �����ϱ�?:");
	x = stdIn.nextInt();
	
	if(x>no)
		System.out.println("�� ���� �����Դϴ�.");
	else if (x<no)
		System.out.println("�� ū �����Դϴ�.");
}while(x !=no && leftNo>0);

if(x==no)
	System.out.println((MAX_NO - leftNo)+ "ȸ���� ������ϴ�.");
else
	System.out.println("�ƽ��׿�. ������" +no + "�Դϴ�.") ;
}
}
		

	
