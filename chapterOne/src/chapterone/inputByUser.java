package chapterone;

import java.util.Scanner;

public class inputByUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your height: ");
        int height = input.nextInt();
        System.out.println("Your Information: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(height+"cm");
    }
}
