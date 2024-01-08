package br.com.estoqueTec.stock;

import br.com.estoqueTec.category.Category;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Stock {
    private Set<Category> stock = new LinkedHashSet<>();

    public void addStock(Category category) {

        if(category == null){
            throw new IllegalArgumentException
                    ("A categoria a ser adicionada ao estoque não pode ser nula");
        }
        stock.add(category);
    }

    public Set<Category> getStock() {
        return Collections.unmodifiableSet(estoque);
    }

    //remoção

    // metudo para buscar produtos ou categorias com base em critérios específicos, como nome, preço ou quanteda

}
