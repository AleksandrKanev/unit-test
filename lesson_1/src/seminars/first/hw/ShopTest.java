package seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        Product product1 = new Product(10, "1");
        Product product2 = new Product(8, "2");
        Product product3 = new Product(7, "3");
        List<Product> list = new ArrayList<>();
        list.add(product2);
        list.add(product1);
        list.add(product3);
        Shop shop = new Shop();
        shop.setProducts(list);
//        for (Product p: shop.getProducts()) {
//            System.out.println(p.getCost() +" "+ p.getTitle());
//        }
//        shop.getSortedListProducts();
//        for (Product p: shop.getProducts()) {
//            System.out.println(p.getCost() +" "+ p.getTitle());
//        }
//        System.out.println(shop.getMostExpensiveProduct().getCost());
//      Проверяет, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
        assertThat(shop.getProducts()).isEqualTo(list);

//      Проверяет, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.getSortedListProducts().get(2)).isEqualTo(product1);

//      Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product1);

    }


}




