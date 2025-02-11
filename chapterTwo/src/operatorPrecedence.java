import java.util.Scanner;

public class operatorPrecedence {
    public static void main(String[] args) {
        int n = 6*5-34/2;
        System.out.println(n);  //Java does not work on BODMAS
        // java works on the Precedence and Associativity
        // Precendence = In Java, precedence determines the order in which operators are evaluated in an expression.
        /*
           = 30-34/2
           = 30-17
           = 13
         */
        int m = 60/10-5*2;
        System.out.println(m);
        // Associativity = Associativity determines the order of evaluation when two or more operators of the same precedence appear in an expression.
        /*
           = 6-5*2
           = 6-10
           = -4
         */
        // write the following (x-y)/2, (b^2 - 4ac)/2a ,v^2-u^2
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of a ");
        int a = input.nextInt();
        System.out.println("Enter value of b ");
        int b = input.nextInt();
        System.out.println("Enter value of c ");
        int c = input.nextInt();
        int k = (b*b-4*a*c)/(2*a);
            System.out.println(k);

    }
}
