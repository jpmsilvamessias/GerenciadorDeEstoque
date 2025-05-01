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

    public void increaseQuantity(Product product,int quantity){
        product.setQuantity(product.getQuantity()+quantity);
    }

    public  Product searchProductid(Integer id){
        return stocks.get(id);
    }

    public  Product searchProductName(Product product,String name){
        return (Product) stocks.values().stream().filter(x->name.equals(product.getName())).collect(Collectors.toList());
    }

    public void listAllProducts(){
        for(Integer i:stocks.keySet()){
            System.out.println(i+":"+stocks.get(i));
        }
    }
    }


