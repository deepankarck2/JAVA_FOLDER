public class insertion_sort {
    
    public static void sort_func(int[] myList){

        for(int i=1; i< myList.length; i++){

            int key = myList[i];

            int hole = i;
            while(hole > 0 && myList[hole-1]> key) {
                myList[hole] = myList[hole-1];
                hole--;  
            }
            myList[hole] = key;
        }
    }

    public static void main(String[] args) {
        int[] myList = {5,6,1,4,88,100,2};

        sort_func(myList);

        for(int i: myList){
            System.out.print(i+ " ");
        }
    }
}
