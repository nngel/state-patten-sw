public class ClosedState implements AccountState {

    public void deposit(Account account, double input){
        System.out.println("You cannot deposit on closed account!");
    }
    public void withraw(Account account, double input){
        System.out.println("You cannot withdraw on a closed account!");
    }
    public void activate(Account account){
        System.out.println("You cannot activate a closed account!");
    }
    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account!");
    }
    public void close(Account account){
        System.out.println("This account is already closed!");
    }
}