import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        
        char[] arr;
        arr= input.toCharArray();
        
        for(int i=0; i<arr.length; ++i){
            if(97<=arr[i] && arr[i]<=122){
                arr[i]=(char)(arr[i]-32);
                }
            }
        
            System.out.print(arr);
        }
    }


