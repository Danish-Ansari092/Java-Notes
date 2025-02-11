package chaptertwo;

public class operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 5 * a;
        int c = 6 % a; // Modulo operator which provides reminder
        c += 3;
        c *= 4;
        System.out.println(b);
        System.out.println(c);
        System.out.println(64>2 && 64>5 && 64>6); // logical operator AND, all statement is true, prints true
        // and 1/all satement is false, prints false.
        System.out.println(64>5 && 64<6);
        System.out.println(80>10 || 10>80); // Logical Operator OR,all statement is true, prints true
        // and 1/all statement is true, prints true.
    }
}
