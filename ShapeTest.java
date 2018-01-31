public class ShapeTest {
    public static void main (String [] args){
        Square emma = new Square ();
        emma.name = "Square";
        emma.sides = 4;
        emma.length = 3.5;
        emma.width = 2.6;
        emma.computeArea();
        emma.computePerimeter();
        System.out.println(emma.perimeter);
    }
}