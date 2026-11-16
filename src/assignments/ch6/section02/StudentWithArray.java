package assignments.ch6.section02;
/**
 * Created with IntelliJ IDEA.
 * User: JSMITH
 * Date: 10/2/12
 * net.apcs.Student: 1:59 PM
 *
 * Virtual representation of a student. Contains the first name, last name, and 3 test scores.
 */
public class StudentWithArray {

    private String FirstName;
    private String LastName;
    private int scored;
    double[] test = new double[100-scored];

    // Constructor

    /**
     * Constructor that takes the first and last name of the student
     * @param firstName Student First Name
     * @param lastName  Student Last Name
     */
    public StudentWithArray(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
        for(double t : test){
            t = 0;
        }
    }

    /**
     * Creates an empty student with no first or last name
     */
    public StudentWithArray() {
        FirstName = "";
        LastName = "";
        for(double t : test){
            t = 0;
        }
    }

    // Getters

    /**
     * Gets the first name of this student
     * @return  First Name
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Gets the last name of this student
     * @return  Last Name
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Gets a test score from the student's record
     * @param testNum   Which test you would like to get (1, 2, or 3)
     * @return          score the student earned on test <code>testNum</code>
     */
    public double getTest(int testNum) {
        return test[testNum];
    }

    // Setters

    /**
     * Sets the first name of the student
     * @param firstName new first name
     */
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     * Sets the last name of the student
     * @param lastName  new last name
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * Sets one of the test scores for the student.
     * @param testNum   Test score to be set (1, 2, or 3)
     * @param testScore New test score
     */
    public void setTest(int testNum, double testScore) {
        test[testNum] = testScore;
    }
    public void addTest(int testNum, double testScore){
        for(int i = 100-scored; i > testNum; i--){
            test[i] = test[i-1];
        }
        test[testNum] = testScore;
        testNum++;
    }
    // Memeber Functions

    /**
     * Calculates the average of the 3 test scores
     * @return  average
     */
    public double getAverage() {
        double sum = 0;
        for(double t : test){
            sum += t;
        }
        return sum / test.length;
    }

    /**
     * returns the highest of the 3 test scores
     * @return  highest test score
     */
    public double getHighScore() {
        double highScore = test[0];
        for(double t : test){
            if(t > highScore){
                highScore = t;
            }
        }

        return highScore;
    }

    @Override
    public String toString() {
        String print = "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'';
                for(int i = 0; i < 100-scored; i++){
                    print += "Test" + i + " = " + test[i];
                }
        return print;

    }
}