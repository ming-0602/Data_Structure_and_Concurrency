package Lab7.Code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    @Test
    void testmatrixgraph(){

        MatrixGraph mg = new MatrixGraph(5, false);
        mg.addEdge(2,3);
        System.out.println(mg.isEdge(2,3));
        mg.removeEdge(2,3);
        System.out.println(mg.isEdge(2,3));


    }

}