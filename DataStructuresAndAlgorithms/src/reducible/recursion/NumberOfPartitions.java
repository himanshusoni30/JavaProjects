package reducible.recursion;

import java.util.Scanner;

public class NumberOfPartitions {
    public static int countPartitions(int nObjects, int mPartitions){
        if(nObjects==0) return 1;
        else if(mPartitions==0 || nObjects<0) return 0;
        return countPartitions(nObjects - mPartitions, mPartitions) + countPartitions(nObjects, mPartitions-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers separated by a comma: ");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.next().split(",");
        int nObjects = Integer.parseInt(inputs[0]);
        int mPartitions = Integer.parseInt(inputs[1]);
        System.out.printf("Number of partitions of %d objects using %d partitions: %d",nObjects, mPartitions, countPartitions(nObjects, mPartitions));
    }
}
