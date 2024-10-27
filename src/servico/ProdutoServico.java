package servico;

import java.util.ArrayList;

import dominio.Produto;
import repositorio.ProdutoRepositorio;

public class ProdutoServico extends BaseServico<Produto> {
    private ProdutoRepositorio repositorio;

    public ProdutoServico() {
        this.repositorio = new ProdutoRepositorio();
    }

    @Override
    public ArrayList<Produto> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Produto Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public Produto Atualizar(Produto obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Produto Criar(Produto obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Produto Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
