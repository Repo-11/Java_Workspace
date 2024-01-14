class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    Rectangle() {
        length = 10;
        breadth = 50;
    }

    Rectangle(double len) {
        length = len;
        breadth = len;
    }

    void area() {
        System.out.println("area of rectangle=" + (length * breadth));
    }

    public static void main(String args[]) {

        System.out.println("Constructor Overloading using rectangle class");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20, 40);
        Rectangle r3 = new Rectangle(30);
        r1.area();
        r2.area();
        r3.area();
    }
}