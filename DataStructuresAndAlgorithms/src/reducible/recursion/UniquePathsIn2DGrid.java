package reducible.recursion;

import java.util.Scanner;

public class UniquePathsIn2DGrid {
    public static int findUniquePathsInGrid(int n, int m){
        if(n==1 || m==1) return 1;
        return findUniquePathsInGrid(n, m-1) + findUniquePathsInGrid(n-1, m);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers separated by comma: ");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.next().split(",");
        int row = Integer.parseInt(inputs[0]);
        int column = Integer.parseInt(inputs[1]);
        System.out.printf("Number of unique paths in %d,%d grid are %d", row, column, findUniquePathsInGrid(row, column));
    }
}
