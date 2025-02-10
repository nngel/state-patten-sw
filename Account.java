public class Account{

    private AccountState state;
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        setBalance(balance);
        setState(new ActiveState());
    }

    public AccountState getState() {
        return state;
    }
    public void setState(AccountState state) {
        this.state = state;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double input){

        this.getState().deposit(this, input);
    }
    public void withraw(double input){
        
        this.getState().withraw(this, input);
    }
    public void activate(){
        this.getState().activate(this);

        System.out.println();
    }
    public void suspend(){
        this.getState().suspend(this);

        System.out.println();
    }
    public void close(){
        this.getState().close(this);

        System.out.println();
    }
    
}