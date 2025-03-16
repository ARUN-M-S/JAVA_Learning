import java.util.Scanner;

public class NumberGussing {

    static int createArandom() {
        double num = Math.random() * 101;
        int result = (int) num;
        return result;

    }

    static int chancesPending(int num) {
        return num - 1;
    }

    static void game() {
        int randomSelect = createArandom();

        System.out.println("*********************************");
        System.out.println("      Hi Champion Welcome        ");
        System.out.println("*********************************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Remeber: You have 3 chances to Find the Gussed number.");
        int guess;
        int chances=3;
        boolean notFinded = true;
while (chances>0) {
    System.out.println("Please Enter the Number in range of 1-100");
    guess = scanner.nextInt();
    if (guess > 100 || guess < 1) {

        System.out.println("invalid Choice !!!!");
        continue;
    }

    if(guess<randomSelect){
        chances--;
        System.out.println("Ohh Sorry Too Low Try again, You have " + chances + "  Chances");
    }else if(guess>randomSelect){
        chances--;
        System.out.println("Ohh Sorry Too High Try again, You have " + chances + "  Chances");
    }else{
        notFinded=false;
        System.out.println("You Founded Champion");
        return;
    }

}


        
       
 System.out.println("No More Chances , Real Number is " + randomSelect);
 return;
    }

    public static void main(String[] args) {
        game();
    }

}
