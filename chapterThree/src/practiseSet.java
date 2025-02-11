
import java.util.Scanner;

// 3.0 Practise Set of strings
//Question 1 write a java program to convert a string to lowercase.
public class practiseSet {
    public void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        String string = strings.nextLine();
        System.out.println(string);
        String lstring = string.toLowerCase();
        System.out.println(lstring);
    }
}