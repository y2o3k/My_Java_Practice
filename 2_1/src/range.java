
public class range {
	//문자와 정수의 데이터 범위를 증명할 수 있는 프로그램 작성
    public static void main(String[] args) {

        System.out.println("Byte의 범위");
        System.out.println("최대값: " + Byte.MAX_VALUE); 
        System.out.println("최소값: " + Byte.MIN_VALUE);
		
        System.out.println();
		
        System.out.println("Short의 범위");
        System.out.println("최대값: " + Short.MAX_VALUE); 
        System.out.println("최소값: " + Short.MIN_VALUE); 
		
        System.out.println();

        System.out.println("Char의 범위");
        System.out.println("최대값: " + (int)Character.MAX_VALUE); 
        System.out.println("최소값: " + (int)Character.MIN_VALUE);
		
        System.out.println();
		
        System.out.println("Integer의 범위");
        System.out.println("최대값: " + Integer.MAX_VALUE); 
        System.out.println("최소값: " + Integer.MIN_VALUE); 
		
        System.out.println();
		
        System.out.println("Long의 범위");
        System.out.println("최대값: " + Long.MAX_VALUE); 
        System.out.println("최소값: " + Long.MIN_VALUE);  
    }
}

