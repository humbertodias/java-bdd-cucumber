package cucumber.model;

import java.util.List;

public class Bank {

    private String nome;
    private List<Account> listaDeContas;

    public Bank(String nome, List<Account> listaDeContas) {
        this.nome = nome;
        this.listaDeContas = listaDeContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Account> getListaDeContas() {
        return listaDeContas;
    }

    public void setListaDeContas(List<Account> listaDeContas) {
        this.listaDeContas = listaDeContas;
    }
}
