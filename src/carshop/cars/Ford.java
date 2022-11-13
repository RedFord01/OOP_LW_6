package carshop.cars;

public class Ford extends Car {
    int year;
    public void setYear(int year) {
        this.year = year;
    }
    int manufacturerDiscount;
    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override
    public double getSalePrice(double regularPrice) {
        return regularPrice - manufacturerDiscount;
    }
}
