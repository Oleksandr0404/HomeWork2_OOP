package curs.curs;

public class Fraction {
    private long numerator;//чисельник
    private short denominator;//знаменник

    public Fraction() {
    }

    public Fraction(long numerator, short denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public short getDenominator() {
        return denominator;
    }

    public void setDenominator(short denominator) {
        if (denominator == 0) {
            System.out.println("Can't be divided by zero.\nDenominator = 1");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public Fraction add(Fraction fraction) {
        long resultNum = this.numerator * fraction.getDenominator() + this.denominator * fraction.getNumerator();
        short resultDen = (short) (this.denominator * fraction.getDenominator());

        return new Fraction(resultNum, resultDen);
    }

    public Fraction sub(Fraction fraction) {
        long resultNum = this.numerator * fraction.getDenominator() - this.denominator * fraction.getNumerator();
        short resultDen = (short) (this.denominator * fraction.getDenominator());

        return new Fraction(resultNum, resultDen);
    }

    public Fraction mul(Fraction fraction) {
        long resultNum = this.numerator * fraction.getNumerator();
        short resultDen = (short) (this.denominator * fraction.getDenominator());

        return new Fraction(resultNum, resultDen);
    }

    public Fraction div(Fraction fraction) {
        long resultNum = this.numerator * fraction.getDenominator();
        short resultDen = (short) (this.denominator * fraction.getNumerator());
        return new Fraction(resultNum, resultDen);
    }

    public boolean isEquals(Fraction fraction) {
        return this.denominator == fraction.getDenominator() && this.numerator == fraction.getNumerator();
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
