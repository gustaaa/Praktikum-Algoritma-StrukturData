/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Graph {
    int vertex;
    LinkedLists list[];
    
    public Graph(int vertex, boolean graph){
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++){
            list[i] = new LinkedLists();
        }
    }
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        
        //add back edge (for undirected)
        list[destination].addFirst(source);
    }
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if (list[i].get(j) == source)
                    ++totalIn;
        }
            //outDegree
        for (k = 0; k < list[source].size(); k++){
           list[source].get(k);
        }
        totalOut = k;
        }
        System.out.println("Indegree dari vertex "+ source +" : "+ totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+ totalOut);
        System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut));
    }
    //Modifikasi method removeEdge()agar tidak menghasilkan output yang salah untuk path selain path pertama kali!
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < list[source].size(); i++){
            if (destination == list[source].get(i)){
                list[source].remove(destination);
            }
        }
    }
    
    public void removeAllEdge(){
        for (int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex "+ i +" terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    public boolean graphtype(boolean pilih) {
        return pilih;
    }
}
