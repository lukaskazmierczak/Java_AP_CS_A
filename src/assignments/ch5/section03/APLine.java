package assignments.ch5.section03;

public class APLine {
    private int a;
    private int b;
    private int c;
    public  APLine(){
        a = 1;
        b = 1;
        c = 0;
    }
    public  APLine(int a, int b, int c){
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
    public double getSlope(){
        return (-1*(double)a/b);
    }
    public boolean isOnLine(int x, int y){
        if((a*x+b*y+c) == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
