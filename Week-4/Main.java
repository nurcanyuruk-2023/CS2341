//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Stack<String> stack = new Stack<String>();

       while(!StdIn.isEmpty()) {
           String token = StdIn.readString();

           if(!token.equals("-")) {
               stack.push(token);
           }
           else {
               stack.pop();
           }
       }
       // refers to hasNext and next functions in Bag.java
       for(String str : stack) {
           StdOut.println(str);
       }

    }
}
