package Strings;

public class StringImmutable {

    public static void main(String[] args) {
        // = creates object in string pool
        String a = "Aditya";
        String b = "Aditya";
        System.out.println(a==b);

        // new keyword creates object somewhere in heap
        String c = new String("Aditya");
        String d = new String("Aditya");
        System.out.println(c==d);
        // to check only values
        System.out.println(c.equals(d));

    }
}
