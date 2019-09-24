package service;

import java.util.Scanner;
import estoque.project.EstoqueProject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pedro
 */
public class Util {

    
    public static void menu() {
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

    }

    public static void comprar() {
        System.out.println("+------ Mercado JavaLovers ------+");
        System.out.println("|                                |");
        System.out.println("|     **   Área do cliente **    |");
        System.out.println("|                                |");
        System.out.println("|  QUAL PRODUTO DESEJA COMPRAR?  |");
        System.out.println();
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");
        System.out.println("Digite aqui ");
    }

    public static void verEstoque() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("+------ Mercado JavaLovers ------+");
        System.out.println("|                                |");
        System.out.println("|     **   Área do cliente **    |");
        System.out.println("|                                |");
        System.out.println("|       PRODUTOS EM ESTOQUE       ");
        System.out.println();
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");
        System.out.println("*Aperte qualquer botão para voltar ao menu *");
        System.out.println("Digite aqui ");
        int wat = teclado.nextInt();
    }

    public static void restrito() throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("                    ");
        System.out.println("Informe a senha (númerica): ");
        int senha = teclado.nextInt();
        
              if (senha == 69) {
           Thread.sleep(2000);
            System.out.println("**SENHA CORRETA**");
            Thread.sleep(1000);
            System.out.println("    ***    ÁREA RESTRITA***  ");
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
                  System.out.println("Digite aqui:");
            int opc = teclado.nextInt();
                  if (opc == 1){
                      adicionarcliente();
                  } else if (opc == 2) {
                      excluircliente();
                  } else if (opc ==3){
                      adicionarProduto();
                  } else if (opc == 4){
                      excluirProduto();
                  }
            
        } else {
            Thread.sleep(2000);      
            System.out.println("Senha incorreta...bye bye!");
        }
    }

    public static void consultar() {
        System.out.println("Você entrou na área restrita.");
    }
    public static void adicionarcliente(){
        
    }
    public static void excluircliente(){
        
    }
    public static void adicionarProduto(){
        
    }
    public static void excluirProduto(){
        
    }
    public static void exibeEstoque(){
        for (int i = 0; i < estoque.size(); i++) {
			System.out.println(estoque.get(i));

		}
    }

}
