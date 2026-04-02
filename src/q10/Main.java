import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of students

        // TODO: Mini Student Report System using full OOP + Collections + Streams
        //
        //       Step 1 — Create class Student (inside Main.java is fine):
        //                 Fields: name (String), rollNo (int), marks (int)
        //                 Constructor: Student(int rollNo, String name, int marks)
        //                 Method getGrade():
        //                   marks >= 90 → "A"
        //                   marks >= 75 → "B"
        //                   marks >= 60 → "C"
        //                   marks >= 45 → "D"
        //                   else        → "F"
        //                 Override toString(): "<rollNo> <n> <marks> <grade>"
        //
        //       Step 2 — Read n students: rollNo name marks
        //
        //       Step 3 — Using Streams/Collections, print the following:
        //
        //         Line 1: "Topper: <n>"            — student with highest marks
        //         Line 2: "Average: <X.X>"          — average marks (1 decimal)
        //         Line 3: "Pass: <count>"            — students with marks >= 45
        //         Line 4: "Fail: <count>"            — students with marks < 45
        //         Line 5 onwards: all students sorted by marks DESC, one per line
        //                         format: toString() of each student
        //
        // Sample Input:
        // 4
        // 1 Rahul 88
        // 2 Priya 95
        // 3 Amit 42
        // 4 Sneha 73
        //
        // Sample Output:
        // Topper: Priya
        // Average: 74.5
        // Pass: 3
        // Fail: 1
        // 2 Priya 95 A
        // 1 Rahul 88 B
        // 4 Sneha 73 C
        // 3 Amit 42 F

    }
}
