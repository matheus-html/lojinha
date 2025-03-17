package gestao;

import interfaces.GerentePessoa;
import interfaces.GerenteProduto;
import produtos.Produto;
import java.util.ArrayList;

import pessoas.*;


public class Gestor implements GerentePessoa, GerenteProduto {

    protected ArrayList<Pessoa> pessoas = new ArrayList<>();
    protected ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(String CPF) {
        pessoas.removeIf(p -> p.getCPF().equals(CPF));
    }

    public void buscarPessoa(String CPF) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF)) {
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    @Override
    public void removerProduto(String codigo) {
        produtos.removeIf(c -> c.getCodigo().equals(codigo));
    }

    @Override
    public void buscarProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                System.out.println("Produto encontrado:");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void qntPessoas(){
        System.out.println("Quantidade de pessoas cadastradas: "+pessoas.size());
    }

    public void mostrarPessoa() {
        for(Pessoa pessoa: pessoas) {
            pessoa.mostrar();
        }
    }

    public void mostrarProduto() {
        for(Produto produto: produtos) {
            produto.exibirDetalhes();
        }
    }
}
