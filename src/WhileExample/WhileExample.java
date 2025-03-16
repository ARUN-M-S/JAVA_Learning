package JAVA_Learning.src.WhileExample;

import java.util.Scanner;

public class WhileExample {

    static int checkGcd(int num1, int num2) {
        // if (num1 > num2) {
        //     if (num1 % num2 == 0) {
        //         System.out.println("GCD is " + num2);
        //         return;
        //     } else {
        //         int highestGCD = 1;
        //         for (int i = 1; i < num2 / 2; i++) {
        //             if (num2 % i == 0 && num1 % i == 0) {
        //                 highestGCD = i;
        //             }
        //         }
        //         System.out.println("GCD is " + highestGCD);
        //     }
        // } else if (num2 > num1) {
        //     if (num2 % num1 == 0) {
        //         System.out.println("GCD is " + num1);
        //         return;
        //     } else {
        //         int highestGCD = 1;
        //         for (int i = 1; i < num1 / 2; i++) {
        //             if (num2 % i == 0 && num1 % i == 0) {
        //                 highestGCD = i;
        //             }
        //         }
        //         System.out.println("GCD is " + highestGCD);

        //     }
        // } else {
        //     System.out.println("Both are same number " + num2);
        // }
        while(num2!=0){
            int temp= num2;
            num2=num1%num2;
            num1=temp;

        }
        return num1;
    }


static void checkLcm(int num1,int num2){
    // if(num1>num2){
    //     if(num1%num2 ==0){
    //         System.out.println("LCm is " + num1);
    //     }else{
    //         int temp = num1;
    //         while (true) {
    //             num1+=temp;
    //             if(num1%num2==0){
    //                 System.out.println("LCm is " + num1);
    //                 break;
    //             }
    //         }
    //     } 
    // }else if(num2>num1) {
    //     if(num2%num1 ==0){
    //         System.out.println("LCm is " + num2);
            
    //     }else{
    //         int temp = num2;
    //         while (true) {
    //             num2+=temp;
    //             if(num2%num2==0){
    //                 System.out.println("LCm is " + num2);
    //                 break;
    //             }
    //         }
    //     }
    // }else{
    //     System.out.println("Both are same LCm is " + num2);
    // }

    int result =  (num1*num2 )/checkGcd(num1,num2);
    System.out.println(result);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();
        // checkGcd(num1, num2);
        checkLcm(num1,num2);

        // int i=2;
        // int sum =1;
        // while (i<=num/2) {
        // if(num%i==0){
        // sum+=i;
        // }
        // i++;
        // }
        // if(sum==num){
        // System.out.println("Perfect number");

        // } else{
        // System.out.println("Not Perfect number");

        // }

    }
}
