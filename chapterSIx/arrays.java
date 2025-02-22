package arrayshere;
//array is a collection of similar type data

public class arrays {
    public static void main(String[] args) {
        //classroom of 500 student
//        int [] marks = new int [5];
//        marks[0] = 91;
//        marks[1] = 87;
//        marks[2] = 93;
//        marks[3] = 47;
//        marks[4] = 95;
//        marks[5] = 87; throws an error when i print marks[5].
        int [] marks = {87,68,67,66,65,70};
//        String [] student = {"Alex","Bob","Charlie" };
//        System.out.println(student[2]);
      //  System.out.println(student.length);
        // Printing using for loop
//        for (int i = 0; i< marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//        // Quick Quiz write a program to print the element of an array in reverse order
        for (int i = marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
       // Quick Quiz write a program to print the element of an array in for each loop
        for (int element: marks) {
            System.out.println(element);
        }
        //System.out.println(marks[2]);
        //System.out.println(marks.length);
    }
}
