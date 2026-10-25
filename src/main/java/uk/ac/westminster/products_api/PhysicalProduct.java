package uk.ac.westminster.products_api;

public class PhysicalProduct extends product{
    private double weightKg;
    private String dimensions;

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

    }
    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
}
