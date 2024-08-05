public class Exercise11 {
    static String name;
    static int charnum;

    public Exercise11(String name) {
        this.name = name;
    }

    public static int getCharnum(String name) {
        char firstChar = name.charAt(0);
        return (int) firstChar;
    }

    public static void main(String[] args) {

        Exercise11 billy = new Exercise11("billy");

        System.out.println(getCharnum("Billy"));
    }
}
