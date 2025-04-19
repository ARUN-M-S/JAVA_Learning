package JAVA_Learning.src.ArrayDemo;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoTwo {
    static void collect2DArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values");
        int row = 3;
        int column = 3;
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int[] element : matrix) {
            for (int elem : element) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    static int LinearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (i > 0) {

                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    return i;
                }
                return i;
            }
        }
        return -1;

    }

    static int sentinaLinearSearch(int[] arr, int key) {

        int n = arr.length;
        int temp = arr[n - 1];
        arr[n - 1] = key;
        int i = 0;
        while (arr[i] != key) {
            i++;
        }
        arr[i - 1] = temp;
        if (arr[n - 1] != key || i < n - 1) {
            return i;
        }

        return -1;

    }

    static int biDirectional(int[] myArray, int key) {
        int left = 0;
        int right = myArray.length - 1;

        while (left <= right) {
            if (myArray[left] == key)
                return left;
            else if (myArray[right] == key)
                return right;
            left++;
            right--;

        }
        return -1;
    }

    static void findMaxCount(int[] myArray) {
        int maxCount = 0;
        int mostRepeated = 0;
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j])
                    count++;

            }
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = myArray[i];
            }
        }
        System.out.println("most" + mostRepeated);
    }


    static int binarySearch(int[] myArray, int key){
     int low=0;
     int high = myArray.length-1;
     boolean isAscending = false;
     if(myArray[low]<myArray[high]) isAscending=true;

     while(low<=high){
         int mid= low+(high-low)/2;
         if(myArray[mid]==key){
return mid;
         }
         else if(isAscending){
             if(myArray[mid]<key){
                 low=mid+1;
             }else{
                 high= mid-1;
             }

         }else{
            if(myArray[mid]<key){
                
                high= mid-1;
            }else{
                low=mid+1;
            }

         }
     }
   
        return -1;
    }

    static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(arr[low]!=key){
            return -1;
        }
        return low; // not mid ❗️
    }
    


    static int LowerBound(int[] myArray, int key){
        int low=0;
        int high = myArray.length-1;
        boolean isAscending = false;
        if(myArray[low]<myArray[high]) isAscending=true;
   
        while(low<=high){
            int mid= low+(high-low)/2;
//             if(myArray[mid]==key){
//    return mid;
//             }
//             else 
            if(isAscending){
                if(myArray[mid]<key){
                    low=mid+1;
                }else{
                    high= mid-1;
                }
   
            }else{
               if(myArray[mid]<key){
                   
                   high= mid-1;
               }else{
                   low=mid+1;
               }
   
            }
        }
      
           return low;
       }

//     ✅ Regular Binary Search	✔️
// ✅ Lower Bound	✔️
// ✅ Upper Bound	✔️
// ✅ First/Last Occurrence	✔️
// ✅ Count of Occurrence	✔️
// ✅ Binary Search in Descending Array	✔️
// ✅ Order-Agnostic Search (Asc or Desc)	✔️
// ✅ Search in Rotated Sorted Array	🔥
// ✅ Find Peak Element (Binary approach)	🔥
// ✅ Binary Search on Answer	🔥🔥


static int[] findUpperAndLowerBound(int [] arr,int target){
    int low=0; int high = arr.length-1; int[] result = new int[] {-1,-1};

    while(low<=high){
        int mid= low+(high- low)/2;
        if(arr[mid]<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    if(low >=arr.length || arr[low]!= target){
        return result;
    }
    result[0]= low;
    high =  arr.length-1; int newLow= low;
    while(low<=high){
        int mid= low+(high- low)/2;
        if(arr[mid]<=target){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }
    result[1] = low-1;

    return result;


}


static int totalAppearence(int [] arr, int target){
    int low=0; int high = arr.length-1; int[] result = new int[] {-1,-1};
    while(low<=high){
        int mid= low+(high- low)/2;
        if(arr[mid]<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    if(low >=arr.length || arr[low]!= target){
        return 0;
    }
    result[0]= low;
    high =  arr.length-1; int newLow= low;
    while(newLow<=high){
        int mid= newLow+(high- newLow)/2;
        if(arr[mid]<=target){
            newLow = mid+1;
        }else{
            high = mid-1;
        }
    }
    result[1] = newLow;

    return result[1] - result[0];

}
   

static int[] findFloorAndCeil(int [] arr,int target){

    int low =0;
    int high = arr.length -1;
    int[] result = new int [] {-1,-1};

    while(low<=high){
        int mid= low+(high- low)/2;
        if(arr[mid]<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    if(low >=arr.length || arr[low]!= target){
        return result;
    }
    result[0]= arr[low];
    high =  arr.length-1; int newLow= low;
    while(newLow<=high){
        int mid= newLow+(high- newLow)/2;
        if(arr[mid]<=target){
            newLow = mid+1;
        }else{
            high = mid-1;
        }
    }
    result[1] = arr[newLow-1];

    return result;

}



static void rotateArray(int[] arr,int start,int end){

    // int start =0;int end = arr.length-1;

    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        start++;
        end--;
    }

   
    System.out.println(Arrays.toString(arr));
}

static int indexOfRotatedSortedArray(int [] arr, int key){
    int low=0; int high = arr.length-1;
    while(low<=high){
        int mid = low+ (high-low)/2;
        if(arr[mid] ==key){
            return mid;
        }
         if(arr[low] <= arr[mid] ){
             if(arr[mid] >=key && arr[low]<=key){
                high=mid-1;
             }else{
                 low=mid+1;
             }
           
        }else{
            if(arr[mid] <=key && arr[high]>=key ){

            
            low= mid+1;
            }else{
                high=mid-1;
            }
        }
    }
    return -1;
}

static int searchRotatedArray(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;

    int i = 0;
while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
    i++;
}
boolean isAscending = (i < arr.length - 1) && (arr[i] < arr[i + 1]);

   

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if(isAscending){
        if (arr[mid] == key)
            return mid;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else {
            if (key >= arr[mid] && key <= arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    } else{

        if (arr[mid] == key)
        return mid;

        if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
            low++;
            high--;
            continue;
        }
    if (arr[mid] <= arr[low]) {
        if (key >= arr[mid] && key <= arr[low]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    } else {
        if (key >= arr[high] && key <= arr[low]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    }

    }

    return -1;
}

static int binarySearch1(int [] arr,int key){
    int low = 0; int high = arr.length-1;

    while(low<=high){
        int mid= low + (high-low)/2;

        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            low= mid+1;
        }else{
            high = mid-1;
        }
    }


    return -1;
}

static int lowerBound(int [] arr , int key){
    int low =0; int high = arr.length-1;


    while(low<=high){
        int mid= low+(high-low)/2;
if(arr[mid]<key){
    low=mid+1;
}else{
    high= mid-1;
}



    }

    return low;
}


static int upperBound1(int [] arr,int key){
    int low= 0; int high = arr.length-1;

    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]<=key){
            low=mid+1;

        }else{
            high= mid-1;
        }
    }
    return low;
}

static int[] firstAndLastPos(int [] arr,int key){
    int low=0; int high= arr.length-1;
    int[] result = new int [] {-1,-1}; 


    while(low<=high){
        int mid = low+(high-low)/2;

        if(arr[mid]<key){
            low=mid+1;
        }else{
            high= mid-1;
        }

    }

    if(low>=arr.length || arr[low]!=key){
        return result;
    }

    result[0]=low;

    int newLow = low;
    high= arr.length-1;

    while(newLow<=high){
        int mid = newLow+(high-newLow)/2;

        if(arr[mid]<=key){
            newLow=mid+1;
        }else{
            high= mid-1;
        }

    }
    result[1]=newLow-1;

    return result;
}


static int findOccurrences(int [] arr, int key){
    int low= 0; int high = arr.length-1;

    int first = -1; int last = -1;


    while(low<=high){
        int mid= low+(high-low)/2;
        if(arr[mid]<key){
            low= mid+1;
        }else{
            high=mid-1;
        }
    }

    if(low>=arr.length || arr[low] !=key){
        return -1;
    }

    first = low;
    int newLow = low;
    high = arr.length-1;

    while(newLow<=high){
        int mid= newLow+(high-newLow)/2;
        if(arr[mid
        ]<=key){
            newLow= mid+1;
        }else{
            high=mid-1;
        }
    }

   last= newLow;

   return last-first;
}


static int[] findIndexInMatrix(int [][] arr, int target){

    int row= arr.length;
    int column = arr[0].length;

    int i=0; int j= column-1;

    for(int k=0;k<row;k++){
        for(int f= 0;f<column;f++){
            if(arr[k][f] == target)  return new int[]{k,f};
        }
    }

    // while(i<=row && j>=0){
    //     if( target < arr[i][j])
    // }

    return new int[]{-1,-1};
}


static int[] findIndexInMatrixRow(int [][] arr, int target){

    int row= arr.length;
    int column = arr[0].length;

    int i=0; int j= column-1;



    while(i<=row && j>=0){
        if( target <= arr[i][j]  && target >=arr[i][0]){
            int result = binarySearch(arr[i], target);
            System.out.println(result);

        }else{
            i++;
        }
    }

    return new int[]{-1,-1};
}
public static void main(String[] args) {
        // collect2DArrayValues();
        int[] myArray = { 1, 2, 2, 2, 4, 2, 4, 4, 4, 4, 5, 5, 6, 5, 6, 9, 12 };
        int[] binaryArray = { 1,2,2,2,4,5,6,7,10,22,23,24,26,33,45,88,99,102 };
        int [] ex= {2, 4, 4, 4, 8, 10};
        int [] arr = {1,2,3,4,5};
        int [] arr1 = {6,7,8,1,2,3,4,5};
        int [] myARr= {1,0,1,1,1};
        int[][] unSortedMatrix = {{1,3,4,5},{6,5,2,3},{0,7,2,4}};
        int[][] SortedMatrixRow = {{1,3,4,5},{6,8,10,23},{26,27,28,29}};



        int k =2;
        int n= arr.length-1;
        // rotateArray(arr,0,n);
        // rotateArray(arr,0,k-1);
        // rotateArray(arr,k,n);
// int y = findOccurrences(binaryArray,2);
        int y=searchRotatedArray(myARr,0);
        int[] matrixResult= findIndexInMatrixRow(SortedMatrixRow,8);
        System.out.println(Arrays.toString(matrixResult));



        // int result = biDirectional(myArray, 6);
        // System.out.println(result);
        // findMaxCount(myArray);
    //   int[] result=  findUpperAndLowerBound(ex,3);
    //   int result = totalAppearence(ex,4);
    // rotateArray(arr,2
    // );
    //   System.out.println( result);

        // System.out.println(Arrays.toString(ex));
    }





   

}
