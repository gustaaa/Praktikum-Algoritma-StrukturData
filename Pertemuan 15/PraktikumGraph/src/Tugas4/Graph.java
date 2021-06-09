/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class Graph<T> {
    int vertex;
    LinkedLists list[];
    
    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++){
            list[i] = new LinkedLists();
        }
    }
    public void addEdge(int indeks1, int indeks2, String source, String destination){
        //add edge
        list[indeks1].addFirst(destination);
        
        //add back edge (for undirected)
        list[indeks2].addFirst(source);
    }
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if (list[i].get(j).equals(source))
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
        for (int i = 0; i < vertex; i++) {
            if (i == destination){
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
