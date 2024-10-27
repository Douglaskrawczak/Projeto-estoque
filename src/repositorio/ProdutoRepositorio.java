package repositorio;

import dominio.Produto;
import fakedb.ProdutoFakeDB;

public class ProdutoRepositorio extends BaseRepositorio<Produto> {
    private ProdutoFakeDB db;

    public ProdutoRepositorio() {
        this.db = new ProdutoFakeDB();
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public Produto Create(Produto instacia) {
        int proxChave = this.fonteDeDados.getLast().getCodigo() + 1;
        instacia.setCodigo(proxChave);
        this.fonteDeDados.add(instacia);
        return instacia;

    }

    @Override
    public Produto Read(int chave) {
        for (Produto cp : this.fonteDeDados) {
            if (cp.getCodigo() == chave) {
                return cp;
            }

        }
        return null;

    }

    @Override
    public Produto Update(Produto instacia) {
        Produto cp = Read(instacia.getCodigo());
        if (cp != null) {
            cp.setDescricao(instacia.getDescricao());
            return cp;
        } else {
            return null;
        }

    }

    @Override
    public Produto Delete(int chave) {
        Produto cp = this.Read(chave);
        if (cp != null) {
            this.fonteDeDados.remove(cp);
            return cp;
        } else {
            return null;
        }
    }

}
