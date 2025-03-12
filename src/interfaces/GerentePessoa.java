package interfaces;

import pessoas.Pessoa;

public interface GerentePessoa {

    void adicionarPessoa(Pessoa p);

    void removerPessoa(String CPF);

    void buscarPessoa(String CPF);
}
