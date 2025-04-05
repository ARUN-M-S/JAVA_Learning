package JAVA_Learning.src.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoTwo {
static void collect2DArrayValues(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the values");
    int row = 3;
    int column = 3;
    int [][] matrix = new int[row][column];
     for(int i =0;i<row;i++){
         for(int j=0;j<column;j++){
            matrix[i][j] = scanner.nextInt();
         }
     }

     for(int[] element :matrix){
         for(int elem : element){
System.out.print(elem + " ");
         }
         System.out.println();
     }
}


static int LinearSearch(int [] arr,int key){

    for(int i=0;i<arr.length;i++){
        if(arr[i] ==key){
            if(i>0){

                int temp = arr[i];
                arr[i]= arr[i-1];
                arr[i-1]=
                temp;
                return i;
            }
            return i;
        }
    }
    return -1;

}

static int sentinaLinearSearch(int [] arr,int key){

    int n= arr.length;
    int temp = arr[n-1];
     arr[n-1]= key;
     int i=0;
    while(arr[i]!=key){
i++;
    }
    arr[i-1]= temp;
    if(arr[n-1] !=key || i<n-1 ){
        return i;
    }

    return -1;
   
}

static int biDirectional(int [] myArray, int key){
    int left =0;
    int right = myArray.length-1;

    while (left<=right) {
        if(myArray[left] ==key) return left;
        else if(myArray[right]==key) return right;
        left ++;
        right--;
        
    }
    return -1;
}


static void findMaxCount(int [] myArray){
    int maxCount=0;
    int mostRepeated=0;
    for(int i=0;i<myArray.length;i++){
        int count=0;
        for(int j=0;j<myArray.length;j++){
            if(myArray[i]==myArray[j]) count++;
            

        }
        if(count>maxCount){
maxCount=count;
         mostRepeated=myArray[i];
    }
    }
    System.out.println( "most" +mostRepeated);
}
    public static void main(String[] args) {
        // collect2DArrayValues();
        int [] myArray = {1,2,2,2,4,2,4,4,4,4,5,5,6,5,6,9,12};
        // int result = biDirectional(myArray, 6);
        // System.out.println(result);
        findMaxCount(myArray);

        System.out.println(Arrays.toString(myArray));
    }
    
}
