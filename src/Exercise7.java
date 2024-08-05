public class Exercise7 {
    //Model a car, create and Instance of it, pass it so that sout will print its properties
    String make;
    String model;
    int miles;
    int year;

    public Exercise7(String make, String model, int miles, int year) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.year = year;
    }

    @Override
    public String toString() {
        return "This car was made by " + make + ", specifically the " + model  +", it was made in " + year + ", and has " + miles  +" miles.";
    }

    public static void main(String[] args) {
        Exercise7 mycar = new Exercise7("Honda", "Pilot", 89000, 2005);
        System.out.println(mycar );
    }
}
