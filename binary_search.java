public class binary_search {
    static int binary_search1(int[] list, int target){
        int left = 0;
        int right = list.length-1; 

        while(left <= right){
            int mid = (left+right)/2;
            int curr_num = list[mid]; 

            if(curr_num == target) return mid;

            else if(target < curr_num){
                right = mid-1; 
            }
            else if(target > curr_num){
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = {1,3,4,8,10,18,100,120,130};
        int target = 120; 
        
        System.out.println(binary_search1(list, target));

    }
}
