package model.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManagementeStock {
    DateTimeFormatter dfm= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date=LocalDate.now();
    String dateFormat= dfm.format(date);


    public void entryProduct(Product p){
        System.out.println(p.getName()+"Entrou no estoque:"+dateFormat);
    }
}
