import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; //Creating an array with 5 elements 
        colors[0] = "Purple";
        System.out.println(colors[0].charAt(2)); //r 

        //int numbers[] = {100,200};  
        int[] numbers2 = {300,400}; 
                                    //BOTH Works above 
        for(int i:numbers2){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        //STREAM 
        Arrays.stream(colors).forEach(System.out::println);

        // Utility Methods 
        // Arrays. <-- this will show differnet util methods in array
        
        

        /* 2D Array */
        
    }
}
