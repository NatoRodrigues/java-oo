package Principal;


import java.util.Scanner;

import Entidades.ConjuntoProdutos;
import Entidades.Fornecedor;
import Entidades.Produto;


public class Principal {

    public static void main(String[] args) {
        Fornecedor forn1 = new Fornecedor("21.669.817/0001-27", "819999999", "Marcos");
        Fornecedor forn2 = new Fornecedor("81.670.603/0001-00", "819512387", "Cláudio");

        Produto produto1 = new Produto(1, "TV LCD", (float) 3500.00);
        Produto produto2 = new Produto(2, "NOTEBOOK", (float) 2000.00);
        Produto produto3 = new Produto(3, "impressora", (float) 232.00);




        int escolha;
        System.out.println("(1)Deseja cadastrar um produto? \n");
        System.out.println("(2)Deseja remover um produto? \n");
        System.out.println("(3)Deseja atualizar valor de um produto? \n");
        System.out.println("(4)Exibir produtos e seus respectivos fornecedores");

        try (Scanner ler = new Scanner(System.in)) {
            escolha = ler.nextInt();
        }
            do{
        if(escolha == 1 || escolha == 4){
        switch(escolha) {
            case 1:
                ConjuntoProdutos.incluirItems();
              break;
            case 2:
                ConjuntoProdutos.removerItems();
              break;
            case 3:
                Produto.atualizarPreco();
            case 4:
                System.out.println("Fornecedor 1: \n");
                produto1.getNome().toString();
                forn1.getNome().toString();

                System.out.println("Fornecedor 2: \n");
                produto2.getNome().toString();
                produto3.getNome().toString();
                forn2.getNome().toString();

            default:
              System.out.println("Digite uma opção válida!");
          }
        }
    }while(escolha > 4);              
    }
}
