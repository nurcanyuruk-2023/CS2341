public class QueueofStrings {

    private class Node{
        String item;
        Node next;
    }
    Node first;
    Node last;



    // add to the end of the list
    public void enqueue(String item){
      Node oldlast = last;
      last = new Node();
      last.item = item;
      last.next = null;

      if (first == null){ first = last; }
      else { oldlast.next = last; }
    }

    // remove from the beginning
    public String dequeue(){
        String removedItem = first.item;
        first = first.next;
        return removedItem;
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

    public static void main(String[] args) {
        QueueofStrings q = new QueueofStrings();

        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        q.enqueue("four");

        q.display();

        q.dequeue();
        System.out.println();
        q.display();


    }



}
