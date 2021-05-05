/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer2;

/**
 *
 * @author Asus
 */
public class DLLStack {
    private Node top;  
    int size;
    public DLLStack() 
    {
        top = null; 
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty()
    {
        return (top == null);
    }
    public void push(String item){
        if (isEmpty()){
            top = new Node (null, item, null);
        }else{
            Node newNode = new Node(null, item, top);
            top.prev = newNode;
            top = newNode;
        }
        size++;
    }
    public void pop() throws Exception{
        if (isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        }else{
            top = top.next;
            top.prev = null;
            size--;
        }
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = top;
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }
    public String peek() throws Exception{
        if (isEmpty()){
            throw new Exception ("Linked List Kosong");
        }
        return top.data;
    }

} 

