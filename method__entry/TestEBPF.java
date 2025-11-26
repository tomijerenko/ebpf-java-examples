public class TestEBPF {
    public void zero() {
        one(1);
    }

    public String one(int a) {
        two('a');
        return "a";
    }

    public int two(char a) {
        three(true);
        return 1;
    }

    public char three(boolean a) {
        four((byte)1);
        return 'a';
    }

    public boolean four(byte a) {
        return true;
    }

    public String deadFunction(String text) {
        return "I do not do anything";
    }
}
