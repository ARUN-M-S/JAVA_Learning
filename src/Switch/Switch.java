import java.util.Scanner;

public class Switch {

 
    public static void main(String[] args) {
     System.out.println("Enter the Number");
     Scanner scanner = new Scanner(System.in);
     int number = scanner.nextInt();
     int total=1;
  for(int i=1;i<=10;i++){
      int result = i*number;
     System.out.println(i + " " + "X" +" " + number + " "+ "=" + " " +result);
  }
    
    }
}
