package application;

import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        sc.nextLine();
        System.out.print ("Digite o Nome do Produto: ");
        product.name = sc.nextLine();
        System.out.print ("Digite o Preço do Produto: ");
        product.price = sc.nextDouble();
        System.out.print ("Digite a Quantidade do Produto: ");
        product.quantity = sc.nextInt();

        System.out.println ("PAINEL DE CONTROLE");
        System.out.println ("Digite : [1] Ver Info do Produto");
        System.out.println ("Digite : [1] Ver valor do Estoque desse Produto");
        System.out.println ("Digite : [2] Adicionar quantidade desse produto ao Estoque");
        System.out.println ("Digite : [3] Remover quantidade desse produto do Estoque");

        int acao = sc.nextInt();

        if (acao==1) {
            product.ShowProducts();
        }
        if (acao==2) {
            System.out.println("Valor do Estoque:" + product.StockPrice());
        }
        if (acao==3) {
            System.out.println("Digite valor a Adicionar");
            int quantity = sc.nextInt();
            product.AddProduct(quantity);
        }
        if (acao==4) {
            System.out.println("Digite valor a Remover");
            int quantity = sc.nextInt();
            product.RemoveProduct(quantity);
        }

        sc.close();
    }
}