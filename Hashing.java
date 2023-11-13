import java.util.HashSet;
public class Hashing {
    public static void main(String []args){
    //Creating a new HashSet
    HashSet<Integer> set = new HashSet<>();

    //Inserting elements into the hashset
    set.add(11);
    set.add(12);
    set.add(13);
    System.out.println(set);

    //Searching elements in Hashset
    if(set.contains(12))
        System.out.println(" Yes it exists ");

    //Deleting elements from Hashset
    set.remove(12);
    if(!set.contains(12))
        System.out.println("It was removed ");
    }
}
