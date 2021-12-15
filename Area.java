//class of the object
//abstraction and encapsulating
public class Area {
    private double length; //private data field length
    private double width; // private data field width
    private double perimeter; // private data field perimeter
    private java.util.Date dateCreated;

    //creating the constructor with parameter
    public Area(){
        length = 3.4;
        width =8.9;
        perimeter=perimeter;
        dateCreated = new java.util.Date();
    }
    //use the data field to create methods
    //returning the length
    public double getLength(){
        return length;
    }
    //returning width
    public double getWidth(){
        return width;
    }
    //calculate the area of the rectangle
    public double getArea(){
        double Area = length * width;
        return Area;
    }
//calculate the perimeter of rectangle
    public double getPerimeter() {
        double perimeter = 2 * (length+width);
        return perimeter;
    }
    //return date
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
}