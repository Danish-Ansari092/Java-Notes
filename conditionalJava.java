package conditionalJava;

import java.util.Scanner;

public class conditionalJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Check you ar eligible for vote: ");
//        System.out.println("Please enter your age: ");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("You are eligible for vote");
//        }
//        else {
//            System.out.println("You are not eligible for vote\t");
//        }
          int age = sc.nextInt();
         if (age>60){
             System.out.println("You are Experienced");
         } else if (age>40) {
             System.out.println("You are Semi Experienced");
         } else if (age>20) {
             System.out.println("You are fresher");
         } else
             System.out.println("You are not Experienced");
    }
}
