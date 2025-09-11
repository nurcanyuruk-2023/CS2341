
public class Counter {

    private final String name;     // counter name
    private int count = 0;         // current value


    public Counter(String id) {
        name = id;
    }

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        count++;
    }

    /**
     * Returns the current value of this counter.
     *
     * @return the current value of this counter
     */
    public int tally() {
        return count;
    }

    /**
     * Returns a string representation of this counter.
     *
     * @return a string representation of this counter
     */
    public String toString() {
        return count + " " + name;
    }

}