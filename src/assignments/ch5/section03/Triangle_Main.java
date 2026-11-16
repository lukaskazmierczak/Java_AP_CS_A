package assignments.ch5.section03;

public class Triangle_Main {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle(3, 4, 5);

        System.out.println(tri1);
        System.out.println(tri1.perimeter());
        System.out.println(tri1.area());

        System.out.println(tri2);
        System.out.println(tri2.perimeter());
        System.out.println(tri2.area());
    }
}
