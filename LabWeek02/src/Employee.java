/**
 * This class represents an Employee.
 * The employee has a name, rate, ID, and weekly hours.
 */
public class Employee {
    private String employeeName;
    private int employeeID;
    private double payRate;
    private double weeklyHours;

    /**
     * Constructs an Employee class and initializes it.
     * Assigns name, rate, ID, and weekly hours.
     * @param employeeName is the full name of the Employee.
     * @param payRate is the hourly wages paid to the Employee.
     */
    public Employee(String employeeName, double payRate) {
        this.employeeName = employeeName;
        this.employeeID = IdGenerator.generateNewId();
        this.payRate = payRate;
        if (this.payRate < 14.0) {
            throw new IllegalArgumentException("Hourly wage cannot be below $14.00.");
        }
        this.weeklyHours = 0;
    }

    /**
     * Get the full name of the Employee.
     * @return the full name of the Employee.
     */
    public String getEmployeeName() {return this.employeeName;}

    /**
     * Get the ID number of the Employee.
     * @return the ID number of the Employee.
     */
    public int getEmployeeID() {return this.employeeID;}

    /**
     * Get the pay rate of the Employee.
     * @return the pay rate of the Employee.
     */
    public double getPayRate() {return this.payRate;}

    /**
     * Get the weekly hours of the Employee.
     * @return the weekly hours of the Employee.
     */
    public double getWeeklyHours() {return this.weeklyHours;}

    /**
     * Return the full Employee Information.
     * @return the name of the Employee, the ID number of the Employee, the pay rate of the Employee, and the weekly hours of the Employee.
     */
    public String toString(){
        String str;
        str = "Employee Name: " + this.employeeName + "\n" + "Employee ID: " + this.employeeID + "\n";
        str = str + String.format("Employee Hours: %.2f", this.weeklyHours) + "\n";
        str = str + String.format("Employee Rate: %.2f", this.payRate) + "\n";
        return str;
    }

    /**
     * Adds additional hours to the existing weekly hours.
     * @param additionalHours to be added to the total.
     * @return the new total weekly hours.
     */
    public double addHoursWorked(double additionalHours) throws IllegalArgumentException {
        if (additionalHours < 0) {
            throw new IllegalArgumentException("Hours must be a positive number.");
        }
        if (additionalHours > 100) {
            throw new IllegalArgumentException("Hours cannot exceed 100.");
        }
        this.weeklyHours = additionalHours + this.weeklyHours;
        return this.weeklyHours;
    }

    /**
     * Resets weekly hours to 0.
     * @return the new total weekly hours.
     */
    public double resetHoursWorked(){
        this.weeklyHours = 0;
        return this.weeklyHours;
    }

    /**
     * Creates a Paycheck object that is initialized to the current Employee (name, rate, hours).
     * @return a new Paycheck object.
     * Resets weeklyHours to 0.
     */
    public PayCheck getWeeklyCheck(){
        PayCheck thisWeeksPay =  new PayCheck(this.employeeName, this.employeeID,this.payRate, this.weeklyHours);
        this.resetHoursWorked();
        return thisWeeksPay;
    }

}
