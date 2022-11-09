package Entidades;

public class Fornecedor{
public String CNPj;
public String telefone;
public String nome;


public Fornecedor(String cNPj, String telefone, String nome) {
    this.CNPj = cNPj;
    this.telefone = telefone;
    this.nome = nome;
}
public String getCNPj() {
    return CNPj;
}
public void setCNPj(String cNPj) {
    CNPj = cNPj;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

}

