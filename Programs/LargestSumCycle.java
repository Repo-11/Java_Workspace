import java.util.Scanner;

public class LargestSumCycle {

    public static int findLargestSumCycle(int[] edge) {
        int N = edge.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            int currentSum = dfs(edge, i, i, visited);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    private static int dfs(int[] edge, int start, int current, boolean[] visited) {
        if (visited[current]) {
            return 0;
        }

        visited[current] = true;
        int next = edge[current];
        int currentSum = dfs(edge, start, next, visited);

        visited[current] = false; // Backtrack

        return currentSum + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cells (N):");
        int N = scanner.nextInt();

        int[] edge = new int[N];
        System.out.println("Enter the list of N values for the edge array:");
        for (int i = 0; i < N; i++) {
            edge[i] = scanner.nextInt();
        }

        int result = findLargestSumCycle(edge);
        System.out.println("Largest Sum Cycle Length: " + result);

        scanner.close();
    }
}
