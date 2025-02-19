package chapterfour;
//we learn in this break statement and continue statement;

import java.util.Scanner;

public class breaksloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of total lines statment: ");
        int totalLines = input.nextInt();
//        for (int i = 1; i <= totalLines; i++) {
//            System.out.println("You are good coder");
//            if (i == 2) {
//                System.out.println("Ending the loops");
//                break;
//            }
//        }
        for (int i = 1; i <= totalLines; i++) {
            if (i==2) {
                System.out.println("you are missing in this world");
                continue;
            }
            System.out.println(i);
            System.out.println("you are in this world");
        }
    }
}
