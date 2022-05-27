package Package;

public class Main {
    public static void Task7() {
        System.out.println("Семенов Егор АТ-212, Вариант №7");

        Fraction PointA = new Fraction(Math.random() * 10, Math.random() * 10, Math.random() * 10);
        Fraction PointB = new Fraction(Math.random() * 10, Math.random() * 10, Math.random() * 10);
        System.out.println(PointA);
        System.out.println(PointB);
    }

    public static void main(String[] args) {
        Task7();
    }
}
