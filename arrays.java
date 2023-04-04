import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; // Creating an array with 5 elements
        colors[0] = "Purple";
        System.out.println(colors[0].charAt(2)); // r

        // BOTH Works below:
        // int numbers[] = {100,200};
        int[] numbers2 = { 300, 400 };
        for (int i : numbers2) {
            System.out.print(i + " ");
        }

        int[] numbers3 = new int[7];
        for (int i : numbers3) {
            System.out.print(i + " ");
        }

        // Size:
        int num2_size = numbers2.length; // To get the length of an array
        System.out.println(num2_size);

        System.out.println("\n");
        // STREAM
        Arrays.stream(colors).forEach(System.out::println);

        // Utility Methods
        // Arrays. <-- this will show differnet util methods in array

        /* 2D Array */

    }
}
