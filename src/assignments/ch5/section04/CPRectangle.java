package assignments.ch5.section04;

import net.apcs.classes.CoordinatePoint;
import net.apcs.classes.Rectangle;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Good, I am ready for the exam.
 */
public class CPRectangle {

    private static Scanner keyboard = new Scanner(System.in);

    CoordinatePoint topLeft;
    Rectangle rectangle;
    public CPRectangle(){
        int x =(int)(Math.random()*21-10);
        int y =(int)(Math.random()*21-10);
        topLeft = new CoordinatePoint(x, y);
        int w = (int)(Math.random()*6+5);
        int l = (int)(Math.random()*6+5);
        rectangle = new Rectangle(w, l);
    }
    public CPRectangle(int x, int y, int w, int l){
        topLeft = new CoordinatePoint(x, y);
        rectangle = new Rectangle(w, l);
    }
    public CPRectangle(CoordinatePoint point, int w, int l){
        topLeft = new CoordinatePoint(point);
        rectangle = new Rectangle(w, l);
    }
    public CPRectangle(CoordinatePoint point, Rectangle rect){

        topLeft = new CoordinatePoint(point);
        rectangle = new Rectangle(rect.getBase(), rect.getHeight());
    }


    public double getLength(){
        return rectangle.getBase();
    }

    public double getWidth(){
        return rectangle.getHeight();
    }

    public CoordinatePoint getTopLeft(){
        return new CoordinatePoint(topLeft.getX(), topLeft.getY());
    }

    public CoordinatePoint getTopRight(){
        return new CoordinatePoint(topLeft.getX()+rectangle.getBase(), topLeft.getY());
    }

    public CoordinatePoint getBottomLeft(){
        return new CoordinatePoint(topLeft.getX(), topLeft.getY()- rectangle.getHeight());
    }

    public CoordinatePoint getBottomRight(){
        return new CoordinatePoint(topLeft.getX()+rectangle.getBase(), topLeft.getY()- rectangle.getHeight());
    }

    public void setTopLeft(CoordinatePoint topLeft) {
        this.topLeft = new CoordinatePoint(topLeft);
    }
    public void setTopLeft(double x, double y) {
        this.topLeft = new CoordinatePoint(x, y);
    }
    public void setLength(double length){
        rectangle.setHeight(length);
    }
    public void setWidth(double width){
        rectangle.setBase(width);
    }
    public boolean isInside(CoordinatePoint pt){
        if((pt.getX() > topLeft.getX() && pt.getX() < topLeft.getX() + rectangle.getBase()) && (pt.getY() < topLeft.getY() && pt.getY() > topLeft.getY() - rectangle.getHeight())){
            return true;
        }
        else{
            return false;
        }
    }
    public CPRectangle reflectX(){
        CPRectangle x = new CPRectangle((int)topLeft.getX(), (int)((topLeft.getY() * -1) + rectangle.getHeight()), (int)rectangle.getBase(), (int)rectangle.getHeight());
        return x;
    }
    public CPRectangle reflectY(){
        CPRectangle y = new CPRectangle((int)((topLeft.getX() * -1) - rectangle.getBase()), (int)topLeft.getY(), (int)rectangle.getBase(), (int)rectangle.getHeight());
        return y;
    }
    @Override
    public String toString() {
        return "Length: " + rectangle.getHeight() +
                " Width: " + rectangle.getBase() +
                " Top Left: " + "(" + topLeft.getX() + ", " + topLeft.getY() + ")"+ " " +
                "Top Right: " + "(" + (topLeft.getX() + rectangle.getBase()) + ", " + topLeft.getY() + ")" + " " +
                "Bottom Left: " + "(" + topLeft.getX() + ", " + (topLeft.getY() - rectangle.getHeight()) + ")" +
                " Bottom Right: " + "(" + (topLeft.getX() + rectangle.getBase()) + ", " + (topLeft.getY() - rectangle.getHeight()) + ")";
    }
}
