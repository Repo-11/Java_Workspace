//https://practice.geeksforgeeks.org/problems/202d95ecdeec659401edc63dd952b1d37b989ab8/1

import java.util.ArrayList;
// import java.util.Arrays;

public class GeekNum{
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 4);
        // list.add(1, 1);
        // list.add(2, 2);
        // list.add(3, 3);
        int N = 6, K = 1, sum = 0, m = 0, n = 0, i, imp;

        for (i = 0; i < K; i++)
            sum += list.get(i);

        for (i = K - 1; i < N - 1; i++) {
            imp = sum - m;
            list.add(imp);
            sum += list.get(i + 1);
            m += list.get(n++);
        }
        System.out.println(list.get(N - 1));
    }
}