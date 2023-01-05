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

        System.out.println("Sorted String: " + sort(s));
    }

    /* String doesn't have a sort method built in */
    public static String sort(String input) {
        char[] sorted_string = input.toCharArray();
        Arrays.sort(sorted_string);

        return new String(sorted_string);
    }
}
