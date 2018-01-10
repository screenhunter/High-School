

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	
	public ArrayList<Vertex> breadth(Vertex v) {
		
		Queue<Vertex> nodes = new LinkedList<Vertex>();
	      
        nodes.add(v);
     
        ArrayList<Vertex> list = new ArrayList<Vertex>();
     
        while (nodes.size() != 0) {
        
           Vertex n = nodes.poll();
        
           list.add(n);
        
           for (Vertex x : n.getEdges())
              if (!list.contains(x))
                 nodes.add(x);
        
        }
     
        return list;
		
	}

}

class Vertex {
    private final String name;
    private List<Vertex> edges = new ArrayList<Vertex>();
 
    Vertex() {
       name = null;
    }
 
    Vertex(String str) {
       name = str;
    }
 
    public void addEdge(Vertex c) {
       edges.add(c);
    }
 
    public void removeEdge(Vertex c) {
       edges.remove(c);
    }
 
    public String getName() {
       return name;
    }
 
    public List<Vertex> getEdges() {
       return edges;
    }
 
    public String toString() {
       String temp = name + "-->";
       for (Object v : edges)
          temp += ((Vertex) v).name + " ";
       return temp;
    }
 }