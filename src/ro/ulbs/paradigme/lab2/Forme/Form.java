package ro.ulbs.paradigme.lab2.Forme;

public class Form{
    private static int counter=0;
    private String color;
    public Form() {
        color = "white";
        counter++;
    }
    public Form(String color) {
        this.color = color;
        counter++;
    }

    public static int getter() {
        return counter;
    }


    public float getArea() {
        return 0;
    }
    public String toString() {
        return "This form has the color: " + color;
    }
}
