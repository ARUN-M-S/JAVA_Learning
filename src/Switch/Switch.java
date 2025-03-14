import java.util.Scanner;

public class Switch {

 
    public static void main(String[] args) {
     System.out.println("Enter the Number");
     Scanner scanner = new Scanner(System.in);
     int number = scanner.nextInt();
     int total=0;
//   for(int i=1;i<=10;i++){
//       int result = i*number;
//      System.out.println(i + " " + "X" +" " + number + " "+ "=" + " " +result);
//   }
// System.out.println(Math.floor(number/2,"hussj")
if(number<=1){
    System.out.println("Not a prime");
    return;
}
int temp = number;
int reversedNumber=0;
for(; number!=0;number/=10  ){
    System.out.println(number%10+ "mode");
    reversedNumber= (reversedNumber*10) + (number%10);
    System.out.println(reversedNumber);

    System.out.println(number+ "Number");

}
if(reversedNumber==temp){
    System.out.println("Palindrome");
}else{
    System.out.println("Not a apalindrome");
}
   
    }
}
