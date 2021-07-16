import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    static Socket socket = null;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(4000);

            System.out.println("Server listening at " + serverSocket.getLocalSocketAddress());

            System.out.print("Waiting for client ");

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        socket = serverSocket.accept();
                    } catch (Exception e) {
                        System.err.println("\nSERVER ERROR: " + e.getMessage());
                    }
                }
            };

            Thread thread = new Thread(runnable);
            thread.start();

            int waitTime = 0;
            while (thread.isAlive()) {
                System.out.print(".");
                Thread.sleep(1000);
                waitTime++;
            }

            if (socket.isConnected()) {
                System.out.println("\nClient connected after " + waitTime + " seconds");

                DataInputStream in = new DataInputStream(socket.getInputStream());
                System.out.println("Message: " + in.readUTF());

                // Close input stream, socket
                in.close();
                socket.close();

            } else {
                System.out.println("\nClient not connected!");
            }

            // Close server socket
            serverSocket.close();

        } catch (Exception e) {
            System.err.println("SERVER ERROR: " + e.getMessage());
        }

    }
}
