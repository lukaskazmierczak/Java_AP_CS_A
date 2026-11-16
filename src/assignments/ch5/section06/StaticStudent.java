package assignments.ch5.section06;

public class StaticStudent {

    private String FirstName;
    private String LastName;
    private double Test1;
    private double Test2;
    private double Test3;

    // Constructor

    /**
     * Constructor that takes the first and last name of the student
     * @param firstName Student First Name
     * @param lastName  Student Last Name
     */
    public StaticStudent(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
        Test1 = 0;
        Test2 = 0;
        Test3 = 0;
    }

    /**
     * Creates an empty student with no first or last name
     */
    public StaticStudent() {
        FirstName = "";
        LastName = "";
        Test1 = 0;
        Test2 = 0;
        Test3 = 0;
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
        else
            return Test3;
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
        else
            Test3 = testScore;
    }

    // Memeber Functions

    /**
     * Calculates the average of the 3 test scores
     * @return  average
     */
    public double getAverage() {
        double sum = Test1 + Test2 + Test3;
        return sum / 3.0;
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

        return highScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Test1=" + Test1 +
                ", Test2=" + Test2 +
                ", Test3=" + Test3 +
                '}';
    }

    // STATIC METHODS
    public static StaticStudent randomStudent() {
        String[] firsts = {"Michael","Christopher","Jessica","Matthew","Ashley","Jennifer","Joshua","Amanda","Daniel","David","James","Robert","John","Joseph","Andrew","Ryan","Brandon","Jason","Justin","Sarah","William","Jonathan","Stephanie","Brian","Nicole","Nicholas","Anthony","Heather","Eric","Elizabeth","Adam","Megan","Melissa","Kevin","Steven","Thomas","Timothy","Christina","Kyle","Rachel","Laura","Lauren","Amber","Brittany","Danielle","Richard","Kimberly","Jeffrey","Amy","Crystal","Michelle","Tiffany","Jeremy","Benjamin","Mark","Emily","Aaron","Charles","Rebecca","Jacob","Stephen","Patrick","Sean","Erin","Zachary","Jamie","Kelly","Samantha","Nathan","Sara","Dustin","Paul","Angela","Tyler","Scott","Katherine","Andrea","Gregory","Erica","Mary","Travis","Lisa","Kenneth","Bryan","Lindsey","Kristen","Jose","Alexander","Jesse","Katie","Lindsay","Shannon","Vanessa","Courtney","Christine","Alicia","Cody","Allison","Bradley","Samuel","Shawn","April","Derek","Kathryn","Kristin","Chad","Jenna","Tara","Maria","Krystal","Jared","Anna","Edward","Julie","Peter","Holly","Marcus","Kristina","Natalie","Jordan","Victoria","Jacqueline","Corey","Keith","Monica","Juan","Donald","Cassandra","Meghan","Joel","Shane","Phillip","Patricia","Brett","Ronald","Catherine","George","Antonio","Cynthia","Stacy","Kathleen","Raymond","Carlos","Brandi","Douglas","Nathaniel","Ian","Craig","Brandy","Alex","Valerie","Veronica","Cory","Whitney","Gary","Derrick","Philip","Luis","Diana","Chelsea","Leslie","Caitlin","Leah","Natasha","Erika","Casey","Latoya","Erik","Dana","Victor","Brent","Dominique","Frank","Brittney","Evan","Gabriel","Julia","Candice","Karen","Melanie","Adrian","Stacey","Margaret","Sheena","Wesley","Vincent","Alexandra","Katrina","Bethany","Nichole","Larry","Jeffery","Curtis","Carrie","Todd","Blake","Christian","Randy","Dennis","Alison"};
        String[] lasts = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson","White","Harris","Martin","Thompson","Garcia","Martinez","Robinson","Clark","Rodriguez","Lewis","Lee","Walker","Hall","Allen","Young","Hernandez","King","Wright","Lopez","Hill","Scott","Green","Adams","Baker","Gonzalez","Nelson","Carter","Mitchell","Perez","Roberts","Turner","Phillips","Campbell","Parker","Evans","Edwards","Collins","Stewart","Sanchez","Morris","Rogers","Reed","Cook","Morgan","Bell","Murphy","Bailey","Rivera","Cooper","Richardson","Cox","Howard","Ward","Torres","Peterson","Gray","Ramirez","James","Watson","Brooks","Kelly","Sanders","Price","Bennett","Wood","Barnes","Ross","Henderson","Coleman","Jenkins","Perry","Powell","Long","Patterson","Hughes","Flores","Washington","Butler","Simmons","Foster","Gonzales","Bryant","Alexander","Russell","Griffin","Diaz","Hayes","Myers","Ford","Hamilton","Graham","Sullivan","Wallace","Woods","Cole","West","Jordan","Owens","Reynolds","Fisher","Ellis","Harrison","Gibson","Mcdonald","Cruz","Marshall","Ortiz","Gomez","Murray","Freeman","Wells","Webb","Simpson","Stevens","Tucker","Porter","Hunter","Hicks","Crawford","Henry","Boyd","Mason","Morales","Kennedy","Warren","Dixon","Ramos","Reyes","Burns","Gordon","Shaw","Holmes","Rice","Robertson","Hunt","Black","Daniels","Palmer","Mills","Nichols","Grant","Knight","Ferguson","Rose","Stone","Hawkins","Dunn","Perkins","Hudson","Spencer","Gardner","Stephens","Payne","Pierce","Berry","Matthews","Arnold","Wagner","Willis","Ray","Watkins","Olson","Carroll","Duncan","Snyder","Hart","Cunningham","Bradley","Lane","Andrews","Ruiz","Harper","Fox","Riley","Armstrong","Carpenter","Weaver","Greene","Lawrence","Elliott","Chavez","Sims","Austin","Peters","Kelley","Franklin","Lawson"};

        String first = firsts[(int)(Math.random() * firsts.length)];
        String last = lasts[(int)(Math.random() * lasts.length)];

        // Your code goes below...


        return null;  // so it compiles.  fix this.
    }
}