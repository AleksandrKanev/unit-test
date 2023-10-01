package seminars.first.hw;

import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getSortedListProducts() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getCost() > products.get(j).getCost()){
                    Product tmpProduct = products.get(j);
                    products.set(j, products.get(i));
                    products.set(i, tmpProduct);
                }
            }

        }
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        Product productMaxCost = new Product();
        for (Product p:products) {
            if(p.getCost()>productMaxCost.getCost()){
                productMaxCost = p;
            }
        }
        return productMaxCost;
    }
}