public class Honda implements Car {
    String color;
    String model;
    int regNo;

    public Honda() {
        this(0, "color", "model");
    }

    public Honda(int regNo, String color, String model) {
        this.regNo = regNo;
        this.color = color;
        this.model = model;
    }

    public void display() {
        System.out.println("HONDA - Specifications");
        System.out.println("Color:        "+color);
        System.out.println("Model:        "+model);
        System.out.println("Registration: "+regNo);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public int getRegNo() {
        return this.regNo;
    }
}