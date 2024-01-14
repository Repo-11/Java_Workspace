public class OuterClass {
    private int outerVar = 5;

    void test(){
        InnerClass innerObj = new InnerClass();
        innerObj.display();
    }

    public class InnerClass {
        public void display() {
            System.out.println("This is the inner class.");
            System.out.println("Value of outerVar from the outer class: " + outerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.test();
    }
}


// OUTPUT

// This is the inner class.
// Value of outerVar from the outer class: 5