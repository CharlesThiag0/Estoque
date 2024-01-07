package br.com.estoqueTec.category;

import br.com.estoqueTec.product.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {
    private List<Product> category;
    private HashMap<Integer, LocalDateTime> dateRegistry = new HashMap<>();

    public Category(List<Product> category) {

        if(category == null) {
            throw  new IllegalArgumentException("Categoria não pode ser nula");
        }

        this.category = category;
    }

    public List<Product> getCategory() {
        return Collections.unmodifiableList(category);
    }

    public Map<Integer, LocalDateTime> getDateRegistry() {
        return Collections.unmodifiableMap(dateRegistry);
    }

    public void addProduct(Product product) {
        this.category.add(product);
       this.dateRegistry.put(product.getId(), LocalDateTime.now());
   }

    public LocalDateTime dateSearch(int id) {
        for(Map.Entry<Integer, LocalDateTime> entry: dateRegistry.entrySet()){

            if(entry.getKey().equals(id)){
                return entry.getValue();
            }
        }

        throw new IllegalArgumentException("Numero não existente");
    }
}
