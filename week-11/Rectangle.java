public class Rectangle extends Shape implements Drawable {
    double length;
    double breadth;
    
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double calculateArea(){
        return length * breadth;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2 * (length + breadth);
    }
    
    @Override
    public void Draw(){
        System.out.println("Drawing Rectangle: " + length + "x" + breadth);
    }
}