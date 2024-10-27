package repositorio;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoRepositorio extends BaseRepositorio<ClasseProduto> {

    private ClasseProdutoFakeDB db;

    public ClasseProdutoRepositorio() {
        this.db = new ClasseProdutoFakeDB();
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public ClasseProduto Create(ClasseProduto instacia) {
        int proxChave = this.fonteDeDados.getLast().getCodigo() + 1;
        instacia.setCodigo(proxChave);
        this.fonteDeDados.add(instacia);
        return instacia;
    }

    @Override
    public ClasseProduto Read(int chave) {
        for (ClasseProduto cp : this.fonteDeDados) {
            if (cp.getCodigo() == chave) {
                return cp;
            }
        }
        return null;
    }

    @Override
    public ClasseProduto Update(ClasseProduto instacia) {
        ClasseProduto cp = this.Read(instacia.getCodigo());
        if (cp != null) {
            cp.setDescricao(instacia.getDescricao());
            return cp;
        } else {
            return null;
        }
    }

    @Override
    public ClasseProduto Delete(int chave) {
        ClasseProduto cp = this.Read(chave);
        if (cp != null) {
            this.fonteDeDados.remove(cp);
            return cp;
        } else {
            return null;
        }
    }

}
