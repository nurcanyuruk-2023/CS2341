import edu.princeton.cs.algs4.StdIn;

public class Main {
    public static void main(String[] args) {
       
        StackofStrings stack = new StackofStrings();

        while(!StdIn.isEmpty()) {
            String token = StdIn.readString();
            if(!token.equals("-")) {
                stack.push(token);
            }
            else {
                System.out.println(stack.pop());
            }
        }

    }
}
