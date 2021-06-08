interface SingleMethod {
    public void print(String Message);
}

public class SingleMethodInterface {
    public static void main(String[] args) {
        // Typical Anonymous Method Implementation 
        SingleMethod singleMethod = new SingleMethod() {
            @Override
            public void print(String Message) {
                System.out.println("Message: "+Message);
            }
        };

        singleMethod.print("Hello, I'm Faizan Ahmad!");

        // // Implementation using lambda expression
        // SingleMethod singleMethodL = (String Message) -> { System.out.println("Message: "+Message); };

        // Single Line Implementation using lambda expression
        SingleMethod singleMethodL = (String Message) -> System.out.println("Message: "+Message);

        singleMethodL.print("Hello, I'm Faizan Ahmad!");
    }    
}
