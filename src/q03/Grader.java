import java.io.*;

public class Grader {

    static String[][] TESTS = {
        {
            "7\napple\nbanana\napple\ncherry\nbanana\napple\ncherry",
            "apple: 3\nbanana: 2\ncherry: 2"
        },
        {
            "4\ncat\ndog\ncat\nbird",
            "bird: 1\ncat: 2\ndog: 1"
        },
        {
            "3\njava\njava\njava",
            "java: 3"
        },
        {
            "5\nzebra\nant\nmango\nant\nzebra",
            "ant: 2\nmango: 1\nzebra: 2"
        },
    };

    static String run(String input) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "src/q03", "Main");
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
        System.out.println("=== Q03: Word Frequency (TreeMap) ===");
        for (int i = 0; i < TESTS.length; i++) {
            String actual   = run(TESTS[i][0]).replaceAll("\r\n", "\n").strip();
            String expected = TESTS[i][1].strip();
            boolean ok = actual.equals(expected);
            if (ok) { passed++; System.out.printf("  ✅ Test %d passed%n", i+1); }
            else {
                System.out.printf("  ❌ Test %d FAILED%n", i+1);
                System.out.println("     Expected:\n" + expected);
                System.out.println("     Got:\n" + actual);
            }
        }
        System.out.printf("  Score: %d/%d%n", passed, TESTS.length);
        if (passed < TESTS.length) System.exit(1);
    }
}
