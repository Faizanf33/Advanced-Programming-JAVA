import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class state implements Serializable {
    public boolean st;
    public double[] position;

    public static final long serialVersionUID = 1L;
}

public class MainClass {
    public static void main(String[] args) {
        // state obj = new state();
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

        // read from file
        try {
            String fileString = "output.txt";
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileString));
            state load = (state)objectInputStream.readObject();
            
            System.out.println("State: "+load.st);
            System.out.println("Position: ["+load.position[0]+","+load.position[1]+"]");
            
            objectInputStream.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
