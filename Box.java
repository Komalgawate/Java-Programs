
public class Box
{
        double length;
        double width;
        double height;
       public Box(double l, double w, double h) {
           length = l;
           width = w;
           height = h;
       }
       public double calculateVolume() {
           return length * width * height;
       } 
       public void displayBox() {
           System.out.println("Dimensions of the box:");
           System.out.println("Length: " + length);
           System.out.println("Width: " + width);
           System.out.println("Height: " + height);
           System.out.println("Volume: " + calculateVolume());    
       } 
       public static void main(String[] args) {
           Box b1 = new Box(7.0, 4.0, 9.0);
           b1.displayBox();      
       }
   }

    