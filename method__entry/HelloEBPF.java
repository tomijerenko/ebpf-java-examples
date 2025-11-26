public class HelloEBPF {
    public static void main(String[] args) {
	    start(new int[]{1, 2, 3});
    }

    public static void start(int[] a) {
	    TestEBPF e = new TestEBPF();
	    e.zero();
    }

    public static String deadFunction(String text) {
        return "I do not do anything";
    }
}
