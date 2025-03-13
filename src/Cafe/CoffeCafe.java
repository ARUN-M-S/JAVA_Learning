import java.util.Scanner;

public class CoffeCafe {

    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("Welcome to Arun Coffe Cafe !!");
        System.out.println("****************************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Your Coffe With  Smile " + "\u263A");
        System.out.println("1. Espresso  - \u20B9200/-");
        System.out.println("2. Cappuccino - \u20B9250/-");
        System.out.println("3. Late - \u20B9300/-");

        System.out.print("Enter your choice : ");
        float total=0;
        int choice = scanner.nextInt();
      
switch(choice){
    case 1 -> total=200;
    case 2-> total=250;
    case 3-> total =300;
    default -> {System.out.println("Invalid Choice");
return; }
}
        System.out.print("Add whipped cream for ₹30? (yes=1 / no=0) : ");

        int creamChoice = scanner.nextInt();

        if (creamChoice == 1)
            total += 30;

        System.out.print("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0) : ");

        int flavorChoice = scanner.nextInt();

        if (flavorChoice == 1) {
            System.out.print("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
            flavorChoice = scanner.nextInt();
            if (flavorChoice == 1)
                total += 20;
            else if (flavorChoice == 2)
                total += 25;

        }

        System.out.println("Total Bill : " + total);

    }

}
