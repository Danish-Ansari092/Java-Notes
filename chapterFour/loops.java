package chapterfour;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
      //  int i = 1;
//        while (i <= 3) {
//            System.out.println(i);
//            i++;
       // }
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<10);
       // int i = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        //Quick Quiz; Write a program to print first n natural numbers using for loop.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
//        int num = input.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.println(2*i+1);
//        }
        // write a program to print first n natural number in reverse order for loop.
        int num = input.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println(2*i+1);
        }
    }
}