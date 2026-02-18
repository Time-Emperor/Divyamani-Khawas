public class Main {
    public static void main(String[] args){
        Rectangle sc = new Rectangle(6, 7);
        System.out.println("Perimeter: " + sc.calculatePerimeter());
        System.out.println("Area: " + sc.calculateArea());
        sc.displayShapeInfo();
        sc.Draw();
    }
}