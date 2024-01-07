package br.com.estoqueTec.stock;

import br.com.estoqueTec.category.Category;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Stock {
    private Set<Category> estoque = new LinkedHashSet<>();

    public void addStock(Category category) {
        estoque.add(category);
    }

    public Set<Category> getEstoque() {
        return Collections.unmodifiableSet(estoque);
    }
}
