import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.print("Nhập bán kính hình tròn 1: ");
        number = scanner.nextDouble();
        System.out.println("Hình tròn 1");
        Circle circle = new Circle();
        circle.setRadius(number);
        System.out.println("Bán kính hình tròn 1: " + circle.getRadius());
        System.out.println("Diện  tích hình tròn 1: " + circle.getArea());

        System.out.println("Hình tròn 2");
        System.out.println("Bán kình hình tròn 2 là: 3");
        Circle circle1 = new Circle(3);
        System.out.println("Diện tích hình tròn 2: " + circle1.getArea());
    }

}
