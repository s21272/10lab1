public class Rectangle implements Figure {

    double sideA;
    double sideB;

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area; }

    @Override
    public String getType() {
        String Type = "Rectangle";
        return Type; }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * sideA + 2 * sideB;
        return perimeter; }

        public Rectangle(double sideA,
                     double sideB) {
        this.sideA = sideA;
        this.sideB = sideB; }
}
