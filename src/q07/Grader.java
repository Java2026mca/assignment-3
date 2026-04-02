import java.io.*;

public class Grader {

    static String[][] TESTS = {
        {
            "3\nHello World\nJava is fun\nMCA students",
            "Lines written: 3\nLines read: 3\nMatch: true\n1: Hello World\n2: Java is fun\n3: MCA students"
        },
        {
            "1\nOnly one line",
            "Lines written: 1\nLines read: 1\nMatch: true\n1: Only one line"
        },
        {
            "4\nalpha\nbeta\ngamma\ndelta",
            "Lines written: 4\nLines read: 4\nMatch: true\n1: alpha\n2: beta\n3: gamma\n4: delta"
        },
    };

    static String run(String input) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "src/q07", "Main");
        pb.directory(new File("src/q07"));
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
        System.out.println("=== Q07: File Read/Write ===");
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
