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
                    break;
                case 2:
                    System.out.println("Insira o Id para ser removido");
                    int idr= sc.nextInt();
                    stock.removeStock(idr);
                    break;
                case 3:
                    System.out.println("Passe a id do produto para aumentar a quantidade");
                    int idq= sc.nextInt();
                    System.out.println("Insira a quantidade");
                    int quan= sc.nextInt();
                    stock.increaseQuantity(idq,quan);
                    break;
                case 4:
                    System.out.println("Insira o id para buscarmos");
                    int idb = sc.nextInt();
                    Product p = stock.searchProductid(idb);
                    if (p != null) {
                        System.out.println("Produto encontrado: " + p.getName() + ", Qtd: " + p.getQuantity());
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Buscar produto por nome");
                    String nameb= sc.next();
                    Product s=stock.searchProductName(nameb);
                    if(s!=null){
                        System.out.println("Produto encontrado: " + s.getName() + ", Qtd: " + s.getQuantity());
                    }else{
                        System.out.println("Produto nao encontrado");
                    }

                    break;
                case 6:
                    System.out.println("Vamos listar todos os items");
                    stock.listAllProducts();
                    break;
            }
        }

    }
}
