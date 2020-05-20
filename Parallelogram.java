public class Parallelogram implements Figure{

    double baseSide;
    double side;
    double height;

    @Override
    public double getArea() {
        double pArea = height *
                baseSide;
        return pArea; }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type; }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * side +
                2 * baseSide;
        return perimeter; }

    public Parallelogram(double baseSide,
                         double side,
                         double height){

        this.baseSide = baseSide;
        this.side = side;
        this.height = height; }
}