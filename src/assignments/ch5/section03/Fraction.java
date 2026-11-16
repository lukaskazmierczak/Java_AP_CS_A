package assignments.ch5.section03;

import javax.crypto.spec.PSource;

/*  ANSWER QUESTION HERE
you could add another method that would check if the fraction was greater than or less than 1
 */
class Fraction {
    private int Num;
    private int Denom;

    /** Default Constructor
     *  Initialize Num and Demon to appropriate values
     */
    public Fraction() {
        Num = 1;
        Denom = 1;
    }

    /** Whole number Constructor
     *  This will create a Fraction with the value of 5/1.
     * @param num  The value of the numerator
     */
    public Fraction(int num) {
        Num = num;
        Denom = 1;
    }

    /** Initialize both the numerator and denominator
     *
     * @param num  Initialize value of numerator
     * @param denom Initialize value of denominator
     */
    public Fraction(int num, int denom) {
        Num = num;
        Denom = denom;
    }

    /** Copy constructor
     *
     * @param other Initialize the numerator and denominator
     *              using the values inside other
     */
    public Fraction(Fraction other) {
        Num = other.getNum();
        Denom = other.getDenom();
    }

    /**
     * Getter for numerator
     * @return numerator
     */
    public int getNum() {
        return Num;
    }

    /**
     * Setter for numerator
     * @param num new value of the numerator
     */
    public void setNum(int num) {
        Num = num;
    }

    /**
     * Getter for denominator
     * @return Denominator
     */
    public int getDenom() {
        return Denom;
    }

    /**
     * Setter for denominator
     * @param denom  Sets the value of the denominator
     */
    public void setDenom(int denom) {
        Denom = denom;
    }

    /**
     * Multiplies this fraction and the other fraction
     * return a new reduced fraction with the product.
     * Ex. 1/4 * 1/6 will return 1/24
     * Ex. 3/4 * 1/3 will return 4/1
     * @param other Fraction you want to multiply this one by
     * @return new Fraction with the product
     */
    public Fraction multiply(Fraction other) {
        Fraction mult = new Fraction((Num * other.getNum()),(Denom * other.getDenom()));
        return mult;
    }

    /**
     * Divides this fraction and the other fraction
     * return a new reduced fraction with the product.
     * Ex. 1/4 / 1/6 will return 3/2
     * Ex. 3/4 / 1/3 will return 9/4
     * @param other Fraction you want to multiply this one by
     * @return new Fraction with the product
     */
    public Fraction divide(Fraction other) {
        int old = 0;
        Fraction div = new Fraction((Num * other.Denom), (Denom * other.Num));
        for(int i = div.getDenom(); i > 0; i--){
            if((double)div.Num%i==0 && (double)div.Denom%i==0){
                div.Num /= i;
                div.Denom /= i;
            }
        }
        return div;// You will need to change this.  It currently is setup simply so the program compiles.
    }

    /**
     * Adds this fraction and the other fraction
     * return a new reduced fraction with the product.
     * Ex. 1/4 + 1/6 will return 5/12
     * Ex. 3/4 * 1/3 will return 13/12
     * @param other Fraction you want to multiply this one by
     * @return new Fraction with the product
     */
    public Fraction add(Fraction other) {
        Fraction plus = new Fraction((Num * other.Denom), (Denom * other.Denom));
        plus.Num += (other.Num*Denom);
        for(int i = plus.Denom; i > 0; i--){
            if((double)plus.Num%i==0 && (double)plus.Denom%i==0){
                plus.Num /= i;
                plus.Denom /= i;
            }
        }
        return plus;
    }


    /**
     * Subtracts this fraction and the other fraction
     * return a new reduced fraction with the product.
     * Ex. 1/4 - 1/6 will return 1/12
     * Ex. 3/4 - 1/3 will return 5/12
     * @param other Fraction you want to multiply this one by
     * @return new Fraction with the product
     */
    public Fraction subtract(Fraction other) {
        Fraction min = new Fraction((Num * other.Denom), (Denom * other.Denom));
        min.Num -= (other.Num*Denom);
        for(int i = min.Denom; i > 0; i--){
            if((double)min.Num%i==0 && (double)min.Denom%i==0){
                min.Num /= i;
                min.Denom /= i;
            }
        }
        return min;    }

    /**
     * Returns a new Fraction with the value of the
     * reciprocal of this fraction.
     * Ex. 1/4 -> 4/1
     * Ex. 4/5 -> 5/4
     * @return reciprocal
     */
    public Fraction reciprocal() {
        int num = Denom;
        int denom = Num;
        Fraction rec = new Fraction(num, denom);
        return rec;
    }

    /**
     * Decimal representation of the Fraction
     * Ex. 1/4 -> .25
     * Ex. 5/2 -> 2.5
     * Ex. 4/1 -> 4.0
     * @return
     */
    public double asDecimal() {
        return Num/Denom; // You will need to change this.  It currently is setup simply so the program compiles.
    }

    /**
     * String representation of this fraction as a
     * mixed fraction
     * Ex. 1/3 -> 1/3
     * Ex. 4/1 -> 4
     * Ex. 4/3 -> 1 1/3
     * @return string as mixed fraction
     */
    public String asMixedFraction() {
        int whole = 0;
        int num = 0;
        whole = (Num/Denom);
        num = Num - (whole * Denom);
        if(whole == 0){
            return num + "/" + Denom;
        }
        else if(num == 0){
            return whole + " ";
        }
        else{
            return whole + " " + num + "/" + Denom;
        }
    }

    /**
     * returns the Greatest Common Divisor of a and b
     * Used to help reduce fractions
     * @param a
     * @param b
     * @return greatest common divisor
     */
    private int getGCF(int n1, int n2) {
        int rem = 0;
        int gcf = 0;
        do {
            rem = n1 % n2;
            if(rem == 0)
                gcf = n2;
            else {
                n1 = n2;
                n2 = rem;
            }
        } while(rem != 0);
        return gcf;
    }
    private int getGCD(int a, int b){
        int gcd = 1;
        for(int i = 0;i < a; i++){
            if((double)a % i == 0 && (double)b % i == 0){
                gcd = i;
            }
        }
        return 0;
    }

    /**
     * A string representation of this Fraction
     * Ex. 4/3
     * Ex. 1/3
     * Ex. 11/15
     * @return
     */
    @Override
    public String toString() {
        return Num + "/" + Denom; // You will need to change this.  It currently is setup simply so the program compiles.
    }
}
