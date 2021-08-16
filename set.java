import java.util.*;

class SetImplementation {
    /** Advantages:
    Set index starts from 1 (not 0)
    Set does not allow duplicates

    Disadvantages:
    Set is not ordered
    Value cannot be retreived by index
    */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();  //TreeSet is ascending order, HashSet is random order
        //to add elements to the set
        set.add(1);
        set.add(34);
        set.add(92);
        set.add(95);
        set.add(46);
        set.add(48);
        //to check element in a set
        System.out.println(set.contains(1));
        //to remove element from a set
        set.remove(1);
        //to get the length of the set
        int a = set.size();
        //to iterate through the set
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
