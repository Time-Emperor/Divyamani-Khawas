public class Circle extends Shape implements Drawable{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public void Draw(){
        System.out.println("Drawing Circle with radius: " + radius);
    }
}