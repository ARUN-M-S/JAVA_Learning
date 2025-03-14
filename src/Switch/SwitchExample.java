import java.util.Scanner;

public class SwitchExample {

 static  int fibanociNumber(int numbers) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < numbers; i++) {

            // System.out.println(num1);
            int result = num1 + num2;
            num1 = num2;
            num2 = result;

        }
        return num1;
    };
    public static void main(String[] args) {
     System.out.println("Enter the Number");
     Scanner scanner = new Scanner(System.in);
     int number = scanner.nextInt();
     fibanociNumber(number);

     int reuslt = fibanociNumber(number-1)+fibanociNumber(number-2) ;
     System.out.println(reuslt);
     

  
}

}
