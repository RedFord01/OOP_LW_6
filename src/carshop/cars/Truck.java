package carshop.cars;

public class Truck extends Car {
    int weight;
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice(double regularPrice) {
        if (weight > 2000)
            return regularPrice - (regularPrice / 10);
        else
            return regularPrice;
    };
};
