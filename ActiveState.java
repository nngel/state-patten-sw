public class ActiveState implements AccountState {
    public void deposit(Account account, double input){
        account.setBalance(account.getBalance() + input);

        System.out.println("\nDEPOSIT!!");
        System.out.println("Account number :\t" + account.getAccountNumber());
        System.out.println("Current balance:\t" + Double.toString(account.getBalance()));
        System.out.println();
    }
    public void withraw(Account account, double input){
        account.setBalance(account.getBalance() - input);

        System.out.println("\nWITHRAW!!");
        System.out.println("Account number :\t" + account.getAccountNumber());
        System.out.println("Current balance:\t" + Double.toString(account.getBalance()));
        System.out.println();
    }
    public void activate(Account account){
        System.out.println("This account is already activated!");
    }
    public void suspend(Account account){
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    public void close(Account account){
        account.setState(new ClosedState());
        System.out.println("Account is closed!");

    }
}