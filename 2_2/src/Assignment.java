import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("연도 : ");
        int year = sc.nextInt();
		
        if(year%2==0) {
            System.out.println(year+"년도는 짝수입니다.");
        }else {
            System.out.println(year+"년도는 홀수입니다.");
        }
        if(year%4==0) {
            System.out.println(year+"년도는 윤년입니다.");
        }else {
            System.out.println(year+"년도는 윤년이 아닙니다.");
        }
    }
}
