package conditionalJava;

import java.util.Scanner;

public class practiseSet {
    public static void main(String[] args) {
        // Question 1 write a program to find out whether a student is pass or fail; if it is requires total 40% and
        //            at least 33% in each subject to pass. Assume 3 subject and takes as input from user.
//        Scanner marks = new Scanner(System.in);
//        System.out.println("Enter marks of physics");
//        int m1,m2,m3;
//        m1 = marks.nextInt();
//        System.out.println("Enter marks of chemistry");
//        m2 = marks.nextInt();
//        System.out.println("Enter marks of mathematics");
//        m3 = marks.nextInt();
//        float avg = (m1 + m2 +m3)/3.0f;
//        System.out.println(avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
//            System.out.println("Congrats! You are promoted");
//        } else {
//            System.out.println("You are not promoted,try again next year");
//        }

        // Question 2 calculate income tax paid by an employee to the government as per the slabs mentioned below;
        //   income slabs          tax
        //    2.5l-5.0l            5%
        //    5.0l-10.0l           20%
        //    Above 10.0l          30%
        // NOTE THAT THERE IS NO TAX BELOW 2.5L.
//        Scanner sc = new Scanner(System.in);
//        float income= sc.nextFloat();
//        float tax = 0;
//        if (income>=2.5f){
//            tax = income + 0f;
//        }
//        else if (income>2.5f && income<=5f){
//            tax = tax + 0.05f *(income-2.5f);
//        }
//        else if(income>5f && income<=10){
//            tax = tax + 0.05f *(5.0f - 2.5f);
//            tax = tax + 0.2f *(income-5f);
//        }
//        else if(income>10){
//            tax = tax + 0.05f *(5.0f - 2.5f);
//            tax = tax + 0.2f *(10.0f-5.0f);
//            tax = tax + 0.3f *(income-10.0f);
//        }
//        System.out.println("The total tax is "+tax);

        //Question 4 Write a java program to find out the day of the weak given the number [1 for monday
        //           2 for tuesday and so on.
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Question 5 write a program to find out the type of website from the url
        //             .com = commercial website
        //             .org = organization website
        //             .in  = indian website
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if (website.endsWith(".org")){
            System.out.println("This is an organization website");
        } if (website.endsWith(".com")){
            System.out.println("This is an commercial website");
        } if (website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
    }
}
