package model.entites;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Stock {
    Product product;
    HashMap<Integer ,Product> stocks= new HashMap<>();

    public Stock(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

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

    public void increaseQuantity(int quantity){
        product.setQuantity(product.getQuantity()+quantity);
    }

    public  Product searchProductid(Integer id){
        return stocks.get(id);
    }

    public  Product searchProductName(String name){
        return (Product) stocks.values().stream().filter(x->name.equals(product.getName())).collect(Collectors.toList());
    }

    public void listAllProducts(){
        for(Integer i:stocks.keySet()){
            System.out.println(i+":"+stocks.get(i));
        }
    }
    }


