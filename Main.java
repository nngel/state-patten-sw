public class Main{
    public static void main(String[] args)
    {
        //Intro
        System.out.println("=== Bank Account Demo ===\n");

        //Init
        Account acc1 = new Account("1234", 10000);

        //Activate
        acc1.activate();

        //Suspend
        acc1.suspend();

        //Activate
        acc1.activate();

        //Deposit
        acc1.deposit(1000.00);

        //Withraw
        acc1.withraw(100.0);

        //Close
        acc1.close();

        //Activate
        acc1.activate();

        //Suspend
        acc1.suspend();

        //Withdraw
        acc1.withraw(500);

        //Deposit
        acc1.deposit(1000);


        System.out.println("\n--- END PROGRAM ---");

    }
}