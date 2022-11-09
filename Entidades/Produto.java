package Entidades;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

public class Produto {
    private Integer codigo;
    private String nome;
    private float valor;

    public Produto(Integer codigo, String nome, float valor) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = (float) valor;
    }

    public static float atualizarPreco(){
        float porcentagem = this.valor/100;
        float valorAtualizado = this.valor * porcentagem;

        return valorAtualizado;
    }
    
    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getValor() {
        return valor;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }

 


  
}