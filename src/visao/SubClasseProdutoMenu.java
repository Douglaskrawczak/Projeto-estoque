package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.SubClasseProduto;
import servico.SubClasseProdutoServico;

public class SubClasseProdutoMenu extends BaseMenu {

    private SubClasseProdutoServico srv;

    public SubClasseProdutoMenu() {

        super();
        this.srv = new SubClasseProdutoServico();

    }

    @Override
    public void ExibirMenu() {
        int opção = 0;
        while (opção != 9) {
            System.out.println("Classe Produto:");
            System.out.println("=================");
            System.out.println("Menu de Opções:");
            System.out.println("=================");
            System.out.println("1 Listar:");
            System.out.println("2 Localizar:");
            System.out.println("3 Adicionar:");
            System.out.println("4 Atualizar:");
            System.out.println("5 Remover:");
            System.out.println("9 sair:");
            System.out.println("Digite sua opção:");
            opção = scanner.nextInt();

            switch (opção) {
                case 1:
                    Listar();
                    break;

                case 2:
                    Localizar();
                    break;

                case 3:
                    Adicionar();
                    break;

                case 4:
                    Atualizar();
                    break;

                case 5:
                    Remover();
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

    }

    @Override
    public void Listar() {

        Util.ClearConsole();
        System.out.println("Listando...");
        ArrayList<SubClasseProduto> lista = srv.LerTodos();
        for (SubClasseProduto cp : lista) {
            this.Imprimir(cp);
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    @Override
    public void Localizar() {

        Util.ClearConsole();
        System.out.println("Localizando...");

        System.out.print("Informe o Código da Classe Produto:");
        int codigo = scanner.nextInt();

        SubClasseProduto cp = this.srv.Ler(codigo);

        if (cp != null) {
            Imprimir(cp);
        } else {
            System.out.println("Problema - Classe não Encontrada...");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    @Override
    public void Adicionar() {
        Util.ClearConsole();
        System.out.println("Adicionando...");

        System.out.print("Imforme a Descrição da Classe de Produto:");
        String descricao = scanner.next();

        SubClasseProduto cp = new SubClasseProduto();
        cp.setCodigo(0);
        cp.setDescricao(descricao);
        cp.setDataDeInclusao(LocalDate.now());

        SubClasseProduto cpNovo = this.srv.Criar(cp);

        if (cpNovo != null) {
            System.out.println("Classe de Produto adicionada com sucesso");
        } else {
            System.out.println("Problema - Classe de Produto não foi adicionada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    @Override
    public void Atualizar() {

        Util.ClearConsole();
        System.out.println("Atualizando...");

        System.out.println("Informe o código da Classe Produto:");

        int codigo = scanner.nextInt();

        SubClasseProduto cp = this.srv.Ler(codigo);
        if (cp != null) {
            System.out.print("Informe a nova Descrição para esta Classe de Produto: ");
            String descricao = scanner.next();
            cp.setDescricao(descricao);
            if (this.srv.Atualizar(cp) != null) {
                System.out.println("Classe de Produto atualizada com sucesso");
            } else {
                System.out.println("Problema - Classe de Produto não foi atualizada");
            }
        } else {
            System.out.println("Problema - Classe de Produto não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    @Override
    public void Remover() {

        Util.ClearConsole();
        System.out.println("Removendo...");

        System.out.print("Informe o código da Classe de Produto: ");
        int codigo = scanner.nextInt();

        SubClasseProduto cp = this.srv.Ler(codigo);
        if (cp != null) {
            if (this.srv.Deletar(codigo) != null) {
                System.out.println("Classe de Produto removida com sucesso");
            } else {
                System.out.println("Problema - Classe de Produto não foi removida");
            }
        } else {
            System.out.println("Problema - Classe de Produto não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private void Imprimir(SubClasseProduto cp) {
        System.out.println("Classe de Produto:");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Data de Inclusão: " + cp.getDataDeInclusao());
        System.out.println("-------------------------------------------------------");
    }
}
