package ro.ulbs.paradigme.lab2.Forme;

public class Square extends Form {
    private float side;
    public Square() {
        super();
        side=0;
    }
    public Square(float side,String color) {
        super(color);
        this.side = side;
    }
    public float getArea() {
        return side * side;
    }

    public String toString() {
        return super.toString()+ " and a side of " + side;
    }

    public boolean equals(Object o) {
        return this.side == ((Square)o).side;
    }
}
