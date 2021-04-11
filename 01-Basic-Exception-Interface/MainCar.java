public class MainCar {
    public static void main(String[] args) {
        Honda hondaDummy = new Honda();
        hondaDummy.display();
        System.out.println();

        Honda honda = new Honda(5545, "Black", "2018");
        honda.display();
    }    
}