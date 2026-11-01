package uk.ac.westminster.products_api;

import java.io.Serializable;

public class PhysicalProduct extends product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

  /*
  *A PhysicalProduct IS-A Product because it is still a product that has a name,id and price
  * A shoppingCart is not a Product because it contains products
   */
    public PhysicalProduct() {

    }
    public PhysicalProduct(Long id,
                           String name,
                           double price,
                           double weightKg,
                           String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;

    }
    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + getWeightKg() + "kg";
    }
    @Override
    public void applyDiscount(double rate) {

        double capped = Math.min(rate, 0.20);

        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
