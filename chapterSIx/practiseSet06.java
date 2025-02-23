package arrayshere;

import java.util.Arrays;
import java.util.Scanner;

public class practiseSet06 {
    public static void main(String[] args) {
        //Question 1 create an array using user input of 5 floats and calculate their sum and average
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks of 5 subject" );
        int n = scanner.nextInt();
        float [] marks = new float[5];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of subject " + (i + 1));
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        System.out.println("The sum of marks is: " + sum);
        System.out.println("Average marks is: " + sum / marks.length);
        scanner.close();
        */

        /*
        int [] digits = new int[5];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < digits.length; i++) {
            digits[i] = input.nextInt();
        }
        System.out.println("your digits are: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Index "  + i  + "\u2192 "  + digits[i]);
        }
         */

        // Question 2 write a program to find out whether a given integer is present in array or not
        /*
        float [] marks = {87.5f,68.5f,67.5f,66.5f,65.5f,70.5f};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        float mark = input.nextFloat();

        boolean isInArray = false;
        for (float element: marks) {
            if (element == mark) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The value is in array");
        }
        else {
            System.out.println("The value is not in array");
        }
        */

        // Question 4 Create a program to reverse an array
                        // doubt why this not print index value of 1
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in array: ");
        int n = in.nextInt();
        int[] arr = new int[5];
        for (int i = arr.length-1; i >= 0; i--) {
           arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        */
                int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i = 0; i < n; i++) {
            //Swap logic
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l-i-1] = temp;
        }
        for (int element:arr ){
            System.out.print(element + " ");
        }
    }
}

