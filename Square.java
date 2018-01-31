public class Square extends Shape {
    public double length, width;
    public double computeArea(){
        return area = this.length*this.width;
    }
    public double computePerimeter(){
        return perimeter = 2 * (length + width);
    }
}