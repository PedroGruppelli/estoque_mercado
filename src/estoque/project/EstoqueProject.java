/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.project;

import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class EstoqueProject {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

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
            System.out.println("+------ Mercado JavaLover ------+");
            System.out.println("|                                |");
            System.out.println("|     **   Área do cliente **    |");
            System.out.println("|                                |");
            System.out.println("|      1 - Realizar compra       |");
            System.out.println("|      2 - Ver estoque           |");
            System.out.println("|      3 - Área Restrita         |");
            System.out.println("|      9 - Sair/Cancelar         |");
            System.out.println("|                                |");
            System.out.println("+--------------------------------+");
            System.out.println("Digite aqui ");


            select = teclado.nextInt();
            
            switch (select) {
                case 1:
                    System.out.println("+------ Mercado JavaLovers ------+");
                    System.out.println("|                                |");
                    System.out.println("|     **   Área do cliente **    |");
                    System.out.println("|                                |");
                    System.out.println("|  QUAL PRODUTO DESEJA COMPRAR?  |");
                    System.out.println(estoque);
                    System.out.println("|                                |");
                    System.out.println("+--------------------------------+");
                    System.out.println("Digite aqui ");
                    break;
                case 2:
                    System.out.println("+------ Mercado JavaLovers ------+");
                    System.out.println("|                                |");
                    System.out.println("|     **   Área do cliente **    |");
                    System.out.println("|                                |");
                    System.out.println("|       PRODUTOS EM ESTOQUE       ");
                    System.out.println(estoque);
                    System.out.println("|                                |");
                    System.out.println("+--------------------------------+");
                    System.out.println("Digite aqui ");
                    break;
                case 3:
                    System.out.println("                    ");
                    System.out.println("Informe a senha (númerica): ");
                    int senha = teclado.nextInt();
                    if (senha == 69) {
                        System.out.println("  ***BEM VINDO A ÁREA RESTRITA***  ");
                        System.out.println("+****** Mercado JavaLovers ******+");
                        System.out.println("|                                |");
                        System.out.println("|     **  Área Restrita  **      |");
                        System.out.println("|                                |");
                        System.out.println("|      1 - Adicionar Cliente     |");
                        System.out.println("|      2 - Excluir Cliente       |");
                        System.out.println("|      3 - Adicionar Produto     |");
                        System.out.println("|      4 - Excluir Produto       |");
                        System.out.println("|      9 - Sair/Cancelar         |");
                        System.out.println("|                                |");
                        System.out.println("+********************************+");
                    } else if (senha != 69) {
                        System.out.println("Senha incorreta...bye bye!");
                    } 
                        break;
              
            }
            }while (select != 9);
            
  

        }
    }

