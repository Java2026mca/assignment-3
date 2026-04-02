import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // TODO: Implement Singleton design pattern for a Counter class
        //       Counter has a private count field starting at 0
        //       Private constructor, static getInstance() method
        //
        //       Operations:
        //         INCREMENT  → count++
        //         DECREMENT  → count-- (but never below 0)
        //         GET        → print current count
        //         RESET      → count = 0
        //
        //       The key test: call getInstance() multiple times —
        //       all calls must return the SAME object (same count state)
        //
        // Sample Input:
        // 6
        // INCREMENT
        // INCREMENT
        // INCREMENT
        // DECREMENT
        // GET
        // RESET
        //
        // Sample Output:
        // 2

    }
}
