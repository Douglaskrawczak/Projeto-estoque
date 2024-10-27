package repositorio;

import dominio.SubClasseProduto;
import fakedb.SubClasseProdutoFakeDB;

public class SubClasseProdutoRepositorio extends BaseRepositorio<SubClasseProduto> {
    private SubClasseProdutoFakeDB db;

    public SubClasseProdutoRepositorio() {
        this.db = new SubClasseProdutoFakeDB();
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public SubClasseProduto Create(SubClasseProduto instacia) {
        int proxChave = this.fonteDeDados.getLast().getCodigo() + 1;
        instacia.setCodigo(proxChave);
        this.fonteDeDados.add(instacia);
        return instacia;

    }

    @Override
    public SubClasseProduto Read(int chave) {
        for (SubClasseProduto cp : this.fonteDeDados) {
            if (cp.getCodigo() == chave) {
                return cp;
            }

        }
        return null;

    }

    @Override
    public SubClasseProduto Update(SubClasseProduto instacia) {
        SubClasseProduto cp = Read(instacia.getCodigo());
        if (cp != null) {
            cp.setDescricao(instacia.getDescricao());
            return cp;
        } else {
            return null;
        }
    }

    @Override
    public SubClasseProduto Delete(int chave) {
        SubClasseProduto cp = this.Read(chave);
        if (cp != null) {
            this.fonteDeDados.remove(cp);
            return cp;
        } else {
            return null;
        }
    }

}
