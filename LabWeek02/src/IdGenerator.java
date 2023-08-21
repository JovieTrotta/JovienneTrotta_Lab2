/**
 * This class represents an ID number.
 * It creates an ID number and sets it to 1.
 */
public class IdGenerator {
    private static int id = 1;

    /**
     * Creates a method to generate a new ID number.
     * Every time the method is run, the ID number increases by one.
     * @return the new ID number for each Employee object.
     */
    public static int generateNewId() {
        return id++;
    }

}
