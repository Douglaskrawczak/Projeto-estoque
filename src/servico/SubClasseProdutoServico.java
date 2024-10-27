package servico;

import java.util.ArrayList;

import dominio.SubClasseProduto;
import repositorio.SubClasseProdutoRepositorio;

public class SubClasseProdutoServico extends BaseServico<SubClasseProduto> {
    private SubClasseProdutoRepositorio repositorio;

    public SubClasseProdutoServico() {
        this.repositorio = new SubClasseProdutoRepositorio();

    }

    @Override
    public ArrayList<SubClasseProduto> LerTodos() {
        return this.repositorio.ReadAll();

    }

    @Override
    public SubClasseProduto Ler(int chave) {
        return this.repositorio.Read(chave);

    }

    @Override
    public SubClasseProduto Atualizar(SubClasseProduto obj) {
        return this.repositorio.Update(obj);

    }

    @Override
    public SubClasseProduto Criar(SubClasseProduto obj) {
        return this.repositorio.Create(obj);

    }

    @Override
    public SubClasseProduto Deletar(int chave) {
        return this.repositorio.Delete(chave);

    }

}
