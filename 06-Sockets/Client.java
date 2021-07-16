import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try {
            // Create socket
            Socket socket = new Socket(InetAddress.getLocalHost(), 4000);

            if (socket.isConnected()) {
                System.out.println("Connection established at " + socket.getInetAddress() + ":" + socket.getPort());

                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("Hello from client side!");
                out.flush();

                // Close output stream, socket
                out.close();
                socket.close();

            } else {
                System.out.println("CLIENT ERROR: Unable to connect!");
            }

        } catch (Exception e) {
            System.err.println("CLIENT ERROR: " + e.getMessage());
        }
    }
}
