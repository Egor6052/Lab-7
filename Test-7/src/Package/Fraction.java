package Package;

public class Fraction {
    static double x1;
    static double x2;
    static double x3;

    public Fraction(final double x1, final double x2, final double x3) {
        this.setX1(x1);
        this.setX2(x2);
        this.setX3(x3);
    }

    public void setX1(double x1) {
        Fraction.x1 = x1;
    }

    public void setX2(double x2) {
        Fraction.x2 = x2;
    }

    public void setX3(double x3) {
        Fraction.x3 = x3;
    }

    public static double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }
    //-------------------------------------------

    public static double R(Fraction PointA, Fraction PointB) {
        return (PointA.getX1() / PointB.getX1() + PointA.getX2() / PointB.getX2()) * (PointA.getX1() / PointB.getX1() - PointA.getX3() / PointB.getX3());
    }

    public static double R1(Fraction PointA, Fraction PointB) {
        return 1 / (PointA.getX1() / PointB.getX1() + PointA.getX2() / PointB.getX2()) * (PointA.getX1() / PointB.getX1() - PointA.getX3() / PointB.getX3());
    }

    @Override
    public String toString() {
        return "R = " + Correct.formatDouble(R()) + "\n" +
                "1/R = " + Correct.formatDouble(R1()) + "\n\n\n";
    }
}
