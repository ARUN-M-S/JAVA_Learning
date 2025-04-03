package JAVA_Learning.src.ArrayDemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // Students[] students = new Students[3];
        // students[0]=new Students();
        // System.out.println(students[0]);
        int[] arr = new int[50];
        int size = 5;
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        // insertIntheBegining(arr,size);
        // deleteIntheBegining(arr,size);
        insertInthePosition(arr,size,3,300);

    }

    static void insertIntheBegining(int[] arr, int size) {

        try {
            
       
        for (int i = size; i >0; i--) {
            arr[i ] = arr[i-1];
        }
        arr[0] = 1;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    } catch ( ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        System.out.println(e);
    }
    }
    static void insertInthePosition(int[] arr, int size,int position,int value) {
        for (int i = size ; i >= position; i--) {
            arr[i ] = arr[i-1];
        }
        arr[position-1] = value;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    static void deleteIntheBegining(int[] arr, int size) {
        for (int i = 0; i <size; i++) {
            arr[i ] = arr[i+1];
        }
        // arr[0] = 1;
        size--;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }



    // static void delete from S
}

class Students {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name  " + name + " ROll No " + rollNo);
    }

}