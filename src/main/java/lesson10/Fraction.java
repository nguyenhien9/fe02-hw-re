package lesson10;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException();

        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // simplify fraction by divide numerator and denominator by gcd
    public void simplify() {
        int gcd = gcd(numerator, denominator);
        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // add 2 fraction
    public Fraction add(Fraction other) {
        int num, den;
        if (this.denominator == other.denominator) {
            num = this.numerator + other.numerator;
            den = this.denominator;
        } else {
            num = this.numerator * other.denominator + this.denominator * other.numerator;
            den = this.denominator * other.denominator;
        }
        return new Fraction(num, den);
    }

    // subtract 2 fraction
    public Fraction subtract(Fraction other) {
        int num, den;
        if (this.denominator == other.denominator) {
            num = this.numerator - other.numerator;
            den = this.denominator;
        } else {
            num = this.numerator * other.denominator - this.denominator * other.numerator;
            den = this.denominator * other.denominator;
        }
        return new Fraction(num, den);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction divide(Fraction other) {
        if (other.denominator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }


}
