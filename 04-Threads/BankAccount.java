import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private int ID;
    ReentrantLock lock1 = new ReentrantLock();
    ReentrantLock lock2 = new ReentrantLock();

    synchronized double getBalance() {
        return balance;
    }

    BankAccount(int ID) {
        balance = 0;
        this.ID = ID;
    }

    public int getId() {
        return this.ID;
    } 

    synchronized void deposit(double balance) {
        lock1.lock();
        this.balance += balance;
        lock1.unlock();
    }

    synchronized void withdraw(double balance) {
        lock2.lock();
        this.balance -= balance;
        lock2.unlock();
    }
}
