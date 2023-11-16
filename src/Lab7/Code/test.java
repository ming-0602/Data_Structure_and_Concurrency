package Lab7.Code;

import java.util.*;

public class test {

    public static void main(String[] args) {
//        double[][] matrix = new double[5][5];
//
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.println(matrix[i][j] + " ");
//            }
//        }


        List<LinkedList<Integer>> adjacencyLists;

        int nV = 5;
        adjacencyLists = new ArrayList<>(nV);
        for (int i= 0;i < nV; i++) {
            adjacencyLists.add(new LinkedList<>());
        }

        System.out.println(adjacencyLists);

        int s = 3;
        int d = 4;

        adjacencyLists.get(s).add(d);
        adjacencyLists.get(s).add(2);
        adjacencyLists.get(s).add(3);

        System.out.println(adjacencyLists);

        ListIterator<LinkedList<Integer>> ls = adjacencyLists.listIterator();
//        for (int i = 0; i < adjacencyLists.get(s).size(); i++) {
//            if (adjacencyLists.get(s).get(i) == 2){
//                adjacencyLists.get(s).get(i)
//            }
//        }
//        adjacencyLists.get(s).remove(2);
        adjacencyLists.get(s).remove(Integer.valueOf(2));

        System.out.println(adjacencyLists);




    }
}
