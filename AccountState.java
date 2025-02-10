public interface AccountState{
    public void deposit(Account account, double input);
    public void withraw(Account account, double input);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}