package conditionalJava;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 10:
                System.out.println("You are child");
                break;
                case 20:
                    System.out.println("You are adult");
                    break;
                    case 23:
                        System.out.println("You are able to get a job ");
                        break;
                        case 60:
                            System.out.println("You are able to get retired ");
            default:
                System.out.println("Enjoy Your Life");
        }
        System.out.println("Be a nice person in your life");
    }
}
