package JAVA_Learning.src.Scanner;

import java.util.Scanner;

public class ScannerDemo {
public static void main (String[] args){
    System.out.println("Give base of triangle ");
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    System.out.println("Give height  of triangle ");
    
    int height  = scanner.nextInt();
    double area = 0.5 * base * height;
    System.out.println("Area is : " + area);


    

}
    
}
