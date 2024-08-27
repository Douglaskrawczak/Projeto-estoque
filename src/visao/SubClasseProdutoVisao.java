package visao;

import java.time.LocalDate;

import dominio.SubClasseProduto;

public class SubClasseProdutoVisao {
    public SubClasseProdutoVisao() {
    }

    public void Exibir() {
        SubClasseProduto scp1 = new SubClasseProduto();

        scp1.setCodigo(1);
        scp1.setDescricao("Refrigerante");
        scp1.setDataDeInclusao(LocalDate.now());

        System.out.println("SubClasse 1 de Produto");
        System.out.println("Código:" + scp1.getCodigo());
        System.out.println("Descrição:" + scp1.getDescricao());
        System.out.println("Data de Inclusão:" + scp1.getDataDeInclusao());

        SubClasseProduto scp2 = new SubClasseProduto();

        scp2.setCodigo(2);
        scp2.setDescricao("Sucos");
        scp2.setDataDeInclusao(LocalDate.now());

        System.out.println("SubClasse 2 de Produto");
        System.out.println("Código:" + scp2.getCodigo());
        System.out.println("Descrição:" + scp2.getDescricao());
        System.out.println("Data de Inclusão:" + scp2.getDataDeInclusao());

        SubClasseProduto scp3 = new SubClasseProduto();

        scp3.setCodigo(3);
        scp3.setDescricao("Cervejas");
        scp3.setDataDeInclusao(LocalDate.now());

        System.out.println("SubClasse 3 de Produto");
        System.out.println("Código:" + scp3.getCodigo());
        System.out.println("Descrição:" + scp3.getDescricao());
        System.out.println("Data de Inclusão:" + scp3.getDataDeInclusao());

        SubClasseProduto scp4 = new SubClasseProduto();

        scp4.setCodigo(4);
        scp4.setDescricao("Destiladas");
        scp4.setDataDeInclusao(LocalDate.now());

        System.out.println("SubClasse 4 de Produto");
        System.out.println("Código:" + scp4.getCodigo());
        System.out.println("Descrição:" + scp4.getDescricao());
        System.out.println("Data de Inclusão:" + scp4.getDataDeInclusao());

    }
}
