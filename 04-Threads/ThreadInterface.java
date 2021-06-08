// Runnable (single method interface)
public class ThreadInterface extends Thread {
    @Override
    public void run() {
        // System.out.println("Hi, I am "+Thread.currentThread().getId());

        for (int i = 0; i < Thread.currentThread().getId(); i++) {
            System.out.println("Hi, I am "+Thread.currentThread().getName() + " at iteration#"+ i);            
        }
    }    
}


// public class ThreadInterface implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("Hi, I am a thread!");
//     }    
// }
