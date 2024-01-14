public class School {
    static String subject;

    public static class Classroom {
        private int roomNumber;

        public Classroom(int rmNmbr) {
            this.roomNumber = rmNmbr;
        }

        public void announce() {
            subject = "Maths";
            System.out.println("This is classroom " + roomNumber);
            System.out.println("Subject is " + subject);
        }
    }

    public static void main(String[] args) {
        Classroom classroom1 = new Classroom(101);
        classroom1.announce();
    }
}

// OUTPUT
// 
// This is classroom 101
// Subject is Maths