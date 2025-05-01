package model.entites;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Stock {

    HashMap<Integer ,Product> stocks= new HashMap<>();


    public void addStock(Product product){
        System.out.println(product.getName()+"Adcionado no estoque");
        stocks.put(product.getId(), product);
    }

    public void removeStock(int id) {
        Product removed = stocks.remove(id); // Remove e retorna o produto
        if(removed != null) {
            System.out.println(removed.getName() + " foi removido");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado");
        }
    }

    public void increaseQuantity(int id, int quantity) {
        if (stocks.containsKey(id)) {
            Product product = stocks.get(id);
            product.setQuantity(product.getQuantity() + quantity);
        } else {
            System.out.println("Produto nao existe");
        }
    }



    public  Product searchProductid(Integer id){
        return stocks.get(id);
    }

    public Product searchProductName(String name) {
        return stocks.values().stream()
                .filter(p -> name.equalsIgnoreCase(p.getName()))
                .findFirst()
                .orElse(null);
    }


    public void listAllProducts() {
        for (Integer i : stocks.keySet()) {
            Product p = stocks.get(i);
            System.out.println(i + ": " + p.getName() + " | Qtd: " + p.getQuantity());
        }
    }

}



