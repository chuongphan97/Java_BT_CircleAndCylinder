public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public Cylinder(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.getArea() * this.height * 3/4;
    }
    public String toString(){
        return "A Cylinder have volume = " + this.getVolume();
    }
}
