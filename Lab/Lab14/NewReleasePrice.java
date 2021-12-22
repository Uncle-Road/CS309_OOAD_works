public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        result += daysRented * 3;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented>1){
            return 2;
        }
        return 1;
    }
}
