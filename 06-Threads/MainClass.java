
public class MainClass{
    public static void main(String[] args) throws InterruptedException {
        ThreadInterface obj1 = new ThreadInterface();
        ThreadInterface obj2 = new ThreadInterface();
        ThreadInterface obj3 = new ThreadInterface();

        obj1.setName("thread-1");
        obj2.setName("thread-2");
        obj3.setName("thread-3");

        obj1.start();
        obj2.start();
        obj3.start();
        
        obj1.join();

        System.out.println("obj3 status: "+obj3.isAlive());

    }
}