package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<Tdominio> {

    protected ArrayList<Tdominio> tabela;

    // Propriedade Somente Leitura (Read-only)
    public ArrayList<Tdominio> getTabela() {
        return tabela;
    }

    // 1 - métodos abstract não podem ter código.
    // 2- métodos abstract devem ser implementados nas classes filhas(reais).
    // 3-este método deve ser executado toda vez que a classe filha for intanciada.
    protected abstract void preencherDados();

    public BaseFakeDB() {
        this.preencherDados();
    }

}
