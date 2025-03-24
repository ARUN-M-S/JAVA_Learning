package JAVA_Learning.src.Patterns;

import java.util.Scanner;

public class Patterns {
    static void leftPyramid(int rows, int columns) {

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightPyramid(int rows, int columns) {

        for (int i = 1; i <= 2 * rows - 1; i++) {
            if (i < rows) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * rows - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pyramid(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void diagoanl(int rows, int columns) {
        int n = 0;
        for (int i = 1; i <= rows * 2 - 1; i++) {
            if (i > rows) {
                n--;
                for (int j = rows; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * n - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            } else {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
                n++;
            }

        }
    }

    static void starRectangle(int n, int columns) {
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == columns || j == 1 || j == n) {
                    // System.out.print("*");
                    // }else if(j==1 ||j==n){
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void hollowTriangle(int n, int columns) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == n || j == 1 || j == i) {
                    // System.out.print("*");
                    // }else if(j==1 ||j==n){
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void butterFly(int rows) {
        int n = 1; // Controls decreasing pattern in lower half

        for (int i = 1; i <= 2 * rows - 1; i++) {
            for (int j = 1; j <= 2 * rows; j++) {
                if (j == 1 || j == 2 * rows || j <= n || j > 2 * rows - n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            // Increase `n` in the first half, decrease in the second half
            if (i < rows) {
                n++;
            } else {
                n--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows needed");
        int rows = scanner.nextInt();
        System.out.println("Enter Number of Column needed");
        int columns = scanner.nextInt();
        // hollowTriangle(rows, columns);
        // butterFly(rows);

        // ---------number Pattern 1
        // for(int i=1;i<=rows;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Number 2
        // 54321
        // 4321
        // 321
        // 21
        // 1

        // number 3
        // for(int i=1;i<=rows;i++){
        // for(int j=1;j<=rows-i;j++){
        // System.out.print( " ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print( j);
        // }
        // System.out.println();
        // }
        // Number 4
        // 1 1
        // 12 21
        // 123 321
        // 1234 4321
        // 1234554321

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2*(rows - i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {

                System.out.print(l);
            }
            System.out.println();
        }


        for(int i=1;i<=rows;i++){
            for(int k=1;k<=rows-i;k++){
                System.out.print(" ");
            }
            int n=1;
            for(int j=i;j<2*i;j++){
                
                System.out.print(j + " ");
                n++;
            }
           
            System.out.println();
        } 

        for(int i =rows;i>=1;i--){
            for(int k =i;k>1;k--){
System.out.print(" ");
            }
            for(int j=i ;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
       
        
int n=1;
        for(int i=1;i<=rows;i++){

            for(int j=1;j<=i;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        
        }


        for(int i=0;i<2*rows-1;i++){
            for(int j =0;j<2*rows-1;j++){
               System.out.print(rows-Math.min(Math.min(j,2*rows-2-j),Math.min(i,2*rows-2-i)));
            }
            System.out.println();
        }
        char lett ='A';
        for(int i=1;i<=rows;i++){
         
            for(int j=1;j<=i;j++){
                System.out.print(lett);
                

            }
            lett++;
            System.out.println();
        }
    
    }



   


}
