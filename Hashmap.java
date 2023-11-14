//import java.util.HashMap;
import java.util.*;

public class Hashmap {
    public static void main(String []args){
        //Creating a Hashmap
        HashMap<String,Integer> HM = new HashMap<>();

        //Inserting into a hashmap
        HM.put("Alpha",1);
        HM.put("Beta",2);
        HM.put("Gamma",3); 
        System.out.println(HM);

        //Searching in hashmap
        if(HM.containsKey("Alpha"))
            System.out.println("Yes Alpha exists");
        
        
        //Getting values from Keys
        System.out.println(HM.get("Alpha"));

        //Iterating in a Hashmap
        //Method 1(Standard Method)
        for(Map.Entry<String,Integer> e : HM.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        
        //Method 2(new type of for loop)
        Set<String> keys = HM.keySet();
        for(String key : keys){
            System.out.println(key + " " + HM.get(key));
        }

    }
    
}
