package br.com.estoqueTec.category;

import br.com.estoqueTec.product.Product;

import java.util.Collections;
import java.util.List;

public class Category {
    private List<Product> category;

    public Category(List<Product> category) {

        if(category == null) {
            throw  new IllegalArgumentException("Categoria não pode ser nula");
        }

        this.category = category;
    }

    public List<Product> getCategory() {
        return Collections.unmodifiableList(category);
    }

   public void addProduct(Product product) {
        this.category.add(product);
   }
}
