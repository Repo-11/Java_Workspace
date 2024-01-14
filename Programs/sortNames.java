public class sortNames {
    void sortName(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] names = {"Mounisha", "Priyanka", "Sumeena", "Chiniwar", "Shreetha"};
        sortNames ob = new sortNames();
        ob.sortName(names);
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
