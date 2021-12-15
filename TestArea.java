//using the class to create an object
//this is main class
public class TestArea{
    public static void main(String args []){
        //Creating the object
        Area area = new Area();
        //printing the area and perimeter of an object
        System.out.println("The area of Rectangle is " + area.getArea());//returning area of rectangle
        System.out.println("The perimeter of Rectangle is " + area.getPerimeter());//returning perimeter of rectangle

        //returning the time the object was created
        System.out.println("The object is created on " + area.getDateCreated());
    }
}