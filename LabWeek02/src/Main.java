/**
 * This is the driver class.
 */
public class Main {
    public static void main(String[] args) {
        Employee Jovie = new Employee("Jovienne Trotta", 18);
        Employee JJ = new Employee("JJ Brennan", 14);
        Employee Matt = new Employee("Matt Lombardi", 20);

        System.out.println("Employee 1 Pay Information: ");
        Jovie.addHoursWorked(50);
        System.out.println(Jovie.getWeeklyCheck());

        System.out.println("Employee 2 Pay Information: ");
        JJ.addHoursWorked(40);
        System.out.println(JJ.getWeeklyCheck());

        System.out.println("Employee 3 Pay Information: ");
        Matt.addHoursWorked(20);
        System.out.println(Matt.getWeeklyCheck());


    }
}