package visao;

import java.time.LocalDate;

import dominio.Produto;

public class ProdutoVisao {
    public ProdutoVisao() {
    }

    public void Exibir() {
        // refrigerantes

        Produto p1 = new Produto();

        p1.setCodigo(10);
        p1.setDescricao("Coca Cola");
        p1.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 1");
        System.out.println("Código:" + p1.getCodigo());
        System.out.println("Descrição:" + p1.getDescricao());
        System.out.println("Data de Inclusão:" + p1.getDataDeInclusao());

        p1.setCodigo(11);
        p1.setDescricao("Fanta Laranja");
        p1.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 1");
        System.out.println("Código:" + p1.getCodigo());
        System.out.println("Descrição:" + p1.getDescricao());
        System.out.println("Data de Inclusão:" + p1.getDataDeInclusao());

        p1.setCodigo(12);
        p1.setDescricao("Kuat");
        p1.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 1");
        System.out.println("Código:" + p1.getCodigo());
        System.out.println("Descrição:" + p1.getDescricao());
        System.out.println("Data de Inclusão:" + p1.getDataDeInclusao());

        p1.setCodigo(13);
        p1.setDescricao("Sprite");
        p1.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 1");
        System.out.println("Código:" + p1.getCodigo());
        System.out.println("Descrição:" + p1.getDescricao());
        System.out.println("Data de Inclusão:" + p1.getDataDeInclusao());

        // sucos

        Produto p2 = new Produto();

        p2.setCodigo(20);
        p2.setDescricao("Del Valle");
        p2.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 2");
        System.out.println("Código:" + p2.getCodigo());
        System.out.println("Descrição:" + p2.getDescricao());
        System.out.println("Data de Inclusão:" + p2.getDataDeInclusao());

        p2.setCodigo(21);
        p2.setDescricao("Marata");
        p2.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 2");
        System.out.println("Código:" + p2.getCodigo());
        System.out.println("Descrição:" + p2.getDescricao());
        System.out.println("Data de Inclusão:" + p2.getDataDeInclusao());

        p2.setCodigo(22);
        p2.setDescricao("Nutri Néctar");
        p2.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 2");
        System.out.println("Código:" + p2.getCodigo());
        System.out.println("Descrição:" + p2.getDescricao());
        System.out.println("Data de Inclusão:" + p2.getDataDeInclusao());

        p2.setCodigo(23);
        p2.setDescricao("Maguary");
        p2.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 2");
        System.out.println("Código:" + p2.getCodigo());
        System.out.println("Descrição:" + p2.getDescricao());
        System.out.println("Data de Inclusão:" + p2.getDataDeInclusao());

        // cervejas

        Produto p3 = new Produto();

        p3.setCodigo(30);
        p3.setDescricao("Corona Extra");
        p3.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 3");
        System.out.println("Código:" + p3.getCodigo());
        System.out.println("Descrição:" + p3.getDescricao());
        System.out.println("Data de Inclusão:" + p3.getDataDeInclusao());

        p3.setCodigo(31);
        p3.setDescricao("Heineken");
        p3.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 3");
        System.out.println("Código:" + p3.getCodigo());
        System.out.println("Descrição:" + p3.getDescricao());
        System.out.println("Data de Inclusão:" + p3.getDataDeInclusao());

        p3.setCodigo(32);
        p3.setDescricao("Budweiser");
        p3.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 3");
        System.out.println("Código:" + p3.getCodigo());
        System.out.println("Descrição:" + p3.getDescricao());
        System.out.println("Data de Inclusão:" + p3.getDataDeInclusao());

        p3.setCodigo(33);
        p3.setDescricao("Brahma");
        p3.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 3");
        System.out.println("Código:" + p3.getCodigo());
        System.out.println("Descrição:" + p3.getDescricao());
        System.out.println("Data de Inclusão:" + p3.getDataDeInclusao());

        // destiladas

        Produto p4 = new Produto();

        p4.setCodigo(40);
        p4.setDescricao("Whisky");
        p4.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 4");
        System.out.println("Código:" + p4.getCodigo());
        System.out.println("Descrição:" + p4.getDescricao());
        System.out.println("Data de Inclusão:" + p4.getDataDeInclusao());

        p4.setCodigo(41);
        p4.setDescricao("Vodka");
        p4.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 4");
        System.out.println("Código:" + p4.getCodigo());
        System.out.println("Descrição:" + p4.getDescricao());
        System.out.println("Data de Inclusão:" + p4.getDataDeInclusao());

        p4.setCodigo(42);
        p4.setDescricao("Tequila");
        p4.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 4");
        System.out.println("Código:" + p4.getCodigo());
        System.out.println("Descrição:" + p4.getDescricao());
        System.out.println("Data de Inclusão:" + p4.getDataDeInclusao());

        p4.setCodigo(43);
        p4.setDescricao("Hidromel");
        p4.setDataDeInclusao(LocalDate.now());

        System.out.println("Produto 4");
        System.out.println("Código:" + p4.getCodigo());
        System.out.println("Descrição:" + p4.getDescricao());
        System.out.println("Data de Inclusão:" + p4.getDataDeInclusao());

    }

}
