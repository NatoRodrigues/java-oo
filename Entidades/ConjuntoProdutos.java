package Entidades;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

public class ConjuntoProdutos{

    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static String incluirItems(){

      this.produtos.add(new Produto(null, null, 0));
      final String addLista = incluirItems();
        return addLista;
    }

      public static String removerItems(){
      this.produtos.remove(produtos);
      final String addLista = incluirItems();
        return addLista;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public static void incluirItems(Object addLista) {
    }
}