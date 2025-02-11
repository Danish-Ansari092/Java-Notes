import java.util.Scanner;

// Practise set of chapter 2
        // Question 1 what will be the result of the following expression float a = 7/4 * 9/2.
public class practiceSet {
    public static void main(String[] args) {
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);
        //Question 2 write a java program to encrypt a grade by adding 8 to it.Decrypt it to show show the correct grade
        char grade = 'B';
        grade = (char)(grade + 8);    //Encrypting
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println(grade);    //Decrypting

        //Question 3 Use comparision operator to find out whether a given number is than the user enetered the no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println(a>=10);

        //Question 4 find the value 7*49/7 + 35/7
        int x = 7;
        int y = (7*49/7 + 36/7);
        System.out.println(y);
    }
}
