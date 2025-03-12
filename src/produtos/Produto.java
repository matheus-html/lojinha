package produtos;

public class Produto {

    protected String nome;
    protected String preco;
    protected String codigo;

    public Produto(String nome, String preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibirDetalhes() {
        System.out.println("Roupa: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Código: " + getCodigo());
    }
}
