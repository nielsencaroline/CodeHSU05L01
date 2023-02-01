import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * Creates a Rectangle object with width and height
     *
     * @param w width of the rectangle
     * @param h height of the rectangle
     */
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public Rectangle (double w){
        this.width = width;
    }

    //accessors

    /**
     *
     * @return the width of the rectangle
     */

    public double getWidth(){
        this.width = width;
        return width;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle.
     *
     * @param newWidth desired width
     */

    public void setWidth(double newWidth){
        width = newWidth;
    }

    //other methods




    //toString method

}