public class Circle {
    double radius;
    String color;

    public Circle() {
        this.color = "red";
        this.radius = 1.0f;
    }

    public Circle(double radius_of_circle) {
        this.radius = radius_of_circle;
        this.color = "red";
    }

    public Circle(double radius_of_circle, String color_of_circle) {
        this.color = color_of_circle;
        this.radius = radius_of_circle;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius_of_circle){
        this.radius = radius_of_circle;
    }

    public void setColor(String color_of_circle){
        this.color = color_of_circle;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

    public String toString(){
        return "Circle[radius=" + getRadius() + ",color='" + getColor() +"']";
    }

}
