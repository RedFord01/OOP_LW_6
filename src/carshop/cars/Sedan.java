package carshop.cars;

public class Sedan extends Car {
    int length;
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice(double regularPrice) {
        if (length > 20)
            return regularPrice - (regularPrice / 20 );
        else
            return regularPrice;
    }
}
