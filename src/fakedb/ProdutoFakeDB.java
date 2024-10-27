package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Produto>();
        this.tabela.add(new Produto(100, "Coca Cola", LocalDate.now(), 10, 10.00));
        this.tabela.add(new Produto(200, "Coxão Mole", LocalDate.now(), 20, 30.00));
        this.tabela.add(new Produto(300, "Italac", LocalDate.now(), 30, 6.00));
        this.tabela.add(new Produto(400, "Protex", LocalDate.now(), 40, 3.00));
        this.tabela.add(new Produto(500, "Pinho Sol", LocalDate.now(), 50, 4.00));

    }

    public ProdutoFakeDB() {
        super();
    }
}
