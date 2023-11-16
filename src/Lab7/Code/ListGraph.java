package Lab7.Code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGraph extends AbstractGraph {
    private List<LinkedList<Integer>> adjacencyLists;

    public ListGraph(int nV, boolean direct){
        super(nV, direct);
        adjacencyLists = new ArrayList<>(nV);
        for (int i= 0;i < nV; i++) {
            adjacencyLists.add(new LinkedList<>());
        }
    }

    // In code below, s represents source of an edge and d represents destination of an edge
    // e.g. if (2, 3) is an edge, 2 is the source and 3 is the destination

    @Override
    public boolean isEdge(int s, int d) {
        // get LinkedList at index s of adjacencyLists
        //check if it contains d
        if (adjacencyLists.get(s).contains(d)){
            return true;
        }
        return false; 
    }

    @Override
    public void addEdge(int s, int d) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
        
        // first validate s and d to ensure code is robust
        
	   // Then add d to s's adjacency list:
        // In 2 steps: 
        //LinkedList<Integer> list =  adjacencyLists.get(s);
        //list.add(d);

        if (s<0 || s> adjacencyLists.size() || d <0 || d> adjacencyLists.size())
            throw new IllegalArgumentException();

        // Or in 1 step:
        adjacencyLists.get(s).add(d);
        
        // Then if list is undirected, add s to d's list
        if (!isDirected()) {
             //complete this method
            adjacencyLists.get(d).add(s);
        }
    }

    @Override
    public void removeEdge(int s, int d) {
        //complete this method
        adjacencyLists.get(s).remove(Integer.valueOf(d));

        if (!isDirected()){
            adjacencyLists.get(d).remove(Integer.valueOf(s));
        }

    }
}
