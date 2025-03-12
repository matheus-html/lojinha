package interfaces;

import produtos.Produto;

public interface GerenteProduto {
    void adicionarProduto(Produto produto);

    void removerProduto(String codigo);

    void buscarProduto(String codigo);
}
