package Lab1;

import java.util.*;

public class HashTreeSet {

    public static void main(String[] args) {

        Set<String> ls = new HashSet<>();

        ls.add("Kay");
        ls.add("Jay");
        ls.add("May");
        ls.add("Fay");
        ls.add("May");//duplicate

        Iterator<String> ite = ls.iterator();

        while (ite.hasNext()){
            System.out.println(ite.next()); //KJM only no duplicate allow
        }

        System.out.println();

        Set<String> treels = new TreeSet<>();

        treels.add("Kay");
        treels.add("Jay");
        treels.add("May");
        treels.add("Fay");
        treels.add("May");//remove previous may and add at the end

        Iterator<String> treeite = treels.iterator();

        while (treeite.hasNext()){
            System.out.println(treeite.next()); //FJKM
        }




    }

}
