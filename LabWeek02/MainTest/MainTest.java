import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the testing class.
 */
public class MainTest {

    /**
     * Creates an Employee object (employeeTest).
     * Creates aa PayCheck object (payCheckTest).
     */
    private Employee employeeTest;
    private PayCheck payCheckTest;
    private PayCheck payCheckTestTwo;

    /**
     * Constructs employeeTest
     * Constructs payCheckTest
     * Constructs payCheckTestTwo
     */
    @Before
    public void setup() {
        this.employeeTest = new Employee("Jane Doe", 18.0);
        this.payCheckTest = new PayCheck("John Doe", 3, 16.0, 40.0);
        this.payCheckTestTwo = new PayCheck("Jim Doe", 3, 16.0, 100.0);
    }

    /**
     * Tests getEmployeeName
     */
    @Test
    public void testName(){
        assertEquals("Jane Doe", this.employeeTest.getEmployeeName());
    }

    /**
     * Tests getEmployeeID
     */
    @Test
    public void testID(){
        assertEquals(5, this.employeeTest.getEmployeeID());
    }

    /**
     * Tests getPayRate
     */
    @Test
    public void testPayRate() {
        assertEquals(18.0, this.employeeTest.getPayRate(), 0.01);
    }

    /**
     * Tests getWeeklyHours
     */
    @Test
    public void testWeeklyHours() {
        assertEquals(0.0, this.employeeTest.getWeeklyHours(), 0.01);
    }

    /**
     * Tests getWeeklyHours
     */
    @Test
    public void testAddHours() {
        this.employeeTest.addHoursWorked(100.00);
        assertEquals(100.00, this.employeeTest.getWeeklyHours(),0.01);
    }

    /**
     * Tests resetHoursWorked
     */
    @Test
    public void testResetHours() {
        this.employeeTest.resetHoursWorked();
        assertEquals(0.0, this.employeeTest.getWeeklyHours(),0.01);
    }

    /**
     * Tests getEmployeeName
     */
    @Test
    public void testCheckName() {
        assertEquals("John Doe", this.payCheckTest.getEmployeeName());
    }

    /**
     * Tests getEmployeeID
     */
    @Test
    public void testCheckID() {
        assertEquals(3, this.payCheckTest.getEmployeeID());
    }

    /**
     * Tests getPayRate
     */
    @Test
    public void testCheckPayRate() {
        assertEquals(16.0, this.payCheckTest.getPayRate(),0.01);
    }

    /**
     * Tests getWeeklyHours
     */
    @Test
    public void testCheckHours() {
        assertEquals(40.0, this.payCheckTest.getWeeklyHours(), 0.01);
    }

    /**
     * Tests getTotalPay when hours are 40 or below
     */
    @Test
    public void testTotalPay() {
        assertEquals(640.0, this.payCheckTest.getTotalPay(), 0.01);
    }

    /**
     * Tests getTotalPay when hours are over 40
     */
    @Test
    public void testTotalPayTwo() {assertEquals(2080.0, this.payCheckTestTwo.getTotalPay(), 0.01);}

}
