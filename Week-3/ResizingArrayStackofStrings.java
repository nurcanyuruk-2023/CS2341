//resizing-array implementation
public class ResizingArrayStackofStrings {

    private String[] s = new String[1];
    private int N=0;

    public void push(String item)
    {
        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
    }

    public String pop(){
        return s[--N];
    }
    private void resize(int capacity)
    {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++)
            copy[i] = s[i];
        s = copy;
    }
}
