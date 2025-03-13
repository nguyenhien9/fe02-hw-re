package lesson10;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 9);
        Fraction f2 = new Fraction(3, 9);
        System.out.println("f2.add(f1) = " + f2.add(f1));
        System.out.println("f2.subtract(f1) = " + f2.subtract(f1));
        System.out.println("f2.multiply(f1) = " + f2.multiply(f1));
        System.out.println("f2.divide(f1) = " + f2.divide(f1));
    }
}
