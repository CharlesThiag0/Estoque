package br.com.estoqueTec.product;

public class Product {
    private String name;
    private int amount;
    private double price;
    private int id;
    private static int totalAmount;

    public Product(String name, int amount, double price, int id) {

        if(name == null){
            throw new IllegalArgumentException
                    ("O nome do produto não pode ser nulo ou vazio");
        }
        if(amount < 0 || price <= 0 || id <= 0){
            throw  new IllegalArgumentException
                    ("Quantidade, preço e ID do produto devem ser valores positivos");
        }

        this.name = name;
        this.amount = amount;
        this.price = price;
        this.id = id;
        this.totalAmount += amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void addAmount(int amount) {
        this.amount += amount;
        this.totalAmount += amount;
    }

    public void removeAmount(int amount) {
        this.amount -= amount;
        this.totalAmount += amount;
    }

    @Override
    public String toString() {
        return "Product[" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id=" + id +
                ", totalAmount=" + totalAmount +
                ']';
    }
}
