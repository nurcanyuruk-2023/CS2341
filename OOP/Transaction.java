public class Transaction {

    private final String who;
    private final Date when;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String who(){
        return who;
    }

    public Date when(){
        return when;
    }

    public double amount(){
        return amount;
    }

    public String toString(){
        String builder = String.format("Customer: %s\nOrder Date: %s \nOrder Amount: %.2f", who, when, amount);
        return builder;
    }

    public static void main(String[] args)
    {
        String customer = args[0];
        Date orderDate = new Date(args[1]);
        double amount = Double.parseDouble(args[2]);

        Transaction transaction = new Transaction (customer, orderDate, amount);
        System.out.println(transaction);
    }



}
