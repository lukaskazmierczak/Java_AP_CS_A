package assignments.ch5.section03;

//I would need to check if the pythagorean theorem is less than, greater than, or equal to c. This would tell me if it was acute, right, or obtuse.
public class Triangle {
    private int a;
    private int b;
    private int c;
    public Triangle(){
        a = 1;
        b = 1;
        c = 1;
    }
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public void setA(int value){
        a = value;
    }
    public void setB(int value){
        b = value;
    }
    public void setC(int value){
        c = value;
    }
    public int perimeter(){
        return a + c + b;
    }
    public double area(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    public String toString(){
        return a + " " + b + " " + c;
    }
}
