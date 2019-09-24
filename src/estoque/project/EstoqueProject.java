/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.project;

import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;
import static service.Util.comprar;
import static service.Util.menu;
import static service.Util.restrito;
import static service.Util.verEstoque;
import static service.Util.exibeEstoque;

/**
 *
 * @author Pedro
 */
public class EstoqueProject {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException {

        //puxa o scanner
        Scanner teclado = new Scanner(System.in);

        //definindo um estoque
        ArrayList<Produto> estoque = new ArrayList();

        // cria os objetos produtos
        Produto produto = new Produto("Arroz", 10, 2, 1, 3);
        Produto produto2 = new Produto("Farinha", 15, 5, 2, 4);
        Produto produto3 = new Produto("Canha", 30, 10, 1, 4);
        Produto produto4 = new Produto("Feijão", 10, 3, 3, 6);

        //adiciona os produtos no array
        estoque.add(produto);
        estoque.add(produto2);
        estoque.add(produto3);
        estoque.add(produto4);

        /**
         * for estoque.forEach((p) -> { System.out.println(p.getNome());
         * System.out.println(p.getQuant());
         * System.out.println(p.getEstoqueMin());
         * System.out.println(p.getValorVenda()); });
         */
        int select = 0;
        do {
            menu();

            select = teclado.nextInt();

            switch (select) {
                case 1:
                    comprar();
                    break;
                case 2:
                    verEstoque();
                    break;
                case 3:
                    restrito();
                    break;

            }
        } while (select != 9);

    }
}
