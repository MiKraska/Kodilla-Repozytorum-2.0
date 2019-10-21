package com.kodilla.good.patterns.challenges.food2door;

public class TestSupplier implements Supplier {

    private String name;
    private String address;
    private String product;

    TestSupplier(String name, String address, String product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    public boolean process(Order order) {
        System.out.println("Supplier: " + order.getSupplier().getName());
        System.out.println("Address: " + order.getSupplier().getAddress());
        System.out.println("Product type: " + order.getSupplier().getProduct());
        System.out.println("Quantity: " + order.getQuantity());
        return true;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestSupplier that = (TestSupplier) o;

        if (!name.equals(that.name)) return false;
        if (!address.equals(that.address)) return false;
        return product.equals(that.product);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + product.hashCode();
        return result;
    }

}