package assignments.ch5.section02;
public class Rectangle_Mod {
    private double Base;
    private double Height;

    public Rectangle_Mod() {
        Base = 1;
        Height = 1;
    }

    public Rectangle_Mod(double num) {
        Base = num;
        Height = num;
    }

    public Rectangle_Mod(double base, double height) {
        Base = base;
        Height = height;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Base=" + Base +
                ", Height=" + Height +
                '}';
    }
    public double area(){
        return Base * Height;
    }

    public double peremeter(){
        return 2 * Base + 2 * Height;
    }

    public Rectangle_Mod makeSquare(){
        return new Rectangle_Mod(Math.sqrt(area()));
    }
}
