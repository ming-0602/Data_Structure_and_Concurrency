package Lab2;

import java.util.NoSuchElementException;

public class CP3DoublyLinkedList<E> {
    private class Node {
        public E data;
        public Node next;
        public Node previous;
    }
    private Node first;
    private Node last;

    /**
     Constructs an empty linked list.
     */
    public CP3DoublyLinkedList()
    {
        first = null;
        last = null;
    }

    /**
     Adds an element to the front of the linked list.
     @param element the element to add
     */
    public void addFirst(E element)
    {
        if (first == null){
            Node newLink = new Node();
            newLink.data = element;
            newLink.next = first;
            newLink.previous = null;
            first = newLink;
            last = newLink;
        }else{
            Node newLink = new Node();
            newLink.data = element;
            newLink.next = first;
            newLink.next = null;
            first = newLink;
        }

    }

    public E getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public E removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        return element;
    }

    public void print(){
        //outputs the data on the list
        Node current = first;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size(){
        int size = 0;
        Node current = first;

        if (current==null){
            return size;
        }
        while (current != null){
            current = current.next;
            size++;
        }
        return size;
    }

    public boolean contains(E input){
        Node newnode = new Node();
        newnode.data = input;
        Node current = first;
        while (current != null){
            if (current.data == newnode.data){
                return true;
            }else {
                current = current.next;
            }
        }
        return false;
    }

    public void addLast(E element){

        Node newlink = new Node();
        newlink.data = element;

        Node current = last;
        last.next = newlink;
        last = newlink;




    }

}
