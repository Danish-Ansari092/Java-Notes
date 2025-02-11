/* 1.1 write a program to calculate percentage of a given student in CBSE Board exam,
his marks from subject must be taken as input from the keyboard*/
package chapterone;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("Calculate your percentage of marks ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your mathematics marks is ");
        int math = input.nextInt();
        System.out.print("Enter your english marks is ");
        int english = input.nextInt();
        System.out.print("Enter your physics marks is ");
        int physics = input.nextInt();
        System.out.print("Enter your chemistry marks is ");
        int chemistry = input.nextInt();
        System.out.print("Enter your computer marks is ");
        int computers = input.nextInt();
        int total = math + english + physics + chemistry + computers;
        System.out.println("Your marks is " + total);
        System.out.println(total /5);

    }
}
