package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.SubClasseProduto;

public class SubClasseProdutoFakeDB extends BaseFakeDB<SubClasseProduto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<SubClasseProduto>();
        this.tabela.add(new SubClasseProduto(10, "Refrigerante", LocalDate.now(), 1));
        this.tabela.add(new SubClasseProduto(20, "Bovina", LocalDate.now(), 2));
        this.tabela.add(new SubClasseProduto(30, "Leite", LocalDate.now(), 3));
        this.tabela.add(new SubClasseProduto(40, "Sabonete", LocalDate.now(), 4));
        this.tabela.add(new SubClasseProduto(50, "Desinfetante", LocalDate.now(), 5));
    }

    public SubClasseProdutoFakeDB() {
        super();
    }

}
