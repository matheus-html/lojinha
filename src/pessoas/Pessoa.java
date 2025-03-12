package pessoas;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected String codigo;

    public Pessoa(String nome, String CPF, String codigo) {
        this.nome = nome;
        this.CPF = CPF;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void mostrar() {
        System.out.println("Nome:" + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Codigo: "+ codigo);
    }
}
