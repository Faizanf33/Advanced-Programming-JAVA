public class MainClass {
    static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        // ThreadInterface obj1 = new ThreadInterface();
        // ThreadInterface obj2 = new ThreadInterface();
        // ThreadInterface obj3 = new ThreadInterface();

        // obj1.setName("thread-1");
        // obj2.setName("thread-2");
        // obj3.setName("thread-3");

        // obj1.start();
        // obj2.start();
        // obj3.start();
        
        // obj1.join();
        int ID = 751998;
        BankAccount account = new BankAccount(ID);        

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.deposit(1);
                    System.out.println("D-Balance: "+account.getBalance());                    
                }

            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (double i = 0; i < 10; i++) {
                    account.withdraw(1);
                    System.out.println("W-Balance: "+account.getBalance());                    
                }
            }
        };

        // Run with and without 'join' to see the difference
        t1.setName("1-Thread"+ID);
        t2.setName("2-Thread"+ID);

        t1.start();
        t2.start();

        // System.out.println("Balance: "+account.getBalance());

    }
}