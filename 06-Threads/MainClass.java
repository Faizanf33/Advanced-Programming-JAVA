
public class MainClass {
    public static void main(String[] args) {
        ThreadInterface obj1 = new ThreadInterface();
        ThreadInterface obj2 = new ThreadInterface();

        obj1.start();
        obj2.start();

        // ThreadInterface obj = new ThreadInterface();
        
        // Thread thread = new Thread(obj);
        // thread.run();
    }
}