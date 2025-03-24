import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
// System.out.println("Enter number of rows for first matrix");

// Scanner scanner = new Scanner(System.in);
// int rows1= scanner.nextInt();
// System.out.println("Enter number of columns for first matrix");
// int colums1= scanner.nextInt();


// System.out.println("Enter number of rows for Second matrix");

// // Scanner scanner = new Scanner(System.in);
// int rows2= scanner.nextInt();
// int colums2;
// do {
//     System.out.println("Enter number of columns for Second matrix should be same and rows of first");
//      colums2= scanner.nextInt();
// } while (rows1!=colums2);




// int[][] nums1= new int[rows1][colums1];
// int[][] nums2= new int[rows2][colums2];
// System.out.println("Enter the Elements for first mattrix");

// for(int i=0;i<rows1;i++){
//     for(int j=0;j<colums1;j++){
//     nums1[i][j]=scanner.nextInt();
//     }
// }
// System.out.println("first mattrix");
// for(int [] arr:nums1 ){
//     for(int num:arr){
//         System.out.print(num + " ");
//     //    sum=  num>sum ? num: sum;
//     }
// System.out.println();
// }

// System.out.println("Enter the Elements for Second mattrix");

// for(int i=0;i<rows2;i++){
//     for(int j=0;j<colums2;j++){
//     nums2[i][j]=scanner.nextInt();
//     }
// }

// System.out.println("Second mattrix");
// for(int [] arr:nums2 ){
//     for(int num:arr){
//         System.out.print(num + " ");
//     //    sum=  num>sum ? num: sum;
//     }
// System.out.println();
// }

// // // num = {1,2,3,4,5,6};

// // // Scanner scanner = new Scanner(System.in);
// // // for(int i=0;i<num.length;i++){
// // //     num[i]= scanner.nextInt();
// // // }
// // int sum=0;
// // for(int [] arr:nums1 ){
// //     for(int num:arr){
// //         System.out.print(num + " ");
// //        sum=  num>sum ? num: sum;
// //     }
// // System.out.println();
// // }
// System.out.println("after transpose");
// // System.out.println("Sum of numbers in 2d array is " + sum);
// // System.out.println("Largest " + sum);
// // for(int [] arr:nums ){
// //     for(int num:arr){
// //         System.out.print(num + " ");
// //        sum=  num>sum ? num: sum;
// //     }
// // System.out.println();
// // }
// // for(int i=0;i<colums;i++){
// //     for(int j=0;j<rows; j++){
// //         // System.out.println("j :" + j + " i:"+ i);
// //         System.out.print(nums[j][i]);
// //     }
// //     System.out.println();
// // }

// for(int i=0;i<rows1;i++){
   
//     for(int j=0;j<colums2;j++){
//         int sum=0;
//         for(int k=0;k<rows2;k++){
// sum = sum + nums1[i][k] * nums2[k][j];
//         }
//         System.out.print(sum+ " ");
//     }
//     System.out.println();
// }


//     }
int [][] jaggedArray ={{1,2},{1,2,3,4},{1,2,3,4,5,6,}};
int [] numsArray ={1,2,3,4};
System.out.println(Arrays.toString(numsArray));

// displayArray(jaggedArray);

    }

    static void displayArray(int [][] myArray){
       for(int i=0;i<myArray.length;i++){
           int sum=0;
           for(int j=0;j<myArray[i].length;j++){
               sum =sum+myArray[i][j];
           }
           System.out.println("Rows 1 Sum : " + sum);
        //    System.out.println("The row " + (i+1) +" having : "+ count + " counts");
       }
    }
}
