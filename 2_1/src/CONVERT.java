
public class CONVERT {

	public static void main(String[] args) {
	//1//
	int intValue1 = 70;
	char charValue = (char)intValue1; 
	  System.out.println(charValue); //값 F
	
	//2//
	double doubleValue = 3.14;
	int intValue3 = (int)doubleValue;
	  System.out.println(intValue3); //값3
	
	//3//
	int num1 =1234567890;
	int num2 =1234567890;
	
	float num3 = num2;
	num2 = (int)num3;
	
	int result = num1-num2;
	  System.out.println(result); //값 -46
	
	//4//
	long longValue = 10000000000L;
    int intValue4 = (int) longValue;
      System.out.println("long: " +longValue); //값 10000000000
      System.out.println("int: " + intValue4); //값 1410065408
} 
}