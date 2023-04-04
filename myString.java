import java.util.Arrays;

public class myString {
    public static void main(String[] args) {
        String s = "My name";

        // for (char i : s) {
        // System.out.println(i);
        // } Not possible

        char[] s_array = s.toCharArray();
        for (char i : s_array) {
            System.out.println(i);
        }

        System.out.println("Sorted String: " + sort(s)); // Java has no internal sort. See below.
        System.out.println(s.charAt(0));

        // Length
        System.out.println(s.length());

        // Array of String
        String[] colors = new String[5]; // Creating an array with 5 elements
        colors[0] = "Purple";
        System.out.println(colors[0].charAt(2)); // r
        String[] given = new String[] { "hello", "world" };

        // substring(int beginIndex, int endIndex)
        System.out.println(s.substring(0, 4));

        // Uppercare --> toUpperCase(), toLowerCase(),
        String new_s = s.toUpperCase();
        System.out.println(new_s);

        // Strip:
        String str = "   Hello, World!   ";
        String strippedStr = str.strip();
        System.out.println(strippedStr); // Output: "Hello, World!"

        // Split
        String str2 = "Hello, World!";
        String[] strippedStr2 = str2.split(" ");
        System.out.println(strippedStr2[0]); // Output: "Hello, World!"

    }

    /* String doesn't have a sort method built in */
    public static String sort(String input) {
        char[] sorted_string = input.toCharArray();
        Arrays.sort(sorted_string);

        return new String(sorted_string);
    }
}
