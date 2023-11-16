package Lab1;

import java.util.ListIterator;
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Kay");
        ls.add("Jay");
        ls.add("May");
        ls.add("Fay");

        ls.remove("Jay");

        ListIterator<String> ite = ls.listIterator();

        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println();

        while (ite.hasPrevious()){
            System.out.println(ite.previous());

        }
        System.out.println();

        ls.add("Kay");

        ite = ls.listIterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

    }

}
