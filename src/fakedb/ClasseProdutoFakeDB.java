package fakedb;

import dominio.ClasseProduto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<ClasseProduto>();
        this.tabela.add(new ClasseProduto(1, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Laticinios", LocalDate.now()));
        this.tabela.add(new ClasseProduto(4, "Higiene", LocalDate.now()));
        this.tabela.add(new ClasseProduto(5, "Limpeza", LocalDate.now()));

    }

    public ClasseProdutoFakeDB() {
        super();
    }

}
