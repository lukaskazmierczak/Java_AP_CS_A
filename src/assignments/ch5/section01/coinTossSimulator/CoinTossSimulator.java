package assignments.ch5.section01.coinTossSimulator;

/*  Fill in the blanks.
        Options are:  Field
                      Constructor
                      Setter
                      Getter
                      Class Functionality
                      Override Method

 */
public class CoinTossSimulator {

    private String sideUp;  // This is: Field


    public CoinTossSimulator() {
        // This is: Constructor
        toss();
    }


    public CoinTossSimulator(String sideUp) {
        // This is: Constructor
        this.sideUp = sideUp;
    }


    public String getSideUp() {
        // This is: Getter
        return sideUp;
    }


    public void toss() {
        // This is: Class functionality
        if (Math.random() < .5)
            sideUp = "Heads";
        else
            sideUp = "Tails";
    }
}
