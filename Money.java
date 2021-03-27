package curs.curs;

public class Money {
    private long hryvnya;
    private byte kopick;

    public Money() {
    }

    public Money(long hryvnya, byte kopick) {
        this.hryvnya = hryvnya;
        this.kopick = kopick;
    }

    public long getHryvnya() {

        return hryvnya;
    }

    public void setHryvnya(long hryvnya) {

        this.hryvnya = hryvnya;
    }

    public byte getKopick() {

        return kopick;
    }

    public void setKopick(byte kopick) {
        this.kopick = kopick;
    }

    public Money add(Money money) {
        byte resultKopiyka = (byte) (this.kopick + money.kopick);
        long resultHryvnya = this.hryvnya + money.hryvnya;
        if (resultKopiyka >= 100) {
            resultHryvnya++;
            resultKopiyka = (byte) (resultKopiyka - 100);
        }
        return new Money(resultHryvnya, resultKopiyka);
    }

    public Money sub(Money money) {
        byte resultKopiyka = (byte) (this.kopick - money.kopick);
        long resultHryvnya = this.hryvnya - money.hryvnya;
        if (resultKopiyka < 0) {
            resultHryvnya--;
            resultKopiyka = (byte) (100 + resultKopiyka);
        }
        return new Money(resultHryvnya, resultKopiyka);
    }

    public Money mul(double numberMultiplication) {
        long allkopick = (long) (getAllKopick() * numberMultiplication);
        return convertMoney(allkopick);
    }

    public Money div(double numberDivision) {
        long allkopick = (long) (getAllKopick() / numberDivision);
        return convertMoney(allkopick);
    }

    public double getAllKopick() {
        return this.hryvnya * 100 + this.kopick;
    }

    public Money convertMoney(long allkopick) {
        return new Money((long) (allkopick / 100), (byte) (allkopick % 100));
    }

    public boolean isEquals(Money money) {
        return getAllKopick() == money.getAllKopick();
    }

    public boolean isHighMoney(Money money) {
        return getAllKopick() > money.getAllKopick();
    }

    @Override
    public String toString() {
        if (kopick < 10) {
            return hryvnya +
                    ".0" + kopick;
        } else return hryvnya +
                "," + kopick;
    }
}

