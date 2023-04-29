public class Circulo {
    
    private double radius;
    private String color;



    
    public Circulo(double radius, int i, String color) {
        this.radius = radius;
        this.color = color;
    }




    public double getRadius() {
        return radius;
    }




    public String getColor() {
        return color;
    }




    public void setRadius(double radius) {
        this.radius = radius;
    }




    public void setColor(String color) {
        this.color = color;
    }




    @Override
    public String toString() {
        return "Circulo [radius=" + radius + ", color=" + color + "]";
    }

    public double getArea() {
        double area = this.radius*(Math.pow(Math.PI, 2));
        return area;
    }

    public double getCircunferences() {
        return 2*Math.PI*this.radius;
    }

    
}
