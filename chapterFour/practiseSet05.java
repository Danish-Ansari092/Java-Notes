package chapterfour;

import java.util.Scanner;

public class practiseSet05 {
    public static void main(String[] args) {
        //Question print this pattern invert pyramid.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the layer of pyramid ");
//        int n = input.nextInt();
//        for (int i=n; i>0;i--) {
//            for (int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
        //Question 2 write a program to sum first n even number using while loop
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the serial of even numbers: ");
//        int n = input.nextInt();
//        int i = 1;
//        while (i <= n) {
//            System.out.println(2*i);
//            i++;
//        }
        //Question 2 write a program to print multiplication tabe of table number n.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number for its multiplication table ");
//        int n = input.nextInt();
//        for (int i = n; i < 11; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.println(i * j + " ");
//            }
//        }
        //Question 3 write a program to print multipication table in reverse order.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for its reverse multiplication table ");
        int n = input.nextInt();
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 1; j++) {
                System.out.println(i * j);
            }
        }
    }
}
