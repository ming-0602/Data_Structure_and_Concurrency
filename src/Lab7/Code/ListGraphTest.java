package Lab7.Code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListGraphTest {

    @Test
    void testaddedge(){

        ListGraph lg = new ListGraph(5,false);
        lg.addEdge(2,3);
        lg.isEdge(2,3);
        boolean expected = true;
        assertEquals(expected ,lg.isEdge(2,3));
        boolean expectedfalse = false;
        assertEquals(expectedfalse, lg.isEdge(1,2));

    }

}