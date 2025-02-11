package chapterthree;

import java.util.Scanner;

public class practiseSet {
    public static void main(String[] args) {
        // Question 1 write a program to convert a string to lowercase
//        String name = "JacK SParrow";
//        name = name.toLowerCase();
//        System.out.println(name);
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
//        word = word.toLowerCase();
//        System.out.println(word);

        //Question 2 Write a program to replace spaces with underscores
//        word = word.replace(" ","_");
//        System.out.println(word);

        //Question 3 write a program to file in a letter template which looks like
        String letter = "Dear <!name>, Thanks me a lot!";
        letter = letter.replace("<!name>",word);
        System.out.println(letter);
    }
}