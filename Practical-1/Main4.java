//Create a Rectangle class with length and width. Calculate and display its area and perimeter.


class Rectangle {
    double l;
    double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public void displayArea() {
        System.out.println("Area: " + (l * w));
    }

    public void displayPerimeter() {
        System.out.println("Perimeter: " + 2 * (l + w));
    }
}

public class Main4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(7.5, 4.5);

        System.out.println("Rectangle 1:");
        r1.displayArea();
        r1.displayPerimeter();

        System.out.println("\nRectangle 2:");
        r2.displayArea();
        r2.displayPerimeter();
    }
}
