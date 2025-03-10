import java.util.Scanner;

public class YoutubeChannelGenarator {
    public static void main(String[] args) {
        int c=1;
        System.out.println("Enter first nmuber");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // System.out.println("Enter Second Number");
        // int b = scanner.nextInt();
      
        // System.out.println("Before Swapping First Number:" + " " + a + " " + "Second Number :" + b);
      int result = a ^ c ;
      System.out.println(result);
        if((a&(a-1)) ==0){
           System.out.println("Even");
       }else{
        System.out.println("Odd");

       }
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("After Swapping First Number:" + " " + a + " " + "Second Number :" + b);

    }
}
