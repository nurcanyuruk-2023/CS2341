public class Queue<Item> {

    private class Node{
        Item item;
        Node next;
    }
    Node first;
    Node last;

    // add to the end of the list
    public void enqueue(Item item){
      Node oldlast = last;
      last = new Node();
      last.item = item;
      last.next = null;

      if (first == null){ first = last; }
      else { oldlast.next = last; }
    }



    public boolean isEmpty(){
        return first == null;
    }

    public void display(){
        Node current = first;
        while(current != null){
            System.out.println(current.item);
            current = current.next;
        }
    }

    // remove from the beginning
    public Item dequeue(){
        Item removedItem = first.item;
        first = first.next;
        return removedItem;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.display();

        q.dequeue();
        System.out.println();
        q.display();


    }



}
