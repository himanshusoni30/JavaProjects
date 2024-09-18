package reducible.recursion;

import java.util.Scanner;

public class SumOfNumbers {
    public static int sum(int n){
        if(n==0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Input a non-negative number greater than 0: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("Sum of non-negative %d numbers = %d",number, sum(number));
    }
}
