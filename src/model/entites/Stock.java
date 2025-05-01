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

    public  void RemoveStock(int id){
        for(Integer i: stocks.keySet() ){
            if(stocks.equals(i)){
                stocks.remove(i);
                System.out.println(stocks.get(i)+"Foi removido");
                break;
            }
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



