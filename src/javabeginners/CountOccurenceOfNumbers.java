package javabeginners;

import java.util.Scanner;

public class CountOccurenceOfNumbers {

    public static void generateArray(){
        int num;
        int sizeArray = 1;
        int[] numArray = new int[sizeArray];
        int[] placeHolder;
        int length = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value>> ");
            num = scanner.nextInt();
            if (num < 1 || num > 100){
                continue;
            }
            numArray[length] = num;
            length++;
            if (sizeArray == length){
                sizeArray++;
                placeHolder = numArray;
                numArray = new int[sizeArray];
                for (int i = 0; i < placeHolder.length; i++)
                    numArray[i] = placeHolder[i];
            }
        } while (num != 0);

        sortArray(numArray);
        displayArray(numArray);
        determineOccurrence(numArray);
    }

    public static void displayArray(int[] array) {
        for (int num : array){
            System.out.println(num);
        }
    }

    public static void sortArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1] && array[j] != 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void determineOccurrence(int[] array){
//        0, 1, 2, 3, 5, 7, 7, 10

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            int checkNum = array[i];

            if (checkNum == 0 && checkNum == array[i - 1]){
                continue;
            }

            for (int j = i + 1; j < array.length; j++) {
                if (checkNum == array[j]){
                    counter++;
                }
            }
            System.out.printf("%d occurs %d times.\n", checkNum, counter);
        }
    }

    public static void main(String[] args) {
        generateArray();
    }
}
