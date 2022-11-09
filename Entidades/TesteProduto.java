package Entidades;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

public class TesteProduto {
    private Produto produto;
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    private Fornecedor fornecedor;
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public TesteProduto(Produto produto, Fornecedor fornecedor) {
        this.produto = produto;
        this.fornecedor = fornecedor;
    }
    }
    