public class Exercise5 {
    //Write a method that allows any number of parameters without using an array
    public static void anyNumberOfStrings(String ... anyNumberInput) {
        String output = "";
        for (String v : anyNumberInput) {
            System.out.printf(output + v + " ");
        }
    }

    public static void main(String[] args) {
        anyNumberOfStrings("For", "The", "Worthy");
    }
}
