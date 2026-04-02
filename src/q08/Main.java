import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // print numbers 1 to n alternately

        // TODO: Use TWO threads to print numbers 1 to n in order
        //       Thread 1 (OddThread)  prints odd  numbers: 1, 3, 5, ...
        //       Thread 2 (EvenThread) prints even numbers: 2, 4, 6, ...
        //
        //       Use a shared object with wait() and notify() to coordinate
        //       Output must be EXACTLY in order: 1, 2, 3, 4, ... n
        //       Each number on its own line
        //
        //       Use a shared Printer class with:
        //         synchronized void printOdd()  — prints odd, notifies even
        //         synchronized void printEven() — prints even, notifies odd
        //
        // Sample Input:  6
        // Sample Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6

    }
}
