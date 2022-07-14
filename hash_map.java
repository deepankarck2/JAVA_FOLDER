import java.util.*; 

public class hash_map {
    public static void main(String[] args) {
        HashMap<String, Integer> myHash = new HashMap<>(); 

        myHash.put("a", 97);
        myHash.put("b", 98);
        myHash.putIfAbsent("c", 99);
        System.out.println(myHash);
        
        /* Key with Max Value: */
        
        String max_key = null;
        for(String key: myHash.keySet()){
            if(max_key == null || myHash.get(max_key) < myHash.get(key)){
                max_key = key; 
            }
        }

        System.out.println("Key with Max Value: " + max_key);
    }
}
