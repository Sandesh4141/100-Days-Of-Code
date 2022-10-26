import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> tSets = new TreeSet();
        tSets.add("Superman");
        tSets.add("Batman");
        tSets.add("Aquaman");
        tSets.add("Dr Fate");
        tSets.add("Flash");
        System.out.println(tSets);
        tSets.remove("Dr Fate");
        System.out.println(tSets);

    }
}
