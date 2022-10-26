import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        hash.add("Iron man");
        hash.add("Captain America");
        hash.add("Hawkeye");
        hash.add("Vision");
        System.out.println(hash);

        // check an item if exists
        System.out.println(hash.contains("Iron man"));
        System.out.println(hash.contains("Superman"));

        // remove

        System.out.println(hash);
        System.out.println("removing iron man ");
        hash.remove("Iron man");
        System.out.println(hash);

        // clearing all items from hashSet
        hash.clear();
        System.out.println("After clearing..");
        System.out.println(hash);

        hash.add("Black Widow");
        hash.add("Vision");
        hash.add("Wanda");

        System.out.println(hash.size());
        System.out.println(hash);

        // looping through hasset

        for (String hero : hash) {
            System.out.println(hero);
        }

        // hashset for storing integer
        HashSet<Integer> ints = new HashSet<Integer>();
        ints.add(45);
        ints.add(43);
        ints.add(20);
        ints.add(234);
        ints.add(425);
        ints.add(844);

        System.out.println(ints);
        
        for(int i : ints){
           if(i>300){
            System.out.println(i);
           }
           else{
            continue;
           }
        }

        System.out.println(ints.getClass());

    }
}