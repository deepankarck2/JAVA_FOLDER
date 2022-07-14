import java.util.List;

public class ValidSubsequence {
 
    public static void main(String[] args) {
        
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
       
        if(array.size() < sequence.size()) return false;

        int i = 0, j = 0;

        while(i < array.size() && i <= j) {
            if(array.get(i) == sequence.get(j)){
                j++;
            }
            i++;
        }

        return j == sequence.size();
      }

}
