public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7, "White", "Black");
        Shape rectangle = new Rectangle(4, 9, "Red", "Orange");
        Shape triangle = new Triangle(13, 6, 2, "Yellow", "Green");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.area());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}
