package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double StockPrice() {
        return price*quantity;
    }

    public void  AddProduct(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProduct(int quantity) {
        this.quantity -= quantity;
    }

    public void ShowProducts() {
        System.out.println("Estoque de " + name + ": " + quantity + "und - R$" + price);
    }
}
