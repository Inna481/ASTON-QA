interface Shape {
    double area();
    double perimeter();

    default double calculatePerimeter() {
        return perimeter();
    }

    String getFillColor();
    String getBorderColor();
}
