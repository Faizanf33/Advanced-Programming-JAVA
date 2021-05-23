public class MainClass{
    static int sum = 0;

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
        
        Runnable runnable = ()->{
            for (int i = 1; i <= 10; i++) {
                sum += i;                
            }        // state obj = new state();
            // obj.st = true;
            // obj.position = new double[]{71.199, 123.21};
            
            
            // // save to file
            // try {
            //     String fileString = "output.txt";
            //     ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(fileString));
            //     objOutputStream.writeObject(obj);
            //     objOutputStream.close();
    
            // } catch (Exception e) {
            //     System.err.println(e);
            // }
    
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
        // Run with and without 'join' to see the difference
        thread.join();

        System.out.println("Sum: "+sum);

    }
}