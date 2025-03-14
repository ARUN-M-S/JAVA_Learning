package JAVA_Learning.src.WhileExample;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
int i=2;
int sum =1;
        while (i<=num/2) {
            if(num%i==0){
             sum+=i;
            }           
            i++;
        }
        if(sum==num){
            System.out.println("Perfect number");
          
           
        } else{
            System.out.println("Not Perfect number");
               
        }
       
    }
}
