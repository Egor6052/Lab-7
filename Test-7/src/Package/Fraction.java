package Package;

public class Fraction {
    static double a1;
    static double a2;
    static double a3;
    static double b1;
    static double b2;
    static double b3;

    public Fraction(double a1, double a2, double a3, double b1, double b2, double b3) {
        Fraction.a1 = a1;
        Fraction.a2 = a2;
        Fraction.a3 = a3;
        Fraction.b1 = b1;
        Fraction.b2 = b2;
        Fraction.b3 = b3;
    }

    public static double setA1(double a1) {
        return Fraction.a1 = a1;
    }

    public static double setA2(double a2) {
        return Fraction.a2 = a2;
    }

    public static double setA3(double a3) {
        return Fraction.a3 = a3;
    }

    public static double setB1(double b1) {
        return Fraction.b1 = b1;
    }

    public static double setB2(double b2) {
        return Fraction.b2 = b2;
    }

    public static double setB3(double b3) {
        return Fraction.b3 = b3;
    }

    public static double getA1() {
        return a1;
    }

    public static double getA2() {
        return a2;
    }

    public static double getA3() {
        return a3;
    }

    public static double getB1() {
        return b1;
    }

    public static double getB2() {
        return b2;
    }

    public static double getB3() {
        return b3;
    }

    //-------------------------------------------

    public static double R() {
        return (a1 / b1 + a2 / b2) * (a1 / b1 - a3 / b3);
    }

    public static double R1() {
        return 1 / (a1 / b1 + a2 / b2) * (a1 / b1 - a3 / b3);
    }

    @Override
    public String toString() {
        return "R = " + Correct.formatDouble(R()) + "\n" +
                "1/R = " + Correct.formatDouble(R1()) + "\n\n\n";
    }
}
