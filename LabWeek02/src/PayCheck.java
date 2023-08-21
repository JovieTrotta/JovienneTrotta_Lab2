/**
 * This class represents a Pay Check.
 * The employee has a name, ID, rate, and weekly hours.
 */
public class PayCheck {
    private String employeeName;
    private int employeeID;
    private double payRate;
    private double weeklyHours;

    /**
     * Constructs a Pay Check class and initializes it.
     * Assigns name, rate, and weekly hours.
     * @param employeeName is the full name of the Employee Pay Check.
     * @param employeeID is the Employee ID of the Employee Pay Check.
     * @param payRate is the hourly wages paid to the Employee Pay Check.
     * @param weeklyHours is the hours worked per week for the Employee Pay Check.
     */
    public PayCheck(String employeeName, int employeeID, double payRate, double weeklyHours) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.payRate = payRate;
        this.weeklyHours = weeklyHours;
    }

    /**
     * Get the full name of the Employee Pay Check.
     * @return the full name of the Employee Pay Check.
     */
    public String getEmployeeName() {return this.employeeName;}

    /**
     * Get the Employee ID of the Employee Pay Check.
     * @return the Employee ID of the Employee Pay Check.
     */
    public int getEmployeeID() {return this.employeeID;}

    /**
     * Get the pay rate of the Employee Pay Check.
     * @return the pay rate of the Employee Pay Check.
     */
    public double getPayRate() {return this.payRate;}

    /**
     * Get the weekly hours of the Employee Pay Check.
     * @return the weekly hours of the Employee Pay Check.
     */
    public double getWeeklyHours() {return this.weeklyHours;}

    /**
     * Return the full Pay Check Information.
     * @return the name associated with the Employee Pay Check, the ID associated with the of the Employee Pay Check, the pay rate associated with the Employee Pay Check, the weekly hours associated with the Employee Pay Check, and the weekly pay associated with the Employee Pay Check.
     */
    public String toString(){
        String str;
        str = "Employee Name: " + this.employeeName + "\n" + "Employee ID: " + this.employeeID + "\n";
        str = str + String.format("Employee Rate: $%.2f", this.payRate) + "/hour\n";
        str = str + String.format("Employee Hours: %.2f", this.weeklyHours) + "\n";
        str = str + String.format("Employee Pay: $%.2f", this.getTotalPay()) + "\n";
        return str;
    }

    /**
     * Calculates and returns the full pay amount for the week.
     * @return the full pay amount for the week
     */
    public double getTotalPay(){
        if (this.weeklyHours > 40.0) {
            double totalPay = (40.0 + ((this.weeklyHours - 40.0) * 1.5)) * this.payRate;
            return totalPay;
        }
        double totalPay = this.payRate * this.weeklyHours;
        return totalPay;
    }

}
