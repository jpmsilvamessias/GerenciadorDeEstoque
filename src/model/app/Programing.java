package model.app;

import model.entites.ManagementeStock;
import model.entites.Product;
import model.entites.Stock;
import model.enums.Types;

import java.net.Proxy;
import java.util.Locale;
import java.util.Scanner;

public class Programing {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        Stock stock= new Stock();
        ManagementeStock management= new ManagementeStock();
        System.out.println("Seja bem vindo ao sistema de cadastro de produtos");
        int decisao=0;
        while(decisao!=7){
            System.out.println("1-Adcionar produto,2-remover produto,3-aumentar quantidade,4-procurar produto por id," +
                    "5-procurar produto por nome,6-Listar todos os produtos,7-sair"
            );
            decisao= sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Nome:");
                    String name=sc.next();
                    System.out.println("Categoria: Eletronico,Eletrodomestico,Moveis");
                    String cate=sc.next();
                    System.out.println("Id");
                    int id=sc.nextInt();
                    System.out.println("Quantidade");
                    int quantity=sc.nextInt();
                    System.out.println("Preço");
                    double price= sc.nextDouble();
                    Product product= new Product(name, Types.valueOf(cate),id,quantity,price);
                    stock.addStock(product);
                    management.entryProduct(product);
                case 2:
                    System.out.println("Insira o Id para ser removido");
                    int idr= sc.nextInt();
                    stock.RemoveStock(idr);
                case 3:

            }
        }

    }
}
