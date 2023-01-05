public class StringBuilder_ex {
    public static void main(String[] args) {
        String[] words = { "My name us this", " this", " Three" };
        String sentense = "";

        for (String w : words) {
            sentense = sentense + w;
            // Not good because we are copying each element and pasting it on each call
            // Run time is O(X + 2x + 3x + ....), where x is the length of word in words
            // O(xn^2)
        }

        /* Better option: String Builder */
        // It ceates a resizable array of all the strigns, and only copys when needed

        StringBuilder sentense2 = new StringBuilder();
        for (String w : words) {
            sentense2.append(w);
        }
        System.out.println(sentense2);
    }
}
