package chapterthree;

public class stringsMethod {
    public static void main(String[] args) {
        String name = "Danish";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);
        System.out.println(name.substring(2));  //output start from index 2.
        System.out.println(name.substring(1,4));    // output from  index 1 to 3
        System.out.println(name.replace('D','V'));
        System.out.println(name.replace("anish","ance"));
        System.out.println(name.startsWith("Dan"));
        System.out.println(name.startsWith("dan"));
        System.out.println(name.endsWith("ish"));
        System.out.println(name.charAt(2));
        System.out.println("Good to see you \" doubble quote");
    }
}
