//절댓값, 제곱근, 원의 넓이 구하기
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class MathMethods {


   public static void main(String[] args) {
    Scanner stdIn = new Scanner(in);
    out.print("실 수:");
    double x = stdIn.nextDouble();
    
    out.println("절댓값:" + abs(x));
    out.println("제곱근:" + sqrt(x));
    out.println("절댓값:" + PI*x*x);
    

   }
}