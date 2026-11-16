package assignments.ch5.section03;

import java.util.Scanner;


public class Fraction_Kazmierczak_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction(4);
        Fraction c = new Fraction(3,4);
        Fraction d = new Fraction(c);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        d = new Fraction(1, 3);

        Fraction sum = a.add(b);
        Fraction dif = a.subtract(b);
        Fraction pro = a.multiply(b);
        Fraction quo = a.divide(b);

        System.out.println("Operators");
        System.out.println("sum = " + sum);
        System.out.println("dif = " + dif);
        System.out.println("pro = " + pro);
        System.out.println("quo = " + quo);

        System.out.println("Uniary Operators");
        System.out.println("a.reciprocal() = " + a.reciprocal());
        System.out.println("a.asDecimal() = " + a.asDecimal());
        System.out.println("a.asMixedFraction() = " + a.asMixedFraction());

    }
}
