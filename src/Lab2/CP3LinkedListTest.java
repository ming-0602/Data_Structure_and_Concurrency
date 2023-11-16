package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void testsize(){

        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        int expected = 3;
        assertEquals(expected, tem.size());
    }

    @Test
    void testcontain(){

        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        boolean expected = true;
        assertEquals(expected, tem.contains("Bob"));
    }

    @Test
    void testremovefirst(){

        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        String expected = "James\nBob\n";

        System.out.println(expected);
        tem.removeFirst();
        tem.print();

    }

    @Test
    void testprint(){
        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        String expected = "Jeremy\nJames\nBob\n";
        System.out.println(expected);
        tem.print();
    }

    @Test
    void testgetfirst(){
        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        String expected = "Jeremy";

        assertEquals(expected, tem.getFirst());

    }

    @Test
    void testgetlast(){

        CP3LinkedList<String> tem = new CP3LinkedList<>();
        tem.addFirst("Bob");
        tem.addFirst("James");
        tem.addFirst("Jeremy");

        tem.print();
        System.out.println();
        tem.addLast("Ken");
        tem.print();
        System.out.println();
        tem.addLast("ming");
        tem.print();

    }

    @Test
    void testrecurivesize(){

        CP3LinkedList<Integer> tem = new CP3LinkedList<>();
        tem.addFirst(1);
        tem.addFirst(2);
        tem.addFirst(3);

        tem.getFirst();

//        assertEquals(3, tem.recursiveSize(tem.getFirst()));

    }



}