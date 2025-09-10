public class StackofStrings {

    private class Node{
        String item;
        Node next;
    }
    Node first;
    Node last;


    // add to the beginning of the list
    public void push(String item){
        Node oldfirst = first;

        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    // remove from the beginning
    public String pop(){
        String removedItem = first.item;
        first = first.next;
        return removedItem;
    }

    public void display(){
        Node current = first;
        while(current != null){
            System.out.println(current.item);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackofStrings list = new StackofStrings();

        list.push("one");
        list.push("two");
        list.push("three");
        list.push("four");

        list.display();

        String removedItem = list.pop();
        System.out.println(removedItem + " is removed");
        list.display();


    }



}
