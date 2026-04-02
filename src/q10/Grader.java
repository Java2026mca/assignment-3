import java.io.*;

public class Grader {

    static String[][] TESTS = {
        {
            "4\n1 Rahul 88\n2 Priya 95\n3 Amit 42\n4 Sneha 73",
            "Topper: Priya\nAverage: 74.5\nPass: 3\nFail: 1\n2 Priya 95 A\n1 Rahul 88 B\n4 Sneha 73 C\n3 Amit 42 F"
        },
        {
            "3\n1 Aakash 90\n2 Meena 90\n3 Ravi 60",
            "Topper: Aakash\nAverage: 80.0\nPass: 3\nFail: 0\n1 Aakash 90 A\n2 Meena 90 A\n3 Ravi 60 C"
        },
        {
            "2\n1 A 30\n2 B 20",
            "Topper: A\nAverage: 25.0\nPass: 0\nFail: 2\n1 A 30 F\n2 B 20 F"
        },
        {
            "1\n1 Solo 75",
            "Topper: Solo\nAverage: 75.0\nPass: 1\nFail: 0\n1 Solo 75 B"
        },
    };

    static String run(String input) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "src/q10", "Main");
        pb.redirectErrorStream(true);
        Process p = pb.start();
        p.getOutputStream().write((input + "\n").getBytes());
        p.getOutputStream().flush();
        p.getOutputStream().close();
        String out = new String(p.getInputStream().readAllBytes()).stripTrailing();
        p.waitFor();
        return out;
    }

    public static void main(String[] args) throws Exception {
        int passed = 0;
        System.out.println("=== Q10: Student Report System ===");
        for (int i = 0; i < TESTS.length; i++) {
            String actual   = run(TESTS[i][0]).replaceAll("\r\n", "\n").strip();
            String expected = TESTS[i][1].strip();
            boolean ok = actual.equals(expected);
            if (ok) { passed++; System.out.printf("  ✅ Test %d passed%n", i+1); }
            else {
                System.out.printf("  ❌ Test %d FAILED%n", i+1);
                System.out.println("     Expected:\n" + expected);
                System.out.println("     Got:\n"      + actual);
            }
        }
        System.out.printf("  Score: %d/%d%n", passed, TESTS.length);
        if (passed < TESTS.length) System.exit(1);
    }
}
