package chapterthree;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        String string = strings.nextLine();
        System.out.println(string);

        int a = 6;
        float b = 3.14f;
        System.out.format("The value of a is %d and b is %5.2f", a, b);

    }
}
