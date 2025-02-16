package januaryclass;

import java.util.Scanner;

public class CountOccurenceOfNumbers {

    public static void generateArray(){
        int num;
        int sizeArray = 10;
        int[] numArray = new int[sizeArray];
        int length = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value>> ");
            num = scanner.nextInt();
            numArray[length] = num;
            length++;
            if (sizeArray == length){
                sizeArray *= 2;

            }
        } while (num != 0);

        for (int number : numArray){
            System.out.println(number);
        }

    }
    public static void main(String[] args) {
        generateArray();






    }
}
