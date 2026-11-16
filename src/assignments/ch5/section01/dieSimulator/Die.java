package assignments.ch5.section01.dieSimulator;
/*  Fill in the blanks.
        Options are:  Field
                      Constructor
                      Setter
                      Getter
                      Class Functionality
                      Override Method
one contructor is for a six sided die, the other has options for how many sides are one the die. most dies have 6 sides.
 */
public class Die {
    int NumberOfSides;  // This is: field
    int Value;          // This is: field

    // This is: constructor
    public Die() {
        NumberOfSides = 6;
        roll();
    }

    // This is: constructor
    public Die(int sideCount) {
        NumberOfSides = sideCount;
        roll();
    }

    // This is: getter
    public int getValue() {
        return Value;
    }

    // This is: class function
    public void roll() {
        Value = (int)(Math.random() * NumberOfSides + 1);
    }

    // This is: class function
    public String toString() {
        return Integer.toString(Value);
    }
}
