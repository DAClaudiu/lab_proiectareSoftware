package ro.ulbs.paradigme.lab2.Forme;

public class Circle extends Form{
    private float radius;
    public Circle() {
        super();
        radius=0;
    }
    public Circle(float radius,String color) {
        super(color);
        this.radius = radius;
    }
    public float getArea(){
        return (float) (Math.PI*radius*radius);
    }
    public String toString() {
        return super.toString() + " and a radius of " + radius;

    }

    public boolean equals(Object o) {
        return this.radius == ((Circle)o).radius;
    }
}