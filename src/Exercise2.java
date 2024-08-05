

public class Exercise2 {

    static String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    //2.1 - Create an array and initialize it with the days of the week
    //2.1.1 - Use System.out.print() to print the amount of items in the array
    //2.1.2 - Print the fourth day in the array
    public static void main(String[] args) {
        System.out.println(daysOfWeek.length);
        int i = 0;
        for (String v : daysOfWeek) {
            System.out.println(v);
                    i++;
            if (i == 4){
                System.out.println(v + " this is the fourth day of the week");
            }
        }

        Exercise6.withoutInstance();
    }
}
