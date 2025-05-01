package model.entites;

import model.enums.Types;

public class Product {
    String name;
    Types category;
    Integer id;
    Integer quantity;
    Double price;

    public Product(String name, Types category, Integer id, Integer quantity, Double price) {
        this.name = name;
        this.category = category;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Types getCategory() {
        return category;
    }

    public void setCategory(Types category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
