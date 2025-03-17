import java.util.Scanner;
import pessoas.*;
import gestao.Gestor;


public class ControladorMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gestor gestao = new Gestor();

        while (true) {
            System.out.printf("Lojinha\nDigite o número da ação desejada:\n\n");
            System.out.println("1. Gerenciar pessoas:");
            System.out.println("2. Gerenciar produtos:");
            System.out.println("3. Limpar Console");
            System.out.println("4. Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Gerenciar pessoas:\n");
                    System.out.println("Digite o número da ação desejada:");
                    System.out.println("1. Adicionar pessoa:");
                    System.out.println("2. Lista de pessoas:");
                    System.out.println("3. Atualizar pessoa:");
                    System.out.println("4. Excluir pessoa:");
                    System.out.println("5. Voltar ao menu principal:");

                    switch (sc.nextInt()) {
                        case 1:
                            sc.nextLine();
                            System.out.print("Digite o nome da pessoa: ");
                            String nome = sc.nextLine();
                            System.out.print("Digite o CPF da pessoa: ");
                            String CPF = sc.nextLine();
                            System.out.println("Digite o código da pessoa: ");
                            String codigo = sc.nextLine();
                            gestao.adicionarPessoa(new Pessoa(nome, CPF, codigo));
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("Lista de pessoas:");
                            gestao.qntPessoas();
                            gestao.mostrarPessoa();


                    }

                case 2:
                    System.out.println("Gerenciar Produto:");
                    System.out.println("Digite o número da ação desejada:");
                    System.out.println("1. Adicionar produto:");
                    System.out.println("2. Lista de produtos:");
                    System.out.println("3. Atualizar produto:");
                    System.out.println("4. Excluir produto:");
                    System.out.println("5. Voltar ao menu principal:");
            }
        }
    }
}
