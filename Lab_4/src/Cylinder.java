public class Cylinder extends Circle{
    double height;

    public Cylinder(){
        super();
        this.height = 1.0f;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume() {
        return getArea()*getHeight();
    }
}
