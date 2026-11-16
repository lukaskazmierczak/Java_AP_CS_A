package assignments.ch5.section02;
/*  ANSWER QUESTION HERE

 */
public class Student_Mod {

    private String FirstName;
    private String LastName;
    private double Test1;
    private double Test2;
    private double Test3;
    private double Test4;

    // Constructor

    /**
     * Constructor that takes the first and last name of the student
     * @param firstName Student First Name
     * @param lastName  Student Last Name
     */
    public Student_Mod(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
        Test1 = 0;
        Test2 = 0;
        Test3 = 0;
        Test4 = 0;
    }

    /**
     * Creates an empty student with no first or last name
     */
    public Student_Mod() {
        FirstName = "";
        LastName = "";
        Test1 = 0;
        Test2 = 0;
        Test3 = 0;
        Test4 = 0;
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
        if (testNum == 1)
            return Test1;
        else if (testNum == 2)
            return Test2;
        else if (testNum == 3)
            return Test3;
        else
            return Test4;
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
        if (testNum == 1)
            Test1 = testScore;
        else if (testNum == 2)
            Test2 = testScore;
        else if (testNum == 3){
            Test3 = testScore;
        }
        else{
            Test4 = testScore;
        }
    }


    // Memeber Functions

    /**
     * Calculates the average of the 3 test scores
     * @return  average
     */
    public double getAverage() {
        double sum = Test1 + Test2 + Test3 + Test4;
        return sum / 4.0;
    }

    public double getAverageWithoutLowest() {
        double sum = Test1 + Test2 + Test3 + Test4;
        sum = sum - getLowestScore();
        return sum / 3.0;
    }

    public void copyFrom(Student_Mod student){
        Test1 = student.getTest(1);
        Test2 = student.getTest(2);
        Test3 = student.getTest(3);
        Test4 = student.getTest(4);




    }
    /**
     * returns the highest of the 3 test scores
     * @return  highest test score
     */
    public double getHighScore() {
        double highScore = Test1;
        if (Test2 > highScore)
            highScore = Test2;
        if (Test3 > highScore)
            highScore = Test3;
        if (Test4 > highScore)
            highScore = Test4;

        return highScore;
    }

    public double getLowestScore() {
        double lowScore = Test1;
        if (Test2 < lowScore)
            lowScore = Test2;
        if (Test3 < lowScore)
            lowScore = Test3;
        if (Test4 < lowScore)
            lowScore = Test4;

        return lowScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Test1=" + Test1 +
                ", Test2=" + Test2 +
                ", Test3=" + Test3 +
                ", Test4=" + Test4 +
                '}';
    }
}