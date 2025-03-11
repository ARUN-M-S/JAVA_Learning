import java.util.Scanner;

public class YoutubeChannelGenarator {
    public static void main(String[] args) {

        System.out.println("Enter first nmuber");
        int result;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter Second Number nmuber");

        int b = scanner.nextInt();
        System.out.println("What you want to do with this select any one operator , + ,-, /, *");
        char opera = scanner.next().charAt(0);
        System.out.println(opera);
        if (opera == '+') {
            System.out.println("Sum of give number  : " + (a + b));

        } else if (opera == '-') {
            result = a - b;
            System.out.println("Substraction of give number  : " + result);
        } else if (opera == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Division of given numbers: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } else if (opera == '*') {
            result = a * b;

            System.out.println("Multiplication of give number  : " + result);

        } else {
            System.out.println("Please select a valid opearant");

        }

    }
}
